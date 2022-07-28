package sbpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// Class
// Implementing BeanPostProcessor interface
public class CustomProcessor implements BeanPostProcessor {

	// Method 1
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization() is called for EmployeeImpl");

		return bean;
	}

	// Method 2
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization() is called for EmployeeImpl");

		return bean;
	}
}