package eventplanner.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eventplanner.model.BookEvent;

@Repository
public interface BookEventRepository extends JpaRepository<BookEvent, Integer> {
	
	boolean existsByIdBookEvent(Long idBookEvent);


	void deleteByIdBookEvent(Long idBookEvent);
	BookEvent findByIdBookEvent(Long idBookEvent);
}
