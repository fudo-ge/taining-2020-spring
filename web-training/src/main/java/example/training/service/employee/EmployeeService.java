package example.training.service.employee;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.criteria.EmployeeListCriteria;

public interface EmployeeService {

	public Employee findById(Integer employeeId);

	public EmployeeList listOf();

	public EmployeeList listOf(EmployeeListCriteria criteria);

}
