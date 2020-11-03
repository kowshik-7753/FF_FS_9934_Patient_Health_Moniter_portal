package com.hcl.phmp.service;

import org.springframework.stereotype.Service;

import com.hcl.phmp.model.Login;
import com.hcl.phmp.model.Profile;
import com.hcl.phmp.model.Users;
import com.hcl.phmp.repository.UserDAOImpl;



/**
 * @author kowshik.kotha
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean register(Users usr) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.register(usr);
		// TODO Auto-generated method stub
	}

	@Override
	public boolean login(Login login) {
		// TODO Auto-generated method stub
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.login(login);
	}
	@Override
	public boolean profile(Profile profile) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.profile(profile);
	}
   
}
