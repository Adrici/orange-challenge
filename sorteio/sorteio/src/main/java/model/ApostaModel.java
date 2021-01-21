package model;

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
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "aposta") 
public class ApostaModel {
	
	Random random = new Random();
	

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String titulo;
	 
	@NotNull
	@Positive
	private int n1 = random.nextInt(99);
	
	@NotNull
	@Positive
	private int n2 = random.nextInt(99);
	
	@NotNull
	@Positive
	private int n3 = random.nextInt(99);
	
	@NotNull
	@Positive
	private int n4 = random.nextInt(99);
	
	@NotNull
	@Positive
	private int n5 = random.nextInt(99);
	
	@NotNull
	@Positive
	private int n6 = random.nextInt(99);
	

	@Temporal(TemporalType.TIMESTAMP)
    private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne 
	@JsonIgnoreProperties("aposta")
	private JogadorModel jogador;
}
