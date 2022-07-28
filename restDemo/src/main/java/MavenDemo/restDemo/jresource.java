package MavenDemo.restDemo;
import MavenDemo.restDemo.jsonresource;

public class jresource {

	private Integer id;
	private String name;


	public jresource(Integer id,String name) {
		super();
		this.id = id;
		this.name= name;

	}
 
	public jresource() {
		super();

	}

	public String getName() {
		return name;
	}

	public String toString()
	{
		return "Jresource [id=" + id + ", name"+ name + "]";
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	

}
