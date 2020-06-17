package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import example.training.model.department.DepartmentList;
import example.training.model.employee.ConfirmationEmployee;
import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeFactory;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/modify")
@SessionAttributes(types = ConfirmationEmployee.class)
public class EmployeeModifyController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeFactory employeeFactory;

	@GetMapping("{employeeId:\\d+}")
	public String form( @PathVariable Integer employeeId, Model model ) {

		Employee employee = employeeService.findById(employeeId);
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("departmentList", departmentList);
		model.addAttribute( "employee", employee );
		return "employee/modify/form";
	}

	@PostMapping
	public String confirm(@Validated @ModelAttribute Employee employee, BindingResult result, Model model) {
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("employee", employee);
		model.addAttribute("departmentList", departmentList);
		if(result.hasErrors()) {
			return "employee/modify/form";
		}
		ConfirmationEmployee confirmationEmployee = employeeFactory.confirmationCreate();
		confirmationEmployee.setAll(employee);
		model.addAttribute( "confirmationEmployee", confirmationEmployee );
		return "employee/modify/confirm";
	}

	@PostMapping("update")
	public String insert(@ModelAttribute Employee employee, ConfirmationEmployee confirmationEmployee,
			SessionStatus sessionStatus) {
		if(confirmationEmployee.isSame(employee)) {
			sessionStatus.setComplete();
			employeeService.update(employee);
			return String.format("redirect:/employee/%s", employee.getId().getValue());
		}
		sessionStatus.setComplete();
		return "employee/modify/confirm-error";
	}
}
