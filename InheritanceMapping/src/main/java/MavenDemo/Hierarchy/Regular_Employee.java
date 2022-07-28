package MavenDemo.Hierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("regularemployee")  
public class Regular_Employee extends Employee{  
      
@Column(name="salary")    
private float salary;  
  
@Column(name="bonus")     
private int bonus;

public void setSalary(int i) {
	// TODO Auto-generated method stub
	
}

public void setBonus(int i) {
	// TODO Auto-generated method stub
	
}

 
  

}  