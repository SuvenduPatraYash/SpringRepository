package com.yash.SpringJdbcDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/SpringJdbcDao/applicationcontext.xml");
		StudentDao stdao = context.getBean("StudentDao", StudentDao.class);

		Student s = new Student();
		s.setId(111);
		s.setName("jk");
		int r = stdao.insert(s);
		System.out.println(r + "  : Student added Successfully ");
	}
}