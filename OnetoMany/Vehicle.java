package OnetoMany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table (name="vehicledetails")
public class Vehicle
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehicleid;
	private String vehiclename;
	
	

	
	

	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", vehiclename=" + vehiclename + "]";
	}
	public Vehicle(int vehicleid, String vehiclename) {
		super();
		this.vehicleid = vehicleid;
		this.vehiclename = vehiclename;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
