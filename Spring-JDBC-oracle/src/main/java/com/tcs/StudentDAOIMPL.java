package com.tcs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tcs.Spring_JDBC_oracle.Student;
@Component("studentdao")
public class StudentDAOIMPL implements StudentDAO{
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int create(Student student) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, student.getSid(),student.getSname(),student.getSname());
	return result;
	}

	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Student read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> read() {
		// TODO Auto-generated method stub
		return null;
	}

}
