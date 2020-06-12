package example.training.model.employee;

import example.training.model.employee.criteria.EmployeeListCriteria;

public interface EmployeeRepository {

	public Employee findById(Integer employeeId);

	public EmployeeList listOf(EmployeeListCriteria criteria);

	public Integer insert(Employee employee);

}