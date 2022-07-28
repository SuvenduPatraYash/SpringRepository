package XMLbased;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import XMLbased.HelloWorld;

//Driver class
public class App {

	public static void main(String[] args) throws Exception {

		// Loading the Spring XML configuration
		// file into the spring container and
		// it will create the instance of
		// the bean as it loads into container

		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("XMLbased/spring.xml");

		// It will close the spring container
		// and as a result invokes the
		// destroy() method
		cap.close();
	}
}
