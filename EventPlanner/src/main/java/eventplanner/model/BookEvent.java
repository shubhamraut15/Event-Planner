package eventplanner.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BookEvent {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBookEvent;
    
//	@OneToOne
     private  Long idUser;
     
//    @OneToMany(mappedBy="bookEvent")
//	@OneToOne
     private int serviceId;

	public long getIdBookEvent() {
		return idBookEvent;
	}

	public void setIdBookEvent(int idBookEvent) {
		this.idBookEvent = idBookEvent;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public int getserviceId() {
		return serviceId;
	}

	public void setserviceId(int serviceId) {
		this.serviceId = serviceId;
	}
	@Override
	public String toString() {
		return "BookEvent [idBookEvent=" + idBookEvent + ", idUser=" + idUser + ", idService=" + serviceId + "]";
	}

	public BookEvent(long idBookEvent, Long idUser, int serviceId) {
		super();
		this.idBookEvent = idBookEvent;
		this.idUser = idUser;
		this.serviceId = serviceId;
	}

	public BookEvent() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
}
