package sportpack;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Beskriver en match.
 * sport: Vilken sport det handlar om
 * contenders: En lista med resultat f�r varje deltagare
 * 
 *  registerContender(): Anv�nds p� serversidan f�r att l�gga till ContenderResults
 *  getContenderIterator(): Anv�nds p� klientsidan f�r att accessa listan med ContenderResults
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Match {
	@XmlElement
	private String sport;

	@XmlElementWrapper(name="contenders")
	@XmlElement(name="contender")
	private List<ContenderResult> contenders;

	public Match() {}
	public Match(String sport) {//,String name,int score,int place
		this.sport = sport;
		contenders = new ArrayList<ContenderResult>();
		//registerContender(name, score, place);
	}
	public void registerContender(ContenderResult cr) {
		contenders.add(cr);
	}
	public void registerContender(String name, float score, int place) {
		registerContender(new ContenderResult(name, score, place));
	}

	public Iterator<ContenderResult> getContenderIterator() {
		return contenders.iterator();
	}
	public static List<Match> getMatches() {
		List<Match> result = new ArrayList<>();
		result.add(new Match("Fotboll"));//,"Iggy",3,1
		result.add(new Match("Hocky"));//,"wolf",5,1
		result.add(new Match("Innebandy"));//,"Nicklas",1,2
		result.add(new Match("Golf"));//,"Nicklas",-7,1
		result.add(new Match("Hapkido"));
		return result;
	}
}
