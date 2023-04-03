package eventplanner.model;

public class UserStatus {
	private int statuscode;
	private User user;
	private String statusmessage;

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatusmessage() {
		return statusmessage;
	}

	public void setStatusmessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}

	public UserStatus(int statuscode, User user, String statusmessage) {
		super();
		this.statuscode = statuscode;
		this.user = user;
		this.statusmessage = statusmessage;
	}

	public UserStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

}
