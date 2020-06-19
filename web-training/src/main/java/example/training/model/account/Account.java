package example.training.model.account;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 641792718628569352L;

	private AccountId id;
	private AccountLoginId loginId;
	private AccountName name;
	private AccountRole role;
	private Password password;

	public Account() {}

	public Account(AccountId id, AccountLoginId loginId, AccountName name, AccountRole role, Password password) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.name = name;
		this.role = role;
		this.password = password;
	}

	public AccountId getId() {
		return id;
	}

	public void setId(AccountId id) {
		this.id = id;
	}

	public AccountLoginId getLoginId() {
		return loginId;
	}

	public void setLoginId(AccountLoginId loginId) {
		this.loginId = loginId;
	}

	public AccountName getName() {
		return name;
	}

	public void setName(AccountName name) {
		this.name = name;
	}

	public AccountRole getRole() {
		return role;
	}

	public void setRole(AccountRole role) {
		this.role = role;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("Account [id=%s, loginId=%s, name=%s, role=%s, password=%s]", id, loginId, name, role,
				password);
	}
}