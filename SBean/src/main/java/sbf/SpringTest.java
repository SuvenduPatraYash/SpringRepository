package sbf;
//BeanFactoryPostProcessor Driver Code
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("App_conf.xml");
		context.registerShutdownHook();
	}
}