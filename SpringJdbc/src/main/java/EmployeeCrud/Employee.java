package EmployeeCrud;

public class Employee {
	private int id;
	private String empname;
	private String emailid;
	private String dob;
	private String contactno;
	private int salary;
	
	


	public Employee(int id, String empname, String emailid, String dob, String contactno, int salary) {
		super();
		this.id = id;
		this.empname = empname;
		this.emailid = emailid;
		this.dob = dob;
		this.contactno = contactno;
		this.salary = salary;
	}




	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmpname() {
		return empname;
	}




	public void setEmpname(String empname) {
		this.empname = empname;
	}




	public String getEmailid() {
		return emailid;
	}




	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}




	public String getDob() {
		return dob;
	}




	public void setDob(String dob) {
		this.dob = dob;
	}




	public String getContactno() {
		return contactno;
	}




	public void setContactno(String contactno) {
		this.contactno = contactno;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + empname + ", emailid="+ emailid +", dob= "+ dob +", contactno="+ contactno +", salary=" +salary +"]";
	}
	

	

}