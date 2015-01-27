package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.lucas.escola.enums.FORMA_PAG;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "fatura_curso")
public class Fatura implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer idFatura;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "fatura")
	private List<Parcela> parcelas;
	
    @ManyToOne
    @JoinColumn(name = "id_aluno")
	private Aluno aluno;
	
	@Column(name = "OBS")
	private String observacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "FORMA_PAG")
	private FORMA_PAG formaDePagamento;

	public Integer getIdFatura() {
		return idFatura;
	}

	public void setIdFatura(Integer idFatura) {
		this.idFatura = idFatura;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public FORMA_PAG getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FORMA_PAG formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime
				* result
				+ ((formaDePagamento == null) ? 0 : formaDePagamento.hashCode());
		result = prime * result
				+ ((idFatura == null) ? 0 : idFatura.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result
				+ ((parcelas == null) ? 0 : parcelas.hashCode());
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
		Fatura other = (Fatura) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (formaDePagamento != other.formaDePagamento)
			return false;
		if (idFatura == null) {
			if (other.idFatura != null)
				return false;
		} else if (!idFatura.equals(other.idFatura))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (parcelas == null) {
			if (other.parcelas != null)
				return false;
		} else if (!parcelas.equals(other.parcelas))
			return false;
		return true;
	}
	
	
	
}
