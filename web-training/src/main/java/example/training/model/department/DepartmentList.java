package example.training.model.department;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DepartmentList implements Serializable {

	private static final long serialVersionUID = 4007575624258027456L;

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