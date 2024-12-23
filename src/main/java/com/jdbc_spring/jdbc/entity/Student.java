package com.jdbc_spring.jdbc.entity;
//table name sql ami bana hona chaiye  
public class Student {
private int studeId;
private String studname;
public String getStudname() {
	return studname;
}

public void setStudname(String studname) {
	this.studname = studname;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

private int rollno;
public Student(int studeId) {
	super();
	this.studeId = studeId;
}

public Student() {
	// TODO Auto-generated constructor stub
}

public int getStudeId() {
	return studeId;
}

public void setStudeId(int studeId) {
	this.studeId = studeId;
}

@Override
public String toString() {
	return "Student [studeId=" + studeId + "]";
}

}
