package model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "jagador")
public class JogadorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min= 5, max=100)
	private String nome;
	 
	@NotNull
	@Size(min= 10, max=100)
	private String email;
	
	@OneToMany(mappedBy = "jogador", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("jogador")
	private List<ApostaModel> aposta;
  
	//Getters and Setters 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ApostaModel> getAposta() {
		return aposta;
	}

	public void setAposta(List<ApostaModel> aposta) {
		this.aposta = aposta;
	} 


	
	

	
}
