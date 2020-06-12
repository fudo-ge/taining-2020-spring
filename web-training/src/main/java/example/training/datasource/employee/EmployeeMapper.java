package example.training.datasource.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import example.training.model.employee.Employee;
import example.training.model.employee.criteria.EmployeeListCriteria;

@Mapper
public interface EmployeeMapper {

	Employee findById(@Param("employeeId") Integer employeeId);

	List<Employee> listOf(@Param("criteria") EmployeeListCriteria criteria);

	Integer insert(@Param("employee") Employee employee);

}