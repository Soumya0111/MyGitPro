package projectforhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate {

	public static void main(String[] args) 
	{
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserDetails.class);
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		//to insert
		
		UserDetails user=new UserDetails();
		UserDetails user1= new UserDetails();
		
		user.setUserid(4);
		user.setUsername("hello");
		
		/*user1.setUserid(3);
		user1.setUsername("Speakers");
		*/
		session.save(user);
		//session.save(user1);
		
		
		//to read
		/*UserDetails user= session.get(UserDetails.class, 3);
		System.out.println(user.getUsername());	
	*/
		
		/*
		//to delete
		UserDetails user=session.get(UserDetails.class, 1);
		session.delete(user);
		
		*/
		
		//to update
		
//		UserDetails user=session.get(UserDetails.class, 1);
//		user.setUsername("TV");
//		session.update(user);
//		
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
	
	}

}
