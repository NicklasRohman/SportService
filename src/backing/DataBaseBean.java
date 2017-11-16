package backing;

import java.util.List;
import javax.ejb.EJB;
import entites.DataBaseMatchEntity;
import entites.facades.DataBaseMatchFacade;

public class DataBaseBean {

	@EJB
	private DataBaseMatchFacade dbMatchEJB;

	private List<DataBaseMatchEntity> dbmatchs;

	public List<DataBaseMatchEntity> getFindAllDbMatchs() {
		if (dbmatchs == null) {
			dbmatchs = dbMatchEJB.findAll();
		}
		return dbmatchs;
	}

}