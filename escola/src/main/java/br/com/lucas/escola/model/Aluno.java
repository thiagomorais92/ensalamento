package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "aluno")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Aluno extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1943744432653639073L;

    private String matricula;
    private String profissao;
    private String etapa;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "aluno_has_turma", joinColumns={@JoinColumn(name="id_aluno")}, inverseJoinColumns={@JoinColumn(name="id_curso")})
    private List<Turma> turmas;
    
    @Column(name = "INDICADOR_1")
    private String indicador1;
    
    @Column(name = "INDICADOR_2")
    private String indicador2;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "aluno")
    private List<Fatura> faturas;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public String getIndicador1() {
		return indicador1;
	}

	public void setIndicador1(String indicador1) {
		this.indicador1 = indicador1;
	}

	public String getIndicador2() {
		return indicador2;
	}

	public void setIndicador2(String indicador2) {
		this.indicador2 = indicador2;
	}

	public List<Fatura> getFaturas() {
		return faturas;
	}

	public void setFaturas(List<Fatura> faturas) {
		this.faturas = faturas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((etapa == null) ? 0 : etapa.hashCode());
		result = prime * result + ((faturas == null) ? 0 : faturas.hashCode());
		result = prime * result
				+ ((indicador1 == null) ? 0 : indicador1.hashCode());
		result = prime * result
				+ ((indicador2 == null) ? 0 : indicador2.hashCode());
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result
				+ ((profissao == null) ? 0 : profissao.hashCode());
		result = prime * result + ((turmas == null) ? 0 : turmas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (etapa == null) {
			if (other.etapa != null)
				return false;
		} else if (!etapa.equals(other.etapa))
			return false;
		if (faturas == null) {
			if (other.faturas != null)
				return false;
		} else if (!faturas.equals(other.faturas))
			return false;
		if (indicador1 == null) {
			if (other.indicador1 != null)
				return false;
		} else if (!indicador1.equals(other.indicador1))
			return false;
		if (indicador2 == null) {
			if (other.indicador2 != null)
				return false;
		} else if (!indicador2.equals(other.indicador2))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (profissao == null) {
			if (other.profissao != null)
				return false;
		} else if (!profissao.equals(other.profissao))
			return false;
		if (turmas == null) {
			if (other.turmas != null)
				return false;
		} else if (!turmas.equals(other.turmas))
			return false;
		return true;
	}
    
    
    
    

	
}
