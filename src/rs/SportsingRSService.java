package rs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.sportsing.api.DbMatch;
import com.sportsing.api.Match;

import backing.DataBaseBean;
import entites.DataBaseMatchEntity;

@Path("/rs/sports")
@Stateless
public class SportsingRSService {

	private List<Match> matches;
	private List<DbMatch> dbmatches;

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_XML)
	public List<Match> getMatches() {
		matches = new ArrayList<>();
		matches.add(new Match("Fotboll", "Iggy", 3, 1));
		matches.add(new Match("Hocky", "wolf", 5, 1));
		matches.add(new Match("Innebandy", "Nicklas", 1, 2));
		matches.add(new Match("Golf", "Nicklas", -7, 1));
		matches.add(new Match("Hapkido", "Gustav", 4, 2));
		matches.add(new Match("Fotboll", "Brolin", 5, 1));
		return matches;
	}

	@GET
	@Path("/dataBaseMatches")
	@Produces(MediaType.APPLICATION_XML)
	public List<DataBaseMatchEntity> DataBaseMatches() {

		DataBaseBean dbb = new DataBaseBean();
//		dbmatches = 
		
		return dbb.getFindAllDbMatchs();
	}

}

// http://localhost:8080/sportsing-webservice/rs/sports/list
// http://localhost:8080/sportsing-webservice/rs/sports/DataBaseMatches