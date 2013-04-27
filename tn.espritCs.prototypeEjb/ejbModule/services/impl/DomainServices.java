package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.User;
import services.interfaces.DomainServicesLocal;
import services.interfaces.DomainServicesRemote;

/**
 * Session Bean implementation class DomainServices
 */
@Stateless
public class DomainServices implements DomainServicesRemote,
		DomainServicesLocal {

	/** The entity manager. */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public DomainServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

}
