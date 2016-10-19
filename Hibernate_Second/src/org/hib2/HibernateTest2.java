package org.hib2;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HibernateTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails2 user=new UserDetails2();
		Address addr=new Address();
		addr.setCity("DELHI");
		addr.setStreet("mandir wali gali");
		addr.setState("UP.");
	    addr.setPincode("110025");
		
	    user.setUserId(1);
		user.setUserName("First user");
		user.setDate(new Date());
		user.setAddress(addr);

		
		SessionFactory sf=new Configuration().configure("myhibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	//	session.close();
		
		
		
		// sf=new Configuration().configure("myhibernate.cfg.xml").buildSessionFactory();
		 //session=sf.openSession();
		 
	
		 Criteria criteria = session.createCriteria(UserDetails2.class);
		 criteria= criteria.add(Restrictions.eq("userId",1));

		/*ProjectionList pr= Projections.projectionList();*/
		 
				// criteria=criteria.setProjection(Projections.property("userId"));
				criteria=criteria.setProjection(Projections.property("userName"));
		 
		  
		List ud2= criteria.list();
		
		
		for(Object ud:ud2)
			{
				String s=(String)ud.toString();
				
				System.out.println("USER DETAILS IS : "+s);
			}
		
		
		
		
		
		
	}

}
