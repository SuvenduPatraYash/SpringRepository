import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to first Spring Application");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e=(Employee) context.getBean("employee");
		System.out.println(e);
		Employee e1=(Employee) context.getBean("employee1");
		System.out.println(e1);

	}

}
