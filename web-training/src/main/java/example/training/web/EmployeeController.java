package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.criteria.EmployeeListCriteria;
import example.training.model.employee.criteria.EmployeeListCriteriaFactory;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private EmployeeListCriteriaFactory criteriaFactory;

	@GetMapping
	public String employees(Model model) {

		EmployeeListCriteria criteria = criteriaFactory.create();
		prepareEmployee(criteria, model);
		return "employee/employee-list";
	}

	@GetMapping("{employeeId:\\d+}")
	public String employee( @PathVariable Integer employeeId, Model model ) {

		Employee employee = employeeService.findById(employeeId);
		if(employee != null) {
			model.addAttribute( "employee", employee );
			return "employee/employee";
		}

		model.addAttribute( "employeeId", employeeId );
		return "employee/null-pointer-exception";
	}

	@PostMapping
	public String searchEmployees( @ModelAttribute EmployeeListCriteria criteria, Model model ) {

		prepareEmployee(criteria, model);
		return "employee/employee-list";
	}

	private void prepareEmployee(EmployeeListCriteria criteria, Model model) {

		DepartmentList departments = departmentService.listOf();
		EmployeeList employees = employeeService.listOf(criteria);
		model.addAttribute( "departments", departments );
		model.addAttribute( "employees", employees );
		model.addAttribute( "criteria", criteria );
	}
}