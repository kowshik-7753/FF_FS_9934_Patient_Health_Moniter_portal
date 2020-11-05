package com.hcl.phmp.repository;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hcl.phmp.model.BloodCount;
import com.hcl.phmp.model.Diabetes;
import com.hcl.phmp.model.Login;
import com.hcl.phmp.model.PatientBMI;
import com.hcl.phmp.model.Profile;
import com.hcl.phmp.model.Users;
import com.hcl.phmp.util.HibernateUtil;

/**
 * @author kowshik.kotha
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public boolean register(Users user) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			String str=user.getLastName();
			
			Users user1 = new Users();
			user1.setUserId("PHMP"+str.substring(0,3));
			user1.setFirstName(user.getFirstName());
			user1.setLastName(user.getLastName());
			user1.setPassword(user.getPassword());
			user1.setAge(user.getAge());
			user1.setGender(user.getGender());
			user1.setEmail(user.getEmail());
			user1.setContactNumber(user.getContactNumber());
			user1.setAddress(user.getAddress());
			user1.setZipCode(user.getZipCode());
			user1.setCity(user.getCity());
			session.save(user1);
			session.getTransaction().commit();
			//HibernateUtil.shutdown();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e);
			return false;
		}
	}

	@Override
	public boolean login(Login login) {
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String selQuery = ("select count(distinct (loginId)) from users u where u.loginId ='" + login.getUserName()
				+ "' and u.password='" + login.getPassword() + "'");
		Query query = session.createSQLQuery(selQuery);
		Integer temp =  ((BigInteger)query.getResultList().get(0)).intValue();
		if (temp != 0) {
			return true;
		} else {
			return false;
		}
		}catch(Exception e) {
			System.out.println("Execption occours during fetching"+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean profile(Profile profile) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(profile);
			session.getTransaction().commit();
			//HibernateUtil.shutdown();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e);
			return false;
		}
	}
	@Override
	public boolean bmiCalculator(PatientBMI patientBMI) {
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		PatientBMI patientBMI1= new PatientBMI();
		patientBMI1.setPatientId(patientBMI.getPatientId());
		patientBMI1.setHeight(patientBMI.getHeight());
		patientBMI1.setWeight(patientBMI.getWeight());
		patientBMI1.setCurrentDate(patientBMI.getCurrentDate());
		float h=patientBMI.getHeight();
		float w=patientBMI.getWeight();
		patientBMI1.setBmi(w/(h*h));
		session.save(patientBMI1);
		session.getTransaction().commit();
		//HibernateUtil.shutdown();
		return true;
		}
		catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e);
			return false;
		}
	}
	@Override
	public boolean bloodCount(BloodCount bloodCount) {	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(bloodCount);
		session.getTransaction().commit();
		//HibernateUtil.shutdown();
		return true;
		}
		catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e);
			return false;
		}}
	@Override
	public boolean diabetes(Diabetes diabetes) {	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Diabetes diabetes1 = new Diabetes();
		diabetes1.setPatientId(diabetes.getPatientId());
		diabetes1.setbPDiastolicValue(diabetes.getbPDiastolicValue());
		diabetes1.setbPSystolicValue(diabetes.getbPSystolicValue());
		diabetes1.setFastingGlucose(diabetes.getFastingGlucose());
		diabetes1.sethDLCholesterol(diabetes.gethDLCholesterol());
		diabetes1.setSerumTriglycerides(diabetes.getSerumTriglycerides());
		diabetes1.setBmi(diabetes.getBmi());
		diabetes1.setRiskofDiabetes(50);
		session.save(diabetes1);
		session.getTransaction().commit();
		//HibernateUtil.shutdown();
		return true;
		}
		catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e);
			return false;
		}}
	
	public List<BloodCount> bloodCount(String id)
	{
		//BloodCount bloodCount= new BloodCount();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String selQuery = ("select * from Blood_Count b where b.patientId='"+id+"'");
         Query query = session.createSQLQuery(selQuery);
         return query.list();
		
	}
}
