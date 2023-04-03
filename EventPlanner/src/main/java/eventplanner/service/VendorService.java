package eventplanner.service;

import java.util.List;
import eventplanner.model.User;
import eventplanner.model.UserStatus;
import eventplanner.model.Vendor;
import eventplanner.model.VendorStatus;


import eventplanner.model.Vendor;

public interface VendorService {

	Vendor addRegistionDetailsOfVendor(Vendor vendor);

	Vendor loginForVendor(Vendor vendor);

	VendorStatus updateAdminDetailsByAdmin(Vendor updateVendor);


	VendorStatus getVendor(int idVendor);

	List<Vendor> getAllVendors();

	boolean deleteDetails(int idVendor);
	

}
