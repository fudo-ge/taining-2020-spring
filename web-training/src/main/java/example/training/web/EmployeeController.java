package example.training.web;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.department.DepartmentId;
import example.training.model.department.DepartmentName;
import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeDepartment;
import example.training.model.employee.EmployeeId;
import example.training.model.employee.EmployeeName;
import example.training.model.fandamental.DateOfBirth;
import example.training.model.fandamental.Gender;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@GetMapping
	public String employees() {
		return "employee/employee-list";
	}

	@GetMapping("{employeeId:\\d+}")
	public String employee( @PathVariable Integer employeeId, Model model ) {

		Employee employee = new Employee(new EmployeeId(100), new EmployeeName("太郎之介", "社員"), Gender.MALE,
				new DateOfBirth(LocalDate.of(1999, 6, 22)), new EmployeeDepartment( new DepartmentId(5), new DepartmentName("バスケ部")) );

		model.addAttribute( "employee", employee );
		return "employee/employee";
	}
}
