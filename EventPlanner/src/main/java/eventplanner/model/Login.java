package eventplanner.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	private String name;

	private String mailid;

	@Override
	public String toString() {
		return "Login [name=" + name + ", mailid=" + mailid + ", mobileno=" + mobileno + "]";
	}

	@Id
	private int mobileno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public Login(String name, String mailid, int mobileno) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.mobileno = mobileno;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
}
