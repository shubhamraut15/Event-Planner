package eventplanner.model;

public class AdminStatus {
	
	public AdminStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int adminStatusCode;
	private Admin admin;
	private String adminStatusMessage;
	public int getAdminStatusCode() {
		return adminStatusCode;
	}
	public void setAdminStatusCode(int adminStatusCode) {
		this.adminStatusCode = adminStatusCode;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getAdminStatusMessage() {
		return adminStatusMessage;
	}
	public void setAdminStatusMessage(String adminStatusMessage) {
		this.adminStatusMessage = adminStatusMessage;
	}
	@Override
	public String toString() {
		return "AdminStatus [adminStatusCode=" + adminStatusCode + ", admin=" + admin + ", adminStatusMessage="
				+ adminStatusMessage + "]";
	}
	public AdminStatus(int adminStatusCode, Admin admin, String adminStatusMessage) {
		super();
		this.adminStatusCode = adminStatusCode;
		this.admin = admin;
		this.adminStatusMessage = adminStatusMessage;
	}
	
	

}
