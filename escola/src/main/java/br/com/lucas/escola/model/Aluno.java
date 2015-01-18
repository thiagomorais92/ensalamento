package br.com.lucas.escola.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "aluno")
public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 1943744432653639073L;

	@Id
	@GeneratedValue
	@Column(name = "ID_ALUNO")
	private int id;
	
	@Column(name = "NOME")
	@NotNull(message = "O nome do aluno não pode estar vazio")
	@Size(min=5, message = "O nome do aluno precisa ter no mínimo 5 caracteres")
	private String nome;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SALA")
	private Sala sala;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public Sala getSala() {
		return sala;
	}

	
}
