package eventplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eventplanner.model.BookEvent;
import eventplanner.model.BookEventStatus;
import eventplanner.service.BookEventService;

@RestController
public class BookEventController {
	
	@Autowired
	BookEventService   bookEventService;
	@PostMapping("/bookevent")
	public ResponseEntity<?> BookingForEvent(@RequestBody BookEvent bookEvent)
	{      
		BookEvent req=bookEventService.BookingForEvent(bookEvent);
		 if (req != null) {
			 return new ResponseEntity<BookEvent>(req, HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Id's are incorrect...", HttpStatus.UNAUTHORIZED);	
		}
	
	}
		
	
	@PutMapping("/updatebookevent")
	public ResponseEntity<BookEventStatus> updateUserDetailsByAdmin(@RequestBody BookEvent updateBookEvent)
	{   System.out.println("done!");    
	BookEventStatus u=bookEventService.updateBookEventDetailsByAdmin(updateBookEvent);
	          ResponseEntity<BookEventStatus> u1=null;
	        if(u.getBookstatuscode()==0)
	             u1=new ResponseEntity<BookEventStatus>(u,HttpStatus.NOT_FOUND);
	        else
	        	u1=new ResponseEntity<BookEventStatus>(u,HttpStatus.OK);
	        	
		return u1;
		
	}
	@DeleteMapping("/deletebookevent/{idBookEvent}")
	public ResponseEntity<BookEventStatus> deleteBookEventDetailsByAdmin(@PathVariable Long idBookEvent)
	{            BookEventStatus u1= bookEventService.deleteUserDetailsByAdmin(idBookEvent);
		    return new ResponseEntity<BookEventStatus>(u1,HttpStatus.OK);
	}
	
}
