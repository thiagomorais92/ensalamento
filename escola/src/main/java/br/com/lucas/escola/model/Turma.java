package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Lucas Moreira
 * Entidade que representa uma turma de alunos
 */

@Entity
@Table(name = "TURMA")
public class Turma implements Serializable{

	private static final long serialVersionUID = -390790755655999739L;

	@Id
	@GeneratedValue
	private Integer codTurma;
	
	private Curso curso;
	
	private String descricao;
	
		

	
}
