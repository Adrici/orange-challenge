package com.loteriazup.sorteio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loteriazup.sorteio.model.ApostaModel;
import com.loteriazup.sorteio.repository.ApostaRepository;

@RestController
@RequestMapping("/apostas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ApostaController {
	
	@Autowired
	private ApostaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ApostaModel>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ApostaModel> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	

	@PostMapping
	public ResponseEntity<ApostaModel> post (@RequestBody ApostaModel apostas) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(apostas));
	}
	
	 
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}	

	
}
