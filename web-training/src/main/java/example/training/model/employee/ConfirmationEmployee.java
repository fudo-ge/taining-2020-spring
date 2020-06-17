package example.training.model.employee;

import example.training.model.fandamental.DateOfBirth;
import example.training.model.fandamental.Gender;

public class ConfirmationEmployee extends Employee {

	private static final long serialVersionUID = -2716539814716159450L;

	private EmployeeId id;
	private EmployeeName name;
	private Gender gender;
	private DateOfBirth dateOfBirth;
	private EmployeeDepartment department;

	public void setAll(Employee employee) {
		this.id = employee.getId();
		this.name = employee.getName();
		this.gender = employee.getGender();
		this.dateOfBirth = employee.getDateOfBirth();
		this.department = employee.getDepartment();
	}

	private boolean employeeIdIsSame(Employee employee) {
		return this.id.getValue().equals(employee.getId().getValue());
	}

	private boolean nameIsSame(Employee employee) {
		return this.name.getFirstName().equals(employee.getName().getFirstName()) &&
				this.name.getLastName().equals(employee.getName().getLastName());
	}

	private boolean genderIsSame(Employee employee) {
		return this.gender.equals(employee.getGender());
	}

	private boolean dateOfBirthIsSame(Employee employee) {
		return this.dateOfBirth.getValue().equals(employee.getDateOfBirth().getValue());
	}

	private boolean departmentIdIsSame(Employee employee) {
		return this.department.getId().getValue().equals(employee.getDepartment().getId().getValue());
	}

	public boolean isSame(Employee employee) {
		return employeeIdIsSame(employee) && nameIsSame(employee) && genderIsSame(employee) &&
				dateOfBirthIsSame(employee) && departmentIdIsSame(employee);
	}

}
