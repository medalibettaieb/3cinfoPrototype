package services.interfaces;

import javax.ejb.Remote;

import persistence.User;

@Remote
public interface DomainServicesRemote {
	
	/**
	 * Adds the user.
	 *
	 * @param user the user
	 */
	void addUser(User user);

}
