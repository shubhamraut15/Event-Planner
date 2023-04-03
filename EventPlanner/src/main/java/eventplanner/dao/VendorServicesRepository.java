package eventplanner.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eventplanner.model.VendorServices;



@Repository
public interface VendorServicesRepository extends JpaRepository<VendorServices, Long> {

}
