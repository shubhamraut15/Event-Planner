package eventplanner.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import eventplanner.model.User;
import eventplanner.model.UserStatus;
import eventplanner.model.Vendor;
import eventplanner.service.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> addRegistionDetails(@RequestBody User user) {
		User res = userService.addRegistionDetails(user);
		return new ResponseEntity<User>(res, HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		User req = userService.getUserDetails(user);
		if (req != null) {
			return new ResponseEntity<User>(req, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Email or Password are incorrect...", HttpStatus.UNAUTHORIZED);
		}

	}
	 @GetMapping("/userdetails")
	    public ResponseEntity<List<User>> getAllUser() {
	        List<User> user = userService.getAllUser();
	        return ResponseEntity.ok(user);
	    }
	 @PutMapping("/updateuser")
		public ResponseEntity<UserStatus> updateUserDetailsByAdmin(@RequestBody User updateUser)
		{   System.out.println("done!");    
			UserStatus u=userService.updateUserDetailsByAdmin(updateUser);
		          ResponseEntity<UserStatus> u1=null;
		        if(u.getStatuscode()==0)
		             u1=new ResponseEntity<UserStatus>(u,HttpStatus.NOT_FOUND);
		        else
		        	u1=new ResponseEntity<UserStatus>(u,HttpStatus.OK);
		        	
			return u1;
			
		}
		
		@DeleteMapping("/deleteuser/{idUser}")
		public boolean deleteUserDetails(@PathVariable int idUser)
		{
			
			return userService.deleteUserDetails(idUser);
		}
		
		
		@GetMapping("/getuser/{idUser}")
		public ResponseEntity<UserStatus> getUser(@PathVariable int idUser)
		{
			UserStatus s=userService.getUser(idUser);
			  ResponseEntity<UserStatus> u1=null;
		        if(s.getStatuscode()==0)
		             u1=new ResponseEntity<UserStatus>(s,HttpStatus.NOT_FOUND);
		        else
		        	u1=new ResponseEntity<UserStatus>(s,HttpStatus.OK);
		        	
			return u1;
	     }
}
