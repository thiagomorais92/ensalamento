package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Classe que representa a entidade Funcionario
 * @author Lucas Moreira
 *
 */

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 5263373649614510147L;
	
	@Column(name = "PIS")
    private String pis;
	
	@Column(name = "DATA_ADMIS")
    private Date dataAdmis;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_CARGO")
    private Cargo cargo;

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	/**
	 * Retorna a data de admissão de um Funcionário.
	 * @return Date
	 */
	
	public Date getDataAdmis() {
		return dataAdmis;
	}

	public void setDataAdmis(Date dataAdmis) {
		this.dataAdmis = dataAdmis;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result
				+ ((dataAdmis == null) ? 0 : dataAdmis.hashCode());
		result = prime * result + ((pis == null) ? 0 : pis.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (dataAdmis == null) {
			if (other.dataAdmis != null)
				return false;
		} else if (!dataAdmis.equals(other.dataAdmis))
			return false;
		if (pis == null) {
			if (other.pis != null)
				return false;
		} else if (!pis.equals(other.pis))
			return false;
		return true;
	}
	
	

    
}
