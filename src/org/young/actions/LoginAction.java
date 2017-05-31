/**
 * 
 */
package org.young.actions;

import org.young.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Young
 *
 */
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1427734583012965740L;
	
	@Override 
	public String execute() throws Exception
	{	
		if(service.isValidLogin(username,password))
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @param service the service to set
	 */
	public void setService(LoginService service) {
		this.service = service;
	}


	/**
	 * @return the service
	 */
	public LoginService getService() {
		return service;
	}



	private String username;
	private String password;
	private LoginService service;
}
