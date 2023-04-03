package eventplanner.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VendorServices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "vendor_id", referencedColumnName = "id", nullable = false)
    private Vendor vendor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "services_id", referencedColumnName = "id", nullable = false)
   
    private Services services;

    public String getName() {
    	return vendor.getName();
    	}

    	public int getNumber() {
    	return vendor.getNumber();
    	}
    	public String getServices1() {
        	return services.getService1();
        	}
    	public String getServices2() {
        	return services.getService2();
        	}
    	public String getServices3() {
        	return services.getService3();
        	}

    	public String getServices4() {
    	return services.getService4();
    	}

    // getters and setters
}


