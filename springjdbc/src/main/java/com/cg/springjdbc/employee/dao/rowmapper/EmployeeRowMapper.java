package com.cg.springjdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cg.springjdbc.employee.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		
		emp.setId(rs.getInt(1));
		emp.setFirstName(rs.getString(2));
		emp.setLastName(rs.getString(3));
		return emp;
	}

}
