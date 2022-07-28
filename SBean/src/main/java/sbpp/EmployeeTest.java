package sbpp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Class
public class EmployeeTest {

	// Main driver method of BeanPostProcessor
	public static void main(String[] args) {

		// Creating object of ApplicationContext,
		// EmployeeImpl, and Employee class inside main()
		// method
		ApplicationContext con = new ClassPathXmlApplicationContext("sbpp/applicationContext.xml");
		EmployeeImpl impl = (EmployeeImpl) con.getBean("impl");
		Employee emp = impl.createEmp();

		System.out.println("Employee Details");
		System.out.println("Name: " + emp.getName() + ", Email address: " + emp.getMail());
		((ClassPathXmlApplicationContext) con).close();
	}
}