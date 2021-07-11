package OnetoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import OnetoOne.UserDetails;
import OnetoOne.Vehicle;

public class MainMapping {

	public static void main(String[] args) 
	{
		UserDetails user=new UserDetails();
		user.setUsername("sow");
		user.setUserid(2);
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehiclename("bike");
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.setVehiclename("jeep");
		
		user.setVehicle(vehicle);
		user.setVehicle(vehicle1);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory fact=con.buildSessionFactory();
		Session session=fact.openSession();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle1);
		
		Transaction tx=session.beginTransaction();
		tx.commit();

	}

}
