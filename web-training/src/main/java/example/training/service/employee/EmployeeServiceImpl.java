package example.training.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.training.datasource.employee.EmployeeDataSource;
import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.criteria.EmployeeListCriteria;
import example.training.model.fandamental.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDataSource dataSource;

	@Override
	public Employee findById(Integer employeeId) {

		Employee employee = dataSource.findById(employeeId);

		if(employee == null) {
			throw new ResourceNotFoundException();
		}
		return employee;
	}

	@Override
	public EmployeeList listOf() {

		return dataSource.listOf();
	}

	@Override
	public EmployeeList listOf(EmployeeListCriteria criteria) {

		return dataSource.listOf(criteria);
	}
}
