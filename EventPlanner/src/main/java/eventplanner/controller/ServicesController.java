package eventplanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eventplanner.model.Services;
import eventplanner.model.ServicesStatus;
import eventplanner.service.ServicesService;

@RestController
public class ServicesController {
     
	@Autowired
	ServicesService  servicesService;
	
	@PostMapping("/addservices")
	public ResponseEntity<Services> addServices(@RequestBody Services services)
	{
		Services res=	servicesService.addServices(services);
		
		return new ResponseEntity<Services>(res, HttpStatus.CREATED);
	}
	@PutMapping("/updateservices")
	public ResponseEntity<ServicesStatus> updateUserDetailsByAdmin(@RequestBody Services updateServices)
	{   System.out.println("done!");    
	ServicesStatus u=servicesService.updateServicesDetailsByAdmin(updateServices);
	          ResponseEntity<ServicesStatus> u1=null;
	        if(u.getStatustatuscode()==0)
	             u1=new ResponseEntity<ServicesStatus>(u,HttpStatus.NOT_FOUND);
	        else
	        	u1=new ResponseEntity<ServicesStatus>(u,HttpStatus.OK);
	        	
		return u1;
		
	}
	@DeleteMapping("/deleteservices/{serviceId}")
	public ResponseEntity<ServicesStatus> deleteServicesDetailsByAdmin(@PathVariable int serviceId)
	{            ServicesStatus u1= servicesService.deleteServicesDetailsByAdmin(serviceId);
		    return new ResponseEntity<ServicesStatus>(u1,HttpStatus.OK);
	}
	
	@GetMapping("/getservices/{serviceId}")
	public ResponseEntity<ServicesStatus> getServices(@PathVariable int serviceId)
	{
		ServicesStatus s=servicesService.getSerivces(serviceId);
		  ResponseEntity<ServicesStatus> u1=null;
	        if(s.getStatustatuscode()==0)
	             u1=new ResponseEntity<ServicesStatus>(s,HttpStatus.NOT_FOUND);
	        else
	        	u1=new ResponseEntity<ServicesStatus>(s,HttpStatus.OK);
	        	
		return u1;

//		return new ResponseEntity<ServicesStatus>(s,HttpStatus.OK);
	

	}
	@GetMapping("/getallservices")
	public List<Services> getAllServices()
	{
		return servicesService.getAllServices();
	}
	
}
