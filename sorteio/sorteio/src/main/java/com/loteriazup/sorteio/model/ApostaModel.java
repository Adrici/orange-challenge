package com.loteriazup.sorteio.model;

import java.util.Date;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="apostas")
public class ApostaModel {
	
	Random random = new Random();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size(min =5, max=15)
	private String titulo;
	
	@NotNull
	private int n1 = random.nextInt(99);
	
	@NotNull
	private int n2 = random.nextInt(99);
	
	@NotNull
	private int n3 = random.nextInt(99);
	
	@NotNull
	private int n4 = random.nextInt(99);
	
	@NotNull
	private int n5 = random.nextInt(99);
	
	@NotNull
	private int n6 = random.nextInt(99);
	
	@ManyToOne
	@JsonIgnoreProperties("aposta")
	private JogadorModel jogador;
	
	//getters and setters 

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

	public int getN4() {
		return n4;
	}

	public void setN4(int n4) {
		this.n4 = n4;
	}

	public int getN5() {
		return n5;
	}

	public void setN5(int n5) {
		this.n5 = n5;
	}

	public int getN6() {
		return n6;
	}

	public void setN6(int n6) {
		this.n6 = n6;
	}

	public JogadorModel getJogador() {
		return jogador;
	}

	public void setJogador(JogadorModel jogador) {
		this.jogador = jogador;
	}
	
	

	
	
}
	