package eventplanner.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventplanner.dao.VendorServicesRepository;
import eventplanner.model.Services;
import eventplanner.model.Vendor;
import eventplanner.model.VendorServices;

@Service
public class VendorServicesService implements VendorServicesS {


	@Autowired
	private VendorServicesRepository vendorServicesRepository;

	public List<Map<String, Object>> getAllVendorServices() {
	    List<VendorServices> vendorServicesList = vendorServicesRepository.findAll();
	    List<Map<String, Object>> result = new ArrayList<>();
	    for (VendorServices vendorServices : vendorServicesList) {
	        Map<String, Object> vendorServicesMap = new HashMap<>();
	        vendorServicesMap.put("name", vendorServices.getName());
	        vendorServicesMap.put("number", vendorServices.getNumber());
	        vendorServicesMap.put("services1", vendorServices.getServices1());
	        vendorServicesMap.put("services2", vendorServices.getServices2());
	        vendorServicesMap.put("services3", vendorServices.getServices3());
	        vendorServicesMap.put("services4", vendorServices.getServices4());
	        result.add(vendorServicesMap);
	    }
	    return result;
	}

	}



