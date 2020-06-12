package example.training.model.fandamental;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class DateOfBirth {

	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
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
