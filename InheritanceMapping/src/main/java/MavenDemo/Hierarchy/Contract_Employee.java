package MavenDemo.Hierarchy;

import javax.persistence.Column;  
import javax.persistence.DiscriminatorValue;  
import javax.persistence.Entity;  
  
@Entity  
@DiscriminatorValue("contractemployee")  
public class Contract_Employee extends Employee{  
      
    @Column(name="pay_per_hour")  
    private float pay_per_hour;  
      
    @Column(name="contract_duration")  
    private String contract_duration;

	public void setPay_per_hour(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setContract_duration(String string) {
		// TODO Auto-generated method stub
		
	}  
  
   
}  