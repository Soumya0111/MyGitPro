package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer_personal")
public class Trainerpersonal 
{
	@Id
	@Column(name="trainer_pid")
	private int trainer_pid;
	@Column(name="gname")
	private String gname;
	@Column(name="place")
	private String place;
	@Column(name="status")
	private String status;
	
	public int getTrainer_pid() {
		return trainer_pid;
	}
	public void setTrainer_pid(int trainer_pid) {
		this.trainer_pid = trainer_pid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	@Override
	public String toString() {
		return "Trainerpersonal [trainer_pid=" + trainer_pid + ", gname=" + gname + ", place=" + place + ", status="
				+ status + "]";
	}
	
	
}
