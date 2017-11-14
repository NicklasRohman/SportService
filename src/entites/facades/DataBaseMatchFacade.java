package entites.facades;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entites.DataBaseMatch;



@Stateless
//@DeclareRoles({"admin","hero"})
public class DataBaseMatchFacade extends AbstractFacades<DataBaseMatch>{
	@PersistenceContext(unitName="matches")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public DataBaseMatchFacade(){
		super(DataBaseMatch.class);
	}
	
	@Override
	//@RolesAllowed({"admin"})
	public void create(DataBaseMatch entity) {
		super.create(entity);
	}

	@Override
	//@RolesAllowed({"admin"})
	public void edit(DataBaseMatch entity) {
		super.edit(entity);
	}

	@Override
	//@RolesAllowed({"admin"})
	public void remove(DataBaseMatch entity) {
		super.remove(entity);
	}

}
