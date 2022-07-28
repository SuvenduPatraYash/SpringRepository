package com.yash.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/SpringJdbc/applicationcontext.xml");
		JdbcTemplate temp = context.getBean("jdbctemp", JdbcTemplate.class);
		String q = "insert into student(id,name) values(?,?)";

		int msg = temp.update(q, 106, "Suvendu Patra");
		System.out.println("record inserted" + msg);
	}
}