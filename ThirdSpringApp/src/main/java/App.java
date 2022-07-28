import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Second spring using reference");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontest.xml");
		A a=(A) context.getBean("refa");
		System.out.println(a.getX());
		System.out.println(a.getB().getY());

	}

}
