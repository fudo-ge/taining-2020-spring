package example.training.model.employee;

import org.springframework.stereotype.Component;

@Component
public class EmployeeFactory {

	public Employee create() {
		return new Employee();
	}

	public ConfirmationEmployee confirmationCreate() {
		return new ConfirmationEmployee();
	}
}
