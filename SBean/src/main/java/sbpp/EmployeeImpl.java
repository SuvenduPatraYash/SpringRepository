package sbpp;

public class EmployeeImpl {

	// Method 1
	public Employee createEmp() {

		// Creating Employee class object
		// inside EmployeeImpl class
		Employee e = new Employee();

		// Custom setters
		e.setName("Suvendu");
		e.setMail("patra@gmail.com");
		return e;
	}

	// Method 2
	public void initBean() {
		System.out.println("EmployeeImpl is Initialized.");
	}

	// Method 3
	public void destroyBean() {
		System.out.println("EmployeeImpl is Destroyed.");
	}
}