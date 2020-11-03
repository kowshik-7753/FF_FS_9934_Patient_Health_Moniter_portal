package com.hcl.phmp.repository;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hcl.phmp.model.Login;
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
			Users user1 = new Users();
			user1.setUserId("12346");
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
			HibernateUtil.shutdown();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e);
			return false;
		}
	}

	@Override
	public boolean login(Login login) {
	try {
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory factory = meta.getSessionFactoryBuilder().build();
			Session session = factory.openSession();
			Query query = session.createQuery("select * from Users");
			List<Users> userlist = query.list();
			for (Users user : userlist) {
			System.out.println(user.getUserId());
			
				if (user.getUserId().equals(login.getUserName()) && user.getPassword().equals(login.getPassword())) {
					return true;
				}

			}
			return false;
		} catch (Exception e) {
			System.out.println("Error occured during fetching the data " + e.getMessage());
			return false;
		}
		//return true;
	}
	@Override
	public boolean profile(Profile profile) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Profile profile1 = new Profile();
			profile1.setUserName(profile.getUserName());
			profile1.setPassword(profile.getPassword());
			profile1.setGender(profile.getGender());
			profile1.setDateOfBirth(profile.getDateOfBirth());
			profile1.setContactNumber(profile.getContactNumber());
			profile1.setAddress(profile.getAddress());
			profile1.setEmail(profile.getEmail());
			profile1.setCountry(profile.getCountry());
			profile1.setCity(profile.getCity());
			profile1.setPinCode(profile.getPinCode());
			session.save(profile1);
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
		} catch (Exception e) {
			System.out.println("Exception occured during inserting data:" + e);
			return false;
		}
	}

}
