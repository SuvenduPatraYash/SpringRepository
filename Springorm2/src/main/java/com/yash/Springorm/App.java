package com.yash.Springorm;

import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.Springorm.dao.StudentDao;
import com.yash.Springorm.entities.Student;


public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentDao studao = context.getBean("StudentDao", StudentDao.class);
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter user name => ");
		String userName = scanner.nextLine();
		System.out.print(" Enter password => ");
		String password = scanner.nextLine();

		while(true) {
			
		if("Suvendu".equals(userName) && "1234".equals(password))
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the operation which you want to perform");
			System.out.println("1 for insert");
			System.out.println("2 for read");
			System.out.println("3 for update");
			System.out.println("4 for delete");
			
			int a = sc.nextInt();
			if (a == 1) 
			{
				Student s = new Student();
				System.out.println("Enter the emp id");
				int id = sc.nextInt();
				s.setId(id);
				System.out.println("Enter the name");
				String name = sc.next();
				s.setName(name);
				int r = studao.insert(s);// insert the details
				System.out.println("New Student added successfully");
			} 
			else if (a == 2) 
			{
				List<Student> stu = studao.getAllStudents();
				for (Student s : stu) 
				{
					System.out.println(s);
			    }
			} 
			else if (a == 3) 
			{
				Student s = new Student();
				System.out.println("Enter the emp id that you want to update");
				int id = sc.nextInt();
				s.setId(id);
				System.out.println("Enter the updated name in record");
				String name = sc.next();
				s.setName(name);
				studao.updateDetails(s);
				System.out.println("Student details updated ");
			} 
			else if (a == 4) 
			{
				System.out.println("Enter the emp id that you want to delete");
				int id = sc.nextInt();
				studao.deleteDetails(id);// delete the details
				// Student s = stdao.selectDetails(106);
				System.out.println("student with id " + id + " deleted successfully");
			}
			System.out.println();
			System.out.println("press 0 to continue and 1 to exit");
			int n = sc.nextInt();
			if (n == 1) 
			{
				break;
			}
		}
		}

	}
}
