package CollectionDemo;

import java.util.List;

public class Student {
	private String name;
	private String rollNo;
	private String className;
	private List<Address> address;
 
	public Student(List<Address> address){
		this.address = (List<Address>) address;
	}
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Address> getAddress() {
		return address;
	}	
}