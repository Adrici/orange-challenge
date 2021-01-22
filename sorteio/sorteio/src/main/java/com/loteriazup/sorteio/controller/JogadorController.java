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

import com.loteriazup.sorteio.model.JogadorModel;
import com.loteriazup.sorteio.repository.JogadorRepository;


@RestController
@RequestMapping("/jogador")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JogadorController {


		@Autowired
		private JogadorRepository repository;

		
		@GetMapping
		public ResponseEntity<List<JogadorModel>> GetAll() {
			return ResponseEntity.ok(repository.findAll());
		}
		
		@GetMapping("/jogadoremail/{email}")
		public ResponseEntity<List<JogadorModel>>GetByEmail(@PathVariable String email){
			return ResponseEntity.ok(repository.findAllByEmailContainingIgnoreCase(email)); 
		}

		@PostMapping
		public ResponseEntity<JogadorModel> post (@RequestBody JogadorModel jogador){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(jogador));
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}
}
