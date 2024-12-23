package com.jdbc_spring.jdbc.dao;

import com.jdbc_spring.jdbc.entity.Student;

public interface StudentDao {
public int insert(Student dao);//return type ki itni rows return hui
public int change(Student stu);//for updating
public int delete(int StudentId);//for deleting a record
public  Student getStudent(int studentid);//for fetching a row from a complete result set
}
