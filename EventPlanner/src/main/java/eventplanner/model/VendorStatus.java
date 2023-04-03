package eventplanner.model;

public class VendorStatus {
    
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public String getStatusmessage() {
		return statusmessage;
	}
	public void setStatusmessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}
	private int statuscode;
	private Vendor vendor;
	private String statusmessage;
	public VendorStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VendorStatus(int statuscode, Vendor vendor, String statusmessage) {
		super();
		this.statuscode = statuscode;
		this.vendor = vendor;
		this.statusmessage = statusmessage;
	}
	@Override
	public String toString() {
		return "vendorStatus [statuscode=" + statuscode + ", vendor=" + vendor + ", statusmessage=" + statusmessage
				+ "]";
	}
	
	
}
