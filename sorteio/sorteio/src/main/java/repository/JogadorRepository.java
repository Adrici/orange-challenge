package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.JogadorModel;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorModel, Long>{
	public List<JogadorModel> findAllByEmailContainingIgnoreCase (String email);

}
 