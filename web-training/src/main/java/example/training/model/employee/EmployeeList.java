package example.training.model.employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements Serializable {

	private static final long serialVersionUID = 559006414358899709L;

	private List<Employee> values;

	public EmployeeList(List<Employee> values) {
		super();
		this.values = values;
	}

	public EmployeeList() {
		values = new ArrayList<Employee>();
	}

	public List<Employee> getValues() {
		return values;
	}

	public void setValues(List<Employee> values) {
		this.values = values;
	}

	public boolean isEmpty() {
		return values.isEmpty();
	}

	public boolean isNotEmpty() {
		return !values.isEmpty();
	}

	@Override
	public String toString() {
		return String.format("EmployeeList [values=%s]", values);
	}
}