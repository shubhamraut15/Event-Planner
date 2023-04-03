package eventplanner.service;

import java.util.List;

import eventplanner.model.Services;
import eventplanner.model.ServicesStatus;

public interface ServicesService {

	Services addServices(Services services);


	ServicesStatus deleteServicesDetailsByAdmin(int serviceId);

	ServicesStatus updateServicesDetailsByAdmin(Services updateServices);

	ServicesStatus getSerivces(int serviceId);


	List<Services> getAllServices();


	
}
