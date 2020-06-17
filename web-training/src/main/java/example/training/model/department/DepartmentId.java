package example.training.model.department;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DepartmentId implements Serializable {

	private static final long serialVersionUID = -1261564746035875938L;

	@NotNull
	private Integer value;

	public DepartmentId(Integer value) {
		this.value = value;
	}

	public DepartmentId() {}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public boolean isEmpty() {
		if(value == null) {
			return true;
		}
		return false;
	}

	public boolean isNotEmpty() {
		return !isEmpty();
	}

	@Override
	public String toString() {
		return String.format("DepartmentId [value=%s]", value);
	}
}