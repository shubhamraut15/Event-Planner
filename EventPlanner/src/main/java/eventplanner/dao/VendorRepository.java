package eventplanner.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eventplanner.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

	Vendor findByEmail(String email);

	Vendor findByEmailAndPassword(String email, String password);

	Vendor findByIdVendor(int idVendor);
	

	void deleteByIdVendor(int idVendor);

	Optional<Vendor> findAllByIdVendor(int idVendor);

	void deleteById(int idVendor);

	boolean existsByIdVendor(int idVendor);
}
