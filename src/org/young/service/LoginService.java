/**
 * 
 */
package org.young.service;

import org.young.common.BaseService;

/**
 * @author Young
 *
 */
public interface LoginService extends BaseService {

	/**
	 * 
	 */
	public boolean isValidLogin(String userName, String passWord);
	
}
