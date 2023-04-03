package eventplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eventplanner.model.Admin;
import eventplanner.service.AdminService;

@CrossOrigin(origins = "*")
@RestController
public class AdminController {

	@Autowired
	AdminService adminService;

	@PostMapping("/addminlogin")
	public ResponseEntity<?> login(@RequestBody Admin admin) {
		Admin req = adminService.getAdminDetails(admin);
		if (req != null) {
			return new ResponseEntity<Admin>(req, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Email or Password are incorrect...", HttpStatus.UNAUTHORIZED);
		}

	}
}
