package com.jdbc_spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc_spring.jdbc.dao.StudentDao;
import com.jdbc_spring.jdbc.dao.StudentDaoImpl;
@Configuration
@ComponentScan(basePackages = "com.jdbc_spring.jdbc.dao")  //govong referce of studentdaoimpl file
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.myDriver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Kanch123@");
		return ds;
	}
	@Bean
	public JdbcTemplate jdbctemplate() {
		JdbcTemplate obj=new JdbcTemplate();
		obj.setDataSource(getDataSource());
		return obj;
		
	}
	
	//will comment below line if doing auowiring from 35 to 39
/*	@Bean
	public StudentDao getstudentdao() {
		StudentDaoImpl obj=new StudentDaoImpl();
	obj.setTemplate(jdbctemplate());;
		return obj;
		*/
	
	//if getstudentdao() you dont want to make , remove this method in java config only declare above javaconfig @Configuration and @compnentscan
	//(basepackages= {})
	//in studentdaoimpl mention @component  matlb yha se bean milega 
	//and either in impl prperty or setter of jdbc template mentioned @autowired
	//in app.java 
	
	
	
}
