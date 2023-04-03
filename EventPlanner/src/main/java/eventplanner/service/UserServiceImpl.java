package eventplanner.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventplanner.dao.UserRepository;
import eventplanner.model.User;
import eventplanner.model.UserStatus;
import eventplanner.model.Vendor;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addRegistionDetails(User user) {
		System.out.println("print from service ");
		User u1 = userRepository.findByEmail(user.getEmail());
		if (u1 == null) {
			User u = userRepository.save(user);
			return u;
		}
		return u1;

	}

	@Override
	public User getUserDetails(User user) {
		System.out.println("login person detail");
		User u1 = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		return u1;

	}
	
	@Override
	public List<User> getAllUser() {
	    List<User> users = userRepository.findAll();
	    List<User> filteredUser = new ArrayList<>();
	    for (User user : users) {
	        User filteredUser1 = new User();
	        filteredUser1.setId(user.getId());
	        filteredUser1.setName(user.getName());
	        filteredUser1.setEmail(user.getEmail());
	        filteredUser.add(filteredUser1);
	    }
	    return filteredUser;
	}

	@Override
	public UserStatus updateUserDetailsByAdmin(User updateUser) {
		// TODO Auto-generated method stub
		UserStatus userstatus=new UserStatus(0,new User(),"NOT FOUND");
		User u1= userRepository.findById(updateUser.getId());
		if(u1==null)
				{  System.out.println("done!");
			userRepository.save(updateUser);
			userstatus.setUser(updateUser);
			userstatus.setStatuscode(1);
			userstatus.setStatusmessage("got details");
				}
		
		return userstatus;
	}

	@Override
	public boolean deleteUserDetails( int idUser ) {
		// TODO Auto-generated method stub
		System.out.println("done!");
//		VendorStatus vendorStaus=new VendorStatus(0,new Vendor(),"NOT FOUND..");
		
		if(userRepository.existsById(idUser))
		{
			userRepository.deleteById(idUser);
			return true;
			
		}
		return false ;
	}

	@Override
	public UserStatus getUser(int idUser) {
		// TODO Auto-generated method stub
		UserStatus userStatus =new UserStatus(0,new User(),"not found");
		Optional<User> req=userRepository.findAllById(idUser);
		

		if(req.isPresent())
		{
			userStatus.setUser(req.get());
			userStatus.setStatuscode(1);
			userStatus.setStatusmessage("got details");
			
		}
		return userStatus;
	}
}
