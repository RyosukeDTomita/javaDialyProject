package bean;

import java.io.Serializable;

/**
 * Account is implementation of Serializable, stored user login information.
 * 
 * @param id       login id
 * @param password login password
 * @author tomita
 *
 */
public class Account implements Serializable {
	private String id;
	private String password;
	private static final long serialVersionUID = 1L;

	public Account() {
	}

	public Account(String id, String password) {
		setId(id);
		setPassword(password);
	}

	/**
	 * @return id Login ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id login ID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return password login password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password login password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
