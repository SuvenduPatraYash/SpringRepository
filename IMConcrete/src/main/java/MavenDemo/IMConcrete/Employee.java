package MavenDemo.IMConcrete;

import javax.persistence.*;  

@Entity  
@Table(name = "employee102")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
  
public class Employee {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  
  
@Column(name = "name")  
private String name;

public void setName(String string) {
	// TODO Auto-generated method stub
	
}  
  
//setters and getters  
}  