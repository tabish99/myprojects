package org.hib;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("first user");
		user.setDate(new Date());
		user.setAddress("my first addressjjj");

		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction(); 
		session.save(user);
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
