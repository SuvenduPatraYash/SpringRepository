package springci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("spring using refrence");
		ApplicationContext context = new ClassPathXmlApplicationContext("springci/applicationcontest.xml");
		A e = (A) context.getBean("refa");
		System.out.println(e);
	}

}
