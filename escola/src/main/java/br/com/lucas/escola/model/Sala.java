package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "sala")
public class Sala implements Serializable{

	private static final long serialVersionUID = -390790755655999739L;

	@Id
	@GeneratedValue
	@Column(name = "ID_SALA")
	private Integer id;
	
	@Min(value = 1)
	@Column(name = "CAPACIDADE")
	private Integer capacidade;
	
	@NotNull(message = "Favor colocar um nome para essa turma")
	@Column(name = "NOME_SALA")
	private String nomeSala;
	
	@OneToMany(mappedBy = "sala")
	private Set<Aluno> alunos = new HashSet<Aluno>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public String getNomeSala() {
		return nomeSala;
	}
	
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	
}
