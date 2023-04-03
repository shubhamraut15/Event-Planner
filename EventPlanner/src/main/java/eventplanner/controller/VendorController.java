package eventplanner.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eventplanner.model.Vendor;
import eventplanner.model.VendorStatus;
import eventplanner.service.VendorService;
import eventplanner.service.VendorServicesService;

@CrossOrigin(origins = "*")
@RestController
public class VendorController {

	@Autowired
	VendorService vendorService;

	@PostMapping("/registervendor")
	public ResponseEntity<Vendor> addRegistrationDetailsOfVendor(@RequestBody Vendor vendor) {
		Vendor res = vendorService.addRegistionDetailsOfVendor(vendor);
		return new ResponseEntity<Vendor>(res, HttpStatus.CREATED);

	}

	@PostMapping("/loginvendor")
	public ResponseEntity<?> loginForVendor(@RequestBody Vendor vendor) {
		Vendor req = vendorService.loginForVendor(vendor);
		if (req != null) {
			return new ResponseEntity<Vendor>(req, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Email or Password are incorrect...", HttpStatus.UNAUTHORIZED);
		}

	}

	@Autowired
	private VendorServicesService vendorServicesService;

	@GetMapping("/vendor-services")
	public List<Map<String, Object>> getAllVendorServices() {
		return vendorServicesService.getAllVendorServices();
	}

	@PutMapping("/updatevendor")
	public ResponseEntity<VendorStatus> updateUserDetailsByAdmin(@RequestBody Vendor updateVendor) {
		System.out.println("done!");
		VendorStatus u = vendorService.updateAdminDetailsByAdmin(updateVendor);
		ResponseEntity<VendorStatus> u1 = null;
		if (u.getStatuscode() == 0)
			u1 = new ResponseEntity<VendorStatus>(u, HttpStatus.NOT_FOUND);
		else
			u1 = new ResponseEntity<VendorStatus>(u, HttpStatus.OK);

		return u1;

	}

	
	@GetMapping("/getvendor/{idVendor}")
	public ResponseEntity<VendorStatus> getVendor(@PathVariable int idVendor) {
		VendorStatus s = vendorService.getVendor(idVendor);
		ResponseEntity<VendorStatus> u1 = null;
		if (s.getStatuscode() == 0)
			u1 = new ResponseEntity<VendorStatus>(s, HttpStatus.NOT_FOUND);
		else
			u1 = new ResponseEntity<VendorStatus>(s, HttpStatus.OK);

		return u1;

//		return new ResponseEntity<ServicesStatus>(s,HttpStatus.OK);

	}
	 @GetMapping("/aaaa")
	    public ResponseEntity<List<Vendor>> getAllVendors() {
	        List<Vendor> vendors = vendorService.getAllVendors();
	        return ResponseEntity.ok(vendors);
	    }
	 @DeleteMapping("/{idVendor}")
	 public boolean deleteVendor(@PathVariable int idVendor) {
	     return vendorService.deleteDetails(idVendor);
	 }


}
