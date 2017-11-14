package rs;

import java.util.ArrayList;
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
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_XML)
	public List<Match> getMatches(){
			matches = new ArrayList<>();
			matches.add(new Match("Fotboll","Iggy",3,1));
			matches.add(new Match("Hocky","wolf",5,1));
			matches.add(new Match("Innebandy","Nicklas",1,2));
			matches.add(new Match("Golf","Nicklas",-7,1));
			matches.add(new Match("Hapkido","Gustav",4,2));
			matches.add(new Match("Fotboll","Brolin",5,1));
		return matches;
	}
	
	@GET
	@Path("/DBpath")
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return"<p>Testar DB</p>";
	}
	
}




//http://localhost:8080/sportsing-webservice/rs/sports/list
//http://localhost:8080/sportsing-webservice/rs/sports/DBpath