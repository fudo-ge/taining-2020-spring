package example.training.model.department;

import java.io.Serializable;

public class DepartmentName implements Serializable {

	private static final long serialVersionUID = 8406907303607283653L;

	private String value;

	public DepartmentName(String value) {
		this.value = value;
	}

	public DepartmentName() {
		this.value = "";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DepartmentName [value=%s]", value);
	}
}