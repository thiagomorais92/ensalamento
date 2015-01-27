package br.com.lucas.escola.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "parcela")
public class Parcela implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID_PARCELA")
	private Integer idParcela;
	
	@Column(name = "N_PARCELA")
	private Integer numParcela;
	
	@Column(name = "DT_PARCELA")
	@Temporal(TemporalType.DATE)
	private Date dataParcela;
	
	@Column(name = "V_PARCELA")
	private BigDecimal valorParcela;
	
	@ManyToOne
	@JoinColumn(name = "ID_FATURA")
	private Fatura fatura;

	public Integer getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(Integer idParcela) {
		this.idParcela = idParcela;
	}

	public Integer getNumParcela() {
		return numParcela;
	}

	public void setNumParcela(Integer numParcela) {
		this.numParcela = numParcela;
	}

	public Date getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}

	public BigDecimal getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataParcela == null) ? 0 : dataParcela.hashCode());
		result = prime * result + ((fatura == null) ? 0 : fatura.hashCode());
		result = prime * result
				+ ((idParcela == null) ? 0 : idParcela.hashCode());
		result = prime * result
				+ ((numParcela == null) ? 0 : numParcela.hashCode());
		result = prime * result
				+ ((valorParcela == null) ? 0 : valorParcela.hashCode());
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
		Parcela other = (Parcela) obj;
		if (dataParcela == null) {
			if (other.dataParcela != null)
				return false;
		} else if (!dataParcela.equals(other.dataParcela))
			return false;
		if (fatura == null) {
			if (other.fatura != null)
				return false;
		} else if (!fatura.equals(other.fatura))
			return false;
		if (idParcela == null) {
			if (other.idParcela != null)
				return false;
		} else if (!idParcela.equals(other.idParcela))
			return false;
		if (numParcela == null) {
			if (other.numParcela != null)
				return false;
		} else if (!numParcela.equals(other.numParcela))
			return false;
		if (valorParcela == null) {
			if (other.valorParcela != null)
				return false;
		} else if (!valorParcela.equals(other.valorParcela))
			return false;
		return true;
	}
	
	
	
	
	
}
