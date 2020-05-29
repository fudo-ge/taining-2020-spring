package example.training.model.fandamental;

import java.time.LocalDate;

public class DateOfBirth {

	private LocalDate value;

	public DateOfBirth(LocalDate value) {
		super();
		this.value = value;
	}

	public DateOfBirth() {}

	public LocalDate getValue() {
		return value;
	}

	public void setValue(LocalDate value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DateOfBirth [value=%s]", value);
	}

}
