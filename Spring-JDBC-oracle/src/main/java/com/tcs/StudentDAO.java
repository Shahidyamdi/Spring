package com.tcs;

import java.util.List;

import com.tcs.Spring_JDBC_oracle.Student;

public interface StudentDAO {
	int create(Student student);
	int update(Student student);
	int delete(int id);
	Student read(int id);
	List<Student> read();

}
