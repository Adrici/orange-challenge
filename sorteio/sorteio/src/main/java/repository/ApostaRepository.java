package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.ApostaModel;

@Repository
public interface ApostaRepository extends JpaRepository<ApostaModel, Long>{
	public List<ApostaModel> findAllByTituloContainingIgnoreCase (String titulo); 
}