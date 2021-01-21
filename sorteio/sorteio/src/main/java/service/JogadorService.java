package service;

import org.springframework.beans.factory.annotation.Autowired;

import repository.JogadorRepository;

public class JogadorService {
	
	@Autowired
	private JogadorRepository repository;
}
