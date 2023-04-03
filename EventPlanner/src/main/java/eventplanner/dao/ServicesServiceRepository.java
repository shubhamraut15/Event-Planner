package eventplanner.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eventplanner.model.Services;
import eventplanner.model.User;

@Repository
public interface ServicesServiceRepository extends JpaRepository<Services, Integer> {

	Services findByServiceId(int serviceId);




	void deleteByServiceId(int serviceId);




	Optional<Services> findAllByServiceId(int serviceId);

	

	
}
