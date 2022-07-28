package EmployeeCrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeCrud/applicationcontext.xml");
		EmployeeDao stdao = context.getBean("EmployeeDao", EmployeeDao.class);

		Employee s = new Employee();
		s.setId(101);
		s.setEmpname("Sukumar");
		s.setEmailid("atra@yash.com");
		s.setDob("2000.11.2");
		s.setContactno("7978064877");
		s.setSalary(300000);
		int r = stdao.insert(s);
		System.out.println(r + "  : Employee added Successfully ");
	}
}