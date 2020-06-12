package example.training.model.employee.criteria;

import example.training.model.department.DepartmentId;

public class EmployeeListCriteria {

	private DepartmentId departmentId;
	private EmployeeIdPriority employeeIdPriority;

	public EmployeeListCriteria() {
		this.departmentId = new DepartmentId();
		this.employeeIdPriority = EmployeeIdPriority.ASC;
	}

	public DepartmentId getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DepartmentId departmentId) {
		this.departmentId = departmentId;
	}

	public EmployeeIdPriority getEmployeeIdPriority() {
		return this.employeeIdPriority;
	}

	public void setEmployeeIdPriority(EmployeeIdPriority employeeIdPriority) {
		this.employeeIdPriority = employeeIdPriority;
	}

	@Override
	public String toString() {
		return String.format("EmployeeListCriteria [departmentId=%s, employeeIdPriority=%s]", departmentId, employeeIdPriority);
	}
}