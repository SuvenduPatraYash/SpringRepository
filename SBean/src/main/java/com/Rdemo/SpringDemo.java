package com.Rdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		EmployeeService employee = ctx.getBean(EmployeeService.class);
		System.out.println(employee.getAddress().get());
		System.out.println(employee.getCompany().get());
	}
}