package eventplanner.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventplanner.dao.ServicesServiceRepository;
import eventplanner.dao.VendorRepository;
import eventplanner.model.Vendor;
import eventplanner.model.VendorStatus;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;

	@Autowired
	private ServicesServiceRepository servicesServiceRepository;

	@Override
	public Vendor addRegistionDetailsOfVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		System.out.println("print from service ");
		Vendor v1 = vendorRepository.findByEmail(vendor.getEmail());
		if (v1 == null) {
			Vendor v = vendorRepository.save(vendor);
			return v;
		}

		return v1;
	}

	@Override
	public Vendor loginForVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		System.out.println("login person detail");
		Vendor v1 = vendorRepository.findByEmailAndPassword(vendor.getEmail(), vendor.getPassword());
		return v1;
	}

	
	  @Override public VendorStatus updateAdminDetailsByAdmin(Vendor updateVendor)
	  { // TODO Auto-generated method stub System.out.println("done!");
	  VendorStatus vendorStaus=new VendorStatus(0,new Vendor(),"NOT FOUND..");
	  Vendor v=vendorRepository.findByIdVendor(updateVendor.getIdVendor());
	  if(v==null) { vendorRepository.save(updateVendor);
	  vendorStaus.setVendor(updateVendor); vendorStaus.setStatuscode(1);
	  vendorStaus.setStatusmessage("done successfully");
	  
	  }
	  
	  return vendorStaus ; }
	 

	
	@Override
	public VendorStatus getVendor(int idVendor) {
		// TODO Auto-generated method stub
		VendorStatus vendorStatus =new VendorStatus(0,new Vendor(),"not found");
		Optional<Vendor> req=vendorRepository.findAllByIdVendor(idVendor);
		

		if(req.isPresent())
		{
			vendorStatus.setVendor(req.get());
			vendorStatus.setStatuscode(1);
			vendorStatus.setStatusmessage("got details");
			
		}
		return vendorStatus;
	}

	
	@Override
	 public List<Vendor> getAllVendors() {
	        List<Vendor> vendors = vendorRepository.findAll();
	        List<Vendor> filteredVendors = new ArrayList<>();
	        for (Vendor vendor : vendors) {
	            Vendor filteredVendor = new Vendor();
	            filteredVendor.setIdVendor(vendor.getIdVendor());
	            filteredVendor.setName(vendor.getName());
	            filteredVendor.setEmail(vendor.getEmail());
	            filteredVendor.setAddress(vendor.getAddress());
	            filteredVendor.setNumber(vendor.getNumber());
	            filteredVendors.add(filteredVendor);
	        }
	        return filteredVendors;
	    }

	public boolean deleteDetails(int idVendor) {
	    if (vendorRepository.existsById(idVendor)) {
	        vendorRepository.deleteById(idVendor);
	        return true;
	    } else {
	        return false;
	    }
	}


}
