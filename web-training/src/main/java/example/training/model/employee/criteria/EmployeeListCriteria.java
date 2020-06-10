package example.training.model.employee.criteria;

public class EmployeeListCriteria {

	private Integer departmentId;
	private EmployeeIdPriority employeeIdPriority;

	public EmployeeListCriteria() {
		this.departmentId = null;
		this.employeeIdPriority = EmployeeIdPriority.ASC;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public EmployeeIdPriority getEmployeeIdPriority() {
		return this.employeeIdPriority;
	}

	public void setEmployeeIdPriority(EmployeeIdPriority employeeIdPriority) {
		this.employeeIdPriority = employeeIdPriority;
	}

	public boolean isEmpty() {
		if(departmentId == null) {
			return true;
		}
		return false;
	}

	public boolean isNotEmpty() {
		return !isEmpty();
	}

	@Override
	public String toString() {
		return String.format("EmployeeListCriteria [departmentId=%s, employeeIdPriority=%s]", departmentId, employeeIdPriority);
	}
}