package com.hcl.phmp.repository;

import com.hcl.phmp.model.Login;
import com.hcl.phmp.model.Profile;
import com.hcl.phmp.model.Users;

/**
 * @author kowshik kotha
 *
 */
public interface UserDAO {
	boolean register(Users usr);

	boolean login(Login login);
	
	boolean profile(Profile profile);

}
