/**
 * 
 */
package org.young.dao;

import java.util.*;
import org.young.common.BaseDaoHibernate;
import org.young.model.AdminInfo;

/**
 * @author Young
 *
 */
public class LoginDaoImpl extends BaseDaoHibernate<AdminInfo> implements LoginDao {

	@Override
	public String findPassByName(String name) {	
		
		List<String> list = new ArrayList<String>();
		list = query("select password from admin_info");
		
		if(list.size() > 1){
			String e = list.get(0);
			return e;
		}
		
		return "";
	}

	
}
