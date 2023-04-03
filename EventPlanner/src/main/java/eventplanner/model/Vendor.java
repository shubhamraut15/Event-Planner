package eventplanner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Vendor {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVendor;
	private String name;
	private String email;
	private String address;
	private int number;
	private String password;
	public int getIdVendor() {
		return idVendor;
	}
	public void setIdVendor(int idVendor) {
		this.idVendor = idVendor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return "Vendor [idVendor=" + idVendor + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", number=" + number + ", password=" + password + "]";
	}
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(int idVendor, String name, String email, String address, int number, String password) {
		super();
		this.idVendor = idVendor;
		this.name = name;
		this.email = email;
		this.address = address;
		this.number = number;
		this.password = password;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}