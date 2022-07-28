package AnnotationBased;

//Java program to call the

//bean initialized above

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Driver class
public class App {

	public static void main(String[] args) throws Exception {

		// Loading the Spring XML configuration
		// file into Spring container and
		// it will create the instance of the
		// bean as it loads into container
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("AnnotationBased/spring.xml");

		// It will close the Spring container
		// and as a result invokes the
		// destroy() method
		cap.close();
	}
}
