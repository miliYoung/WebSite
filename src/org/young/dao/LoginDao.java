package org.young.dao;

import org.young.common.BaseDao;
import org.young.model.*;

public interface LoginDao extends BaseDao<AdminInfo>{

	/**
	 * 
	 * @param name
	 * @return 
	 */
	public String findPassByName(String name);
}
