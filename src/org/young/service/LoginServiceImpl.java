/**
 * 
 */
package org.young.service;

import org.young.dao.LoginDao;

/**
 * @author Young
 *
 */
public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao;
	
	@Override
	public boolean isValidLogin(String userName, String passWord) {
		
		if(loginDao.findPassByName(userName).equals(passWord))
		{
			return true;
		}
			
		return false;
	}

	/**
	 * @return the loginDao
	 */
	public LoginDao getLoginDao() {
		return loginDao;
	}

	/**
	 * @param loginDao the loginDao to set
	 */
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
}
