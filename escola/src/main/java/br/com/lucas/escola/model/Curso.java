package br.com.lucas.escola.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.lucas.escola.enums.Turno;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

	private static final long serialVersionUID = -1815954485943614593L;

	@Id
	@GeneratedValue
	@Column(name = "ID_CURSO")
    private Integer idCurso;
	
	@Column(name = "NOME_CURSO")
    private String nomeCurso;

	@Column(name = "DESCONTO")
    private BigDecimal desconto;
	
	@Column(name = "VALOR")
    private BigDecimal valor;
	
	@Column(name = "TURNO")
	@Enumerated(EnumType.STRING)
    private Turno turno;	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Modulo> modulos;

    @Column(name = "CARGA_HORARIA")
    private String cargaHoraria;

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cargaHoraria == null) ? 0 : cargaHoraria.hashCode());
		result = prime * result
				+ ((desconto == null) ? 0 : desconto.hashCode());
		result = prime * result + ((idCurso == null) ? 0 : idCurso.hashCode());
		result = prime * result + ((modulos == null) ? 0 : modulos.hashCode());
		result = prime * result
				+ ((nomeCurso == null) ? 0 : nomeCurso.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Curso other = (Curso) obj;
		if (cargaHoraria == null) {
			if (other.cargaHoraria != null)
				return false;
		} else if (!cargaHoraria.equals(other.cargaHoraria))
			return false;
		if (desconto == null) {
			if (other.desconto != null)
				return false;
		} else if (!desconto.equals(other.desconto))
			return false;
		if (idCurso == null) {
			if (other.idCurso != null)
				return false;
		} else if (!idCurso.equals(other.idCurso))
			return false;
		if (modulos == null) {
			if (other.modulos != null)
				return false;
		} else if (!modulos.equals(other.modulos))
			return false;
		if (nomeCurso == null) {
			if (other.nomeCurso != null)
				return false;
		} else if (!nomeCurso.equals(other.nomeCurso))
			return false;
		if (turno != other.turno)
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
    
    

    
}
