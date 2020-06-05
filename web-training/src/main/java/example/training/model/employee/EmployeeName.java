package example.training.model.employee;

public class EmployeeName {

	private String firstName;
	private String lastName;

	public EmployeeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public EmployeeName() {
		this.firstName = "";
		this.lastName = "";
	}

	public String fullName() {
		return String.format("%s　%s", lastName, firstName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("EmployeeName [firstName=%s, lastName=%s]", firstName, lastName);
	}
}