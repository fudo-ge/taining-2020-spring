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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/modify/{employeeId:\\d+}")
public class EmployeeModifyController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	@ModelAttribute
	public Employee setUpEmployee(@PathVariable Integer employeeId) {
		return employeeService.findById(employeeId);
	}

	@ModelAttribute
	public DepartmentList setUpDepartmentList() {
		return departmentService.listOf();
	}

	@GetMapping
	public String form() {
		return "employee/modify/form";
	}

	@PostMapping
	public String confirm(@Validated @ModelAttribute Employee employee, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "employee/modify/form";
		}
		return "employee/modify/confirm";
	}

	@PostMapping("back")
	public String backToForm(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("employee", employee);
		return String.format("redirect:/employee/modify/%s", employee.getId().getValue());
	}

	@PostMapping("update")
	public String insert(@ModelAttribute Employee employee) {
		employeeService.update(employee);
		return String.format("redirect:/employee/%s", employee.getId().getValue());
	}
}
