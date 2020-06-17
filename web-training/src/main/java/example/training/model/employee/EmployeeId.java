package example.training.model.employee;

import java.io.Serializable;

public class EmployeeId implements Serializable {

	private static final long serialVersionUID = -5689528484459248455L;

	private Integer value;

	public EmployeeId(Integer value) {
		this.value = value;
	}

	public EmployeeId() {}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("EmployeeId [value=%s]", value);
	}
}