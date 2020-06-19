package example.training.model.account;

import java.io.Serializable;

public class AccountLoginId implements Serializable {

	private static final long serialVersionUID = 415401206508894613L;

	private String value;

	public AccountLoginId() {}

	public AccountLoginId(String value) {
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
		return String.format("AccountLoginId [value=%s]", value);
	}
}