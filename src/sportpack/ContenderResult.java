package sportpack;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Beskriver en deltagares (individ eller lag) resultat i en match.
 * name: Deltagarens namn
 * score: Deltagarens "po�ng" (antal m�l, tid, e.dyl)
 * place: Deltagarens placering
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ContenderResult {
	@XmlElement private String name;
	@XmlElement private float score;
	@XmlElement private int place;

	public ContenderResult() {}
	public ContenderResult(String name, float score, int place) {
		this.name = name;
		this.score = score;
		this.place = place;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public float getScore() { return score; }
	public void setScore(float score) { this.score = score; }
	public int getPlace() { return place; }
	public void setPlace(int place) { this.place = place; }
}
