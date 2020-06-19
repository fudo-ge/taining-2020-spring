package example.training.model.account;

import java.io.Serializable;

public class Password implements Serializable {

	private static final long serialVersionUID = -3620250450049955733L;

	private String value;

	public Password() {}

	public Password(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Password [value=%s]", value);
	}
}