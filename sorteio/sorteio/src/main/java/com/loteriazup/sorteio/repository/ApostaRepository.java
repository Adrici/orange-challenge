package com.loteriazup.sorteio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.loteriazup.sorteio.model.ApostaModel;

@Repository
public interface ApostaRepository extends JpaRepository <ApostaModel, Long>{
	public List<ApostaModel> findAllById(long id);
} 

