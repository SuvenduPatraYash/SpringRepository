package CollectionDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {
 public static void main(String[] args) {
	//Get ApplicationContext using spring configuration file.
	ApplicationContext context = 
	  new ClassPathXmlApplicationContext("CollectionDemo/applicationContext.xml");
 
	//Get Student bean object from ApplicationContext instance. 
	Student student = (Student) context.getBean("student");
 
	//Process Student Object.
	System.out.println("Student info: ");
	System.out.println("Name: " + student.getName());
	System.out.println("RollNo: " + student.getRollNo());
	System.out.println("Class: " + student.getClassName());
 
	//Get Address from Student Object.
	List<Address> studentAddressList = student.getAddress();
 
	//Declare program counter.
	int addressCounter = 1;
 
	//Iterate Address List.
	for (Address studentAddress : studentAddressList) {
	  //Process Address Object.
	  System.out.println("Student Address " +addressCounter+ ": ");
	  System.out.println("Address Line: "+studentAddress.getAddLine());
	  System.out.println("City: " + studentAddress.getCity());
          System.out.println("State: " + studentAddress.getState());
	  System.out.println("Country: " + studentAddress.getCountry());
	  addressCounter++;
       }			
  } 
}