package eventplanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventplanner.dao.AdminRepository;
import eventplanner.model.Admin;

@Service
public class AdminServiceImpl implements AdminService{
      
	@Autowired
	AdminRepository  adminRepository;
	


	@Override
	public Admin getAdminDetails(Admin admin) {
		System.out.println("login person detail");
		Admin a1= adminRepository.findByEmailAndPassword(admin.getEmail(),admin.getPassword());
		return a1;
	}

}
