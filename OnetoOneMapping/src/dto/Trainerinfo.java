package dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="trainer_info")
public class Trainerinfo 
{
	@Id
	@Column(name="trainer_id")
	private int trainer_id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Column(name="exp")
	private double exp;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainer_pid")
	private Trainerpersonal personalinfo;
	
	
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Trainerinfo [trainer_id=" + trainer_id + ", fname=" + fname + ", lname=" + lname + ", exp=" + exp
				+ ", personalinfo=" + personalinfo + "]";
	}
	
	
}
