package eventplanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventplanner.dao.BookEventRepository;
//import eventplanner.dao.BookEventServiceRepository;
import eventplanner.model.BookEvent;
import eventplanner.model.BookEventStatus;

@Service
public class BookEventServiceImpl implements BookEventService {
    
	@Autowired
	BookEventRepository   bookEventRepository;
	@Override
	public BookEvent BookingForEvent(BookEvent bookEvent) {
		
		BookEventStatus bookStatus =new BookEventStatus(0,new BookEvent(),"not found");
		BookEvent x = bookEventRepository.findByIdBookEvent(bookEvent.getIdBookEvent()) ;

		
		if(x==null)
		{
			BookEvent v=bookEventRepository.save(bookEvent);
			return v;
		}
		return bookEvent;
	}
	

	@Override
	public BookEventStatus updateBookEventDetailsByAdmin(BookEvent updateBookEvent) {
		BookEventStatus bookEventStatus=new BookEventStatus(0,new BookEvent(),"NOT FOUND");
		BookEvent u1=bookEventRepository.findByIdBookEvent(updateBookEvent.getIdBookEvent());
		if(u1==null)
				{  System.out.println("done!");
				bookEventRepository.save(updateBookEvent);
			bookEventStatus.setBookEvent(updateBookEvent);
			bookEventStatus.setBookstatuscode(1);
			bookEventStatus.setStatusmessage("got details");
				}
		
		return bookEventStatus;
	}
	@Override
	public BookEventStatus deleteUserDetailsByAdmin(Long idBookEvent) {
		System.out.println("done!");
		BookEventStatus bookEventStatus=new BookEventStatus(0,new BookEvent(),"NOT FOUND");
		boolean u1=bookEventRepository.existsByIdBookEvent(idBookEvent);
				
		if(u1)
		{
			bookEventRepository.deleteByIdBookEvent(idBookEvent);
			bookEventStatus.setBookstatuscode(1);
			bookEventStatus.setStatusmessage("got details");
		}
		return bookEventStatus;
	}


}
