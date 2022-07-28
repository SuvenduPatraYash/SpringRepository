package AutowireDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireDemo/applicationContext.xml");
		A a = context.getBean("a", A.class);
		a.display();
	}
}