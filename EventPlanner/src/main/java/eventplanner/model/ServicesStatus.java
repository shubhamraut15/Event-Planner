package eventplanner.model;

public class ServicesStatus {
	private int statustatuscode;
	private Services services;
	public int getStatustatuscode() {
		return statustatuscode;
	}
	public void setStatustatuscode(int statustatuscode) {
		this.statustatuscode = statustatuscode;
	}
	public Services getServices() {
		return services;
	}
	public void setServices(Services services) {
		this.services = services;
	}
	public String getStatusmessage() {
		return statusmessage;
	}
	public void setStatusmessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}
	private String statusmessage;
	@Override
	public String toString() {
		return "ServicesStatus [statustatuscode=" + statustatuscode + ", services=" + services + ", statusmessage="
				+ statusmessage + "]";
	}
	public ServicesStatus(int statustatuscode, Services services, String statusmessage) {
		super();
		this.statustatuscode = statustatuscode;
		this.services = services;
		this.statusmessage = statusmessage;
	}
	public ServicesStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
