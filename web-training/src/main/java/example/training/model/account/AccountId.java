package example.training.model.account;

import java.io.Serializable;

public class AccountId implements Serializable {

	private static final long serialVersionUID = 1440044235179334858L;

	private Integer value;

	public AccountId() {}

	public AccountId(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("AccountId [value=%s]", value);
	}
}