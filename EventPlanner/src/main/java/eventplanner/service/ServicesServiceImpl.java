package eventplanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import eventplanner.dao.ServicesServiceRepository;
import eventplanner.model.BookEvent;
import eventplanner.model.BookEventStatus;
import eventplanner.model.Services;
import eventplanner.model.ServicesStatus;
import eventplanner.model.User;
import eventplanner.model.UserStatus;

@Service
public class ServicesServiceImpl implements ServicesService{
   
	@Autowired
	ServicesServiceRepository  servicesServiceRepository;

	@Override
	public Services addServices(Services services) {
		System.out.println("print from service ");
//		ServicesStatus serviceStatus =new ServicesStatus(0,new Services(),"not found");
		Services req= servicesServiceRepository.findByServiceId(services.getServiceId());
				
				
		
		if(req==null)
		{
			Services s =servicesServiceRepository.save(services);
			return s;
		}
		return req;
			
		
	
	}

	@Override
	public ServicesStatus deleteServicesDetailsByAdmin(int serviceId) {
		System.out.println("done!");
		ServicesStatus servicesStatus=new ServicesStatus(0,new Services(),"NOT FOUND");
		Services u1=servicesServiceRepository.findByServiceId(serviceId);
		if(u1==null)
		{
			servicesServiceRepository.deleteByServiceId(serviceId);
			servicesStatus.setStatustatuscode(1);
			servicesStatus.setStatusmessage("got details");
		}
		return servicesStatus;
	}

	@Override
	public ServicesStatus updateServicesDetailsByAdmin(Services updateServices) {
		// TODO Auto-generated method stub
		
		ServicesStatus servicesStatus=new ServicesStatus(0,new Services(),"NOT FOUND");
		Services u1=servicesServiceRepository.findByServiceId(updateServices.getServiceId());
		if(u1==null)
				{  System.out.println("done!");
				servicesServiceRepository.save(updateServices);
				servicesStatus.setServices(updateServices);
				servicesStatus.setStatustatuscode(1);
				servicesStatus.setStatusmessage("got details");
				}
		
		return servicesStatus;
	}

	@Override
	public ServicesStatus getSerivces(int serviceId) {
		// TODO Auto-generated method stub
		ServicesStatus servicesStatus =new ServicesStatus(0,new Services(),"not found");
		Optional<Services> req=servicesServiceRepository.findAllByServiceId(serviceId);
		

		if(req.isPresent())
		{
			servicesStatus.setServices(req.get());
			servicesStatus.setStatustatuscode(1);
			servicesStatus.setStatusmessage("got details");
			
		}
		return servicesStatus;
		
	}

	@Override
	public List<Services> getAllServices() {
		// TODO Auto-generated method stub
		
		 List<Services> s=	servicesServiceRepository.findAll();
		return s;
	}	





}
