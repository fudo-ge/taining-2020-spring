package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/delete")
public class EmployeeDeleteController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("{employeeId:\\d+}")
	public String employee( @PathVariable Integer employeeId, Model model ) {

		Employee employee = employeeService.findById(employeeId);
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("departmentList", departmentList);
		model.addAttribute( "employee", employee );
		return "employee/delete/confirm";
	}

	@PostMapping("{employeeId:\\d+}")
	public String delete(@PathVariable Integer employeeId) {
		employeeService.delete(employeeId);
		return "redirect:/employee";
	}
}
