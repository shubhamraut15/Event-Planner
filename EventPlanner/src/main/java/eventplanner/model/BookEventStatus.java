package eventplanner.model;

public class BookEventStatus {
   
	private int bookstatuscode;
	private BookEvent bookEvent;
	private String statusmessage;
	public int getBookstatuscode() {
		return bookstatuscode;
	}
	public void setBookstatuscode(int bookstatuscode) {
		this.bookstatuscode = bookstatuscode;
	}
	public BookEvent getBookEvent() {
		return bookEvent;
	}
	public void setBookEvent(BookEvent bookEvent) {
		this.bookEvent = bookEvent;
	}
	public String getStatusmessage() {
		return statusmessage;
	}
	public void setStatusmessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}
	@Override
	public String toString() {
		return "BookEventStatus [bookstatuscode=" + bookstatuscode + ", bookEvent=" + bookEvent + ", statusmessage="
				+ statusmessage + "]";
	}
	public BookEventStatus(int bookstatuscode, BookEvent bookEvent, String statusmessage) {
		super();
		this.bookstatuscode = bookstatuscode;
		this.bookEvent = bookEvent;
		this.statusmessage = statusmessage;
	}
	public BookEventStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
			
}
