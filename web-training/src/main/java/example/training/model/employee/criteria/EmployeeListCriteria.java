package example.training.model.employee.criteria;

public class EmployeeListCriteria {

	private Integer departmentId;

	public EmployeeListCriteria() {
		this.departmentId = null;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
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
		return String.format("EmployeeListCriteria [departmentId=%s]", departmentId);
	}
}