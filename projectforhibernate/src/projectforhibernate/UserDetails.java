package projectforhibernate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	private String username;
	
	public UserDetails()
	{
		super();
	}
	public UserDetails(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
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
	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", username=" + username + "]";
	}
	

}
