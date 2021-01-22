package com.loteriazup.sorteio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loteriazup.sorteio.model.JogadorModel;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorModel, Long>{
	public List<JogadorModel> findAllByEmailContainingIgnoreCase (String email);

}
 