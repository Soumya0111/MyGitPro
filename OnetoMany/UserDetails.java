package OnetoMany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import OnetoOne.Vehicle;

@Entity
@Table(name="userdetails")	
public class UserDetails
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	private String username;

	@OneToMany
	private Collection <Vehicle> vehicle=new ArrayList<Vehicle>();
	
	
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public UserDetails(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", username=" + username + "]";
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}