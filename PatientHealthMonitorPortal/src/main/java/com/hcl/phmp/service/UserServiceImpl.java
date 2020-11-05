package com.hcl.phmp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.phmp.model.BloodCount;
import com.hcl.phmp.model.Diabetes;
import com.hcl.phmp.model.Login;
import com.hcl.phmp.model.PatientBMI;
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
	@Override
	public boolean bmiCalculator(PatientBMI patientBMI) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.bmiCalculator(patientBMI);
	}
	@Override
	public boolean bloodCount(BloodCount bloodCount) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.bloodCount(bloodCount);
	}
	@Override
	public boolean diabetes(Diabetes diabetes) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.diabetes(diabetes);
	}

	@Override
	public List<BloodCount> bloodCount(String id) {
		UserDAOImpl userDAO = new UserDAOImpl();
		return userDAO.bloodCount(id);
	}
	
   
}
