package com.jdbc_spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc_spring.jdbc.dao.StudentDao;
import com.jdbc_spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
//		/*
//		 * JdbcTemplate temp=con.getBean("jdbcTemplate",JdbcTemplate.class); //insert
//		 * query
      //  String query=
//		 * "insert into student(studeId,studname,rollno) values (?,?,?)"; //fire query
//		 * int result=temp.update(query,1,"kanchan",24);
//		 * 
//		 * System.out.println("no. of record inserted "+ result);
//		 
        //below is for inserting
		/*
		 * StudentDao stud=con.getBean("studentdao",StudentDao.class);//farak ni padeag
		 * dao bhi impl ka hi parent hai 
		 * Student student=new Student();
		 * student.setStudeId(1); student.setStudname("kan"); student.setRollno(4); int
		 * res=stud.insert(student); System.out.println(res);
		 */
        //below is for updating
        
		/*
		 * Student stud=new Student(); stud.setStudeId(1);///db mai hoga padha 1 id ka
		 * usme change karna rollno and name stud.setRollno(8);
		 * stud.setStudname("rekha"); StudentDao
		 * studi=con.getBean("studentdao",StudentDao.class); int res=studi.change(stud);
		 * System.out.println("result updated ");
		 */
        
        //below is for deleting
   
		/*
		 * 
		 * StudentDao studi=con.getBean("studentdao",StudentDao.class); 
		 * int res=studi.delete(4); //4 should be the id present
		 * System.out.println("result updated ");
		 */
        
        //for selectig single data using rowmapper
        Student student=new Student();
        StudentDao studi=con.getBean("studentdao",StudentDao.class);
        Student student1=studi.getStudent(1);
        
        System.out.println(student1);
        
        
        //this below line if working with java onfig class 
       // ApplicationContext con=new AnnotationConfigApplicationContext(JdbcConfig.class);
        //baki insert k operationdeleet k...
    }
}
