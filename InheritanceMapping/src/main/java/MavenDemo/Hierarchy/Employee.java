package MavenDemo.Hierarchy;
import javax.persistence.*;  
  
@Entity  
@Table(name = "employee101")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")  
  
public class Employee {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  
  
@Column(name = "name")  
private String name;

public void setName(String string) {
	
	
}

} 
