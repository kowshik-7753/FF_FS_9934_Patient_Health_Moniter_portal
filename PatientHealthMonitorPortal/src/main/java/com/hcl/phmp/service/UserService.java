/**
 * 
 */
package com.hcl.phmp.service;

import com.hcl.phmp.model.BloodCount;
import com.hcl.phmp.model.Diabetes;
import com.hcl.phmp.model.Login;
import com.hcl.phmp.model.PatientBMI;
import com.hcl.phmp.model.Profile;
import com.hcl.phmp.model.Users;

/**
 * @author kowshik.kotha
 *
 */
public interface UserService {
	boolean register(Users usr);

	boolean login(Login login);
	
	boolean profile(Profile profile);
	
	boolean bmiCalculator(PatientBMI patientBMI);
	
	boolean bloodCount(BloodCount bloodCount);
	
	boolean diabetes(Diabetes diabetes);
	
}
