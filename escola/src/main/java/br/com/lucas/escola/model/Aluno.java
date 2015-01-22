package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Aluno extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1943744432653639073L;

    private String matricula;
    private String profissao;
    private String etapa;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "aluno_has_curso", joinColumns={@JoinColumn(name="id_aluno")}, inverseJoinColumns={@JoinColumn(name="id_curso")})
    private List<Curso> cursos;

	
}
