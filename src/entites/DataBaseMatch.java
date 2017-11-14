package entites;

import javax.persistence.*;

@Entity
public class DataBaseMatch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchid;

	@Column(name = "sport", nullable = false)
	private String sport;

	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int heroid) {
		this.matchid = heroid;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	
}