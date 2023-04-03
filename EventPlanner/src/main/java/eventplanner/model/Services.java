package eventplanner.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Services {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceId;

	private String service1;
	private String service2;
	private String service3;
	private String service4;

//	@OneToOne(mappedBy="services")

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getService1() {
		return service1;
	}

	public void setService1(String service1) {
		this.service1 = service1;
	}

	public String getService2() {
		return service2;
	}

	public void setService2(String service2) {
		this.service2 = service2;
	}

	public String getService3() {
		return service3;
	}

	public void setService3(String service3) {
		this.service3 = service3;
	}

	public String getService4() {
		return service4;
	}

	public void setService4(String service4) {
		this.service4 = service4;
	}

	@Override
	public String toString() {
		return "Services [serviceId=" + serviceId + ", service1=" + service1 + ", service2=" + service2 + ", service3="
				+ service3 + ", service4=" + service4 + ", ]";
	}

	public Services(int serviceId, String service1, String service2, String service3, String service4) {
		super();
		this.serviceId = serviceId;
		this.service1 = service1;
		this.service2 = service2;
		this.service3 = service3;
		this.service4 = service4;

	}

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@ManyToOne
//	private BookEvent bookEvent;

}
