package eventplanner.service;

import eventplanner.model.BookEvent;
import eventplanner.model.BookEventStatus;

public interface BookEventService {

	BookEvent BookingForEvent(BookEvent bookEvent);

	BookEventStatus updateBookEventDetailsByAdmin(BookEvent updateBookEvent);

	

	BookEventStatus deleteUserDetailsByAdmin(Long idBookEvent);


}
