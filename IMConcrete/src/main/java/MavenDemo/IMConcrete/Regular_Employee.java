package MavenDemo.IMConcrete;

import javax.persistence.*;  

@Entity  
@Table(name="regularemployee102")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Regular_Employee extends Employee{  
      
@Column(name="salary")    
private float salary;  
  
@Column(name="bonus")     
private int bonus;

public void setBonus(int i) {
	// TODO Auto-generated method stub
	
}

public void setSalary(int i) {
	// TODO Auto-generated method stub
	
}

public void setName(String string) {
	// TODO Auto-generated method stub
	
}  
  
//setters and getters  
} 