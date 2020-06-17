package example.training.model.employee;

import example.training.model.employee.criteria.EmployeeListCriteria;

public interface EmployeeRepository {

	public Employee findById(Integer employeeId);

	public EmployeeList listOf(EmployeeListCriteria criteria);

	public void insert(Employee employee);

	public void update(Employee employee);

	public void delete(Integer employeeId);

}