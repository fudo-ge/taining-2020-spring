package example.training.model.employee.criteria;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EmployeeIdPriority {
	ASC("昇順"),
	DESC("降順");

	private String label;

	private EmployeeIdPriority(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public Map<String, String> options() {
		Map<String, String> options = new LinkedHashMap<String, String>();
		for(EmployeeIdPriority employeeIdPriority : EmployeeIdPriority.values()) {
			options.put(employeeIdPriority.name(), employeeIdPriority.getLabel());
		}
		return options;
	}
}
