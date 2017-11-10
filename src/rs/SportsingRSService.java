package rs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.sportsing.api.Match;


@Path("/rs/sports")
public class SportsingRSService {
	private List<Match>matches;
	
	public SportsingRSService() {
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_XML)
	public List<Match> getMatches(){
		
		return matches;
	}
	
	@GET
	@Path("/get/{matchname}")
	@Produces(MediaType.APPLICATION_XML)
	public Match getMatch(@PathParam("sport") String sport) throws IllegalAccessException{
		
		
		throw new IllegalAccessException("No such match \" "+ sport +"\"");
	}	
}

//http://localhost:8080/sportsing-webservice/rs/sports/list