package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Trainerinfo;



public class Crudoperations 
{
	public boolean insertMovies(Trainerinfo ti) 
	{
		//hibernate logic to insert
		
		//configuration with xml file
		Configuration config=new Configuration();
		config.configure();
		
		//mapping with annotation
		//config.addAnnotatedClass(Movies.class);
		
		//session objects
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		session.save(ti);
		
		//tcl for explicit 
		Transaction tx=session.beginTransaction();
		try
		{
			tx.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
