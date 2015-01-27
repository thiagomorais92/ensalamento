package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Lucas Moreira
 * Entidade que representa uma turma de alunos
 */

@Entity
@Table(name = "turma")
public class Turma implements Serializable{

	private static final long serialVersionUID = -390790755655999739L;

	@Id
	@GeneratedValue
	@Column(name = "COD_TURMA")
	private Integer codTurma;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "COD_CURSO")
	private Curso curso;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@ManyToMany(mappedBy="turmas")
	private Set<Aluno> alunos;

	@OneToMany
	private List<DiaDaSemana> diasDaSemana;
	
	@Column(name = "VAGAS")
	private Integer vagas;
	
	@Column(name = "DT_INICIO")
	@Temporal(TemporalType.DATE)
	private Date dataDeInicio;

	public Integer getCodTurma() {
		return codTurma;
	}

	public void setCodTurma(Integer codTurma) {
		this.codTurma = codTurma;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<DiaDaSemana> getDiasDaSemana() {
		return diasDaSemana;
	}

	public void setDiasDaSemana(List<DiaDaSemana> diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}

	public Integer getVagas() {
		return vagas;
	}

	public void setVagas(Integer vagas) {
		this.vagas = vagas;
	}

	public Date getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		result = prime * result
				+ ((codTurma == null) ? 0 : codTurma.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result
				+ ((dataDeInicio == null) ? 0 : dataDeInicio.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((diasDaSemana == null) ? 0 : diasDaSemana.hashCode());
		result = prime * result + ((vagas == null) ? 0 : vagas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (codTurma == null) {
			if (other.codTurma != null)
				return false;
		} else if (!codTurma.equals(other.codTurma))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (dataDeInicio == null) {
			if (other.dataDeInicio != null)
				return false;
		} else if (!dataDeInicio.equals(other.dataDeInicio))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (diasDaSemana == null) {
			if (other.diasDaSemana != null)
				return false;
		} else if (!diasDaSemana.equals(other.diasDaSemana))
			return false;
		if (vagas == null) {
			if (other.vagas != null)
				return false;
		} else if (!vagas.equals(other.vagas))
			return false;
		return true;
	}

	
	

}
