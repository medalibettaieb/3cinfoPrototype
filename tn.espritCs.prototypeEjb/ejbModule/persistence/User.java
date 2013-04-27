package persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * Entity implementation class for Entity: User.
 */
@Entity
public class User implements Serializable {

	/** The id user. */
	private int idUser;

	/** The name user. */
	private String nameUser;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new user.
	 */
	public User() {
		super();
	}

	/**
	 * Gets the id user.
	 * 
	 * @return the id user
	 */
	@Id
	public int getIdUser() {
		return this.idUser;
	}

	/**
	 * Sets the id user.
	 * 
	 * @param idUser
	 *            the new id user
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * Gets the name user.
	 * 
	 * @return the name user
	 */
	public String getNameUser() {
		return this.nameUser;
	}

	/**
	 * Sets the name user.
	 * 
	 * @param nameUser
	 *            the new name user
	 */
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

}
