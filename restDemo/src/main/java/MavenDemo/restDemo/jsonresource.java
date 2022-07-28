package MavenDemo.restDemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/u")
public class jsonresource {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public jresource getJson() {
		jresource r = new jresource();
		r.setId(1);
		r.setName("Hello Suvendu how are you");
		return r;

	}
}