package backing;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import entites.DataBaseMatch;
import entites.facades.DataBaseMatchFacade;


@Named
@ViewScoped
public class DbMatchBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@EJB
	private DataBaseMatchFacade DataBaseMatchFacadeEJB;

	private List<DataBaseMatch> dbMatches;

	
	public DataBaseMatchFacade getDataBaseMatchFacadeEJB() {
		return DataBaseMatchFacadeEJB;
	}


	public void setDataBaseMatchFacadeEJB(DataBaseMatchFacade dataBaseMatchFacadeEJB) {
		DataBaseMatchFacadeEJB = dataBaseMatchFacadeEJB;
	}


	public List<DataBaseMatch> getDbMatches() {
		return dbMatches;
	}


	public void setDbMatches(List<DataBaseMatch> dbMatches) {
		this.dbMatches = dbMatches;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}








}
