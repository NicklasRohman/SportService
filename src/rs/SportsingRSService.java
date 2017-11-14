package rs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.sportsing.api.Match;

import database.Database;


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
	@Path("/checkDataBase")
	@Produces(MediaType.TEXT_HTML)
	public String checkDataBase() throws Exception {

		PreparedStatement query = null;
		String returnString = null;
		String myString = null;
		Connection conn = null;

		try {

			conn = Database.databaseConnection().getConnection();
			query = conn.prepareStatement("select to_char(sysdate,'YYYY-MM-DD HH24:MI:SS') DATETIME from sys.dual");
			ResultSet rs = query.executeQuery();

			while (rs.next()) {
				myString = rs.getString("DATETIME");
			}
			query.close();
			returnString = "<p>DataBase Status</p>" + "<p>DataBase Date/Time return: " + myString + "</p>";

		} catch (Exception e) {
			e.printStackTrace();
			returnString="<p>DataBase Status not found</p>";
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
		return returnString;
	}
}

//http://localhost:8080/sportsing-webservice/rs/sports/list
//http://localhost:8080/sportsing-webservice/rs/sports/checkDataBase