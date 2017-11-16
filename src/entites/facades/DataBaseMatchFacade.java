package entites.facades;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entites.DataBaseMatchEntity;


@Stateless
//@DeclareRoles({"admin","hero"})
public class DataBaseMatchFacade extends AbstractFacades<DataBaseMatchEntity>{
	@PersistenceContext(unitName="matches")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public DataBaseMatchFacade(){
		super(DataBaseMatchEntity.class);
	}
	
	@Override
	//@RolesAllowed({"admin"})
	public void create(DataBaseMatchEntity entity) {
		super.create(entity);
	}

	@Override
	//@RolesAllowed({"admin"})
	public void edit(DataBaseMatchEntity entity) {
		super.edit(entity);
	}

	@Override
	//@RolesAllowed({"admin"})
	public void remove(DataBaseMatchEntity entity) {
		super.remove(entity);
	}

}
