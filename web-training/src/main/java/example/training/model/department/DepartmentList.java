package example.training.model.department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentList {

	private List<Department> values;

	public DepartmentList() {
		values = new ArrayList<Department>();
	}

	public DepartmentList(List<Department> values) {
		super();
		this.values = values;
	}

	public List<Department> getValues() {
		return values;
	}

	public void setValues(List<Department> values) {
		this.values = values;
	}

	public String departmentNameById(Integer id) {
		String departmentName = null;
		for(Department department : values) {
			if(department.getId().getValue().equals(id)) {
				departmentName = department.getName().getValue();
				break;
			}
		}
		return departmentName;
	}

	@Override
	public String toString() {
		return String.format("DepartmentList [values=%s]", values);
	}
}