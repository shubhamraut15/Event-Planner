package eventplanner.service;

import java.util.List;

import eventplanner.model.User;
import eventplanner.model.UserStatus;

public interface UserService {
	User addRegistionDetails(User user);

	User getUserDetails(User user);

	List<User> getAllUser();

	UserStatus updateUserDetailsByAdmin(User updateUser);


	


	boolean deleteUserDetails(int idUser);


	UserStatus getUser(int idUser);

}
