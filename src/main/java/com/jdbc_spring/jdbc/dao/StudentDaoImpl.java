package com.jdbc_spring.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jdbc_spring.jdbc.entity.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate template;

	@Autowired
	  public JdbcTemplate getTemplate() { return template; } public void
	  setTemplate(JdbcTemplate template) { this.template = template;}
	 
	public int insert(Student student) {
		   String query= "insert into student(studeId,studname,rollno) values (?,?,?)";//these column name should match with entity
		   int result=template.update(query,student.getStudeId(),student.getStudname(),student.getRollno());
		return result;
	}
	public int change(Student stu) {
		String query="update Student set studname=? ,rollno=? where studeId= ?";
				int result=template.update(query,stu.getStudname(),stu.getRollno(),stu.getStudeId());
		return result;
	}
	public int delete(int StudentId) {
		String query="delete from Student where studeId=?";
		int res=template.update(query,StudentId);
		return res;
	}
	public Student getStudent(int studentid) {
		String query="select * from student where studeId=?";//studeId should match with entity
		RowMapper<Student>rowmapper=new RowMapperImpl();
		Student student=this.template.queryForObject(query, rowmapper,studentid);//to fetch from complete rowset single row fetched
		return student;
	}

}
