package com.jdbc_spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc_spring.jdbc.entity.Student;

public class RowMapperImpl implements RowMapper<Student> {
//resultset is your dataset
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	Student student=new Student();
	student.setRollno(rs.getInt(1));
	student.setStudeId(rs.getInt(2));
	student.setStudname(rs.getString(3));
	return student;
	
	}

}
