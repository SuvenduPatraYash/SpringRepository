package com.yash.Springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.Springorm.dao.StudentDao;
import com.yash.Springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentDao studao = context.getBean("StudentDao", StudentDao.class);
		Student stu = new Student(2, "Jaynam");
		int msg = studao.insert(stu);
		System.out.println(msg + "insertion done");
	}
}
