package bean;

import java.io.Serializable;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
