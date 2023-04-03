package eventplanner.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import eventplanner.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);

	User findByEmailAndPassword(String email, String pass);

	User findById(int id);

	Optional<User> findAllById(int id);

	boolean existsById(int id);

	@Transactional
	@Modifying
	void deleteById(int id);


}
