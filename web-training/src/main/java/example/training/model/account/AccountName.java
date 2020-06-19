package example.training.model.account;

import java.io.Serializable;

public class AccountName implements Serializable {

	private static final long serialVersionUID = 7622038783263860128L;

	private String value;

	public AccountName() {}

	public AccountName(String value) {
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
		return String.format("AccountName [value=%s]", value);
	}
}