package br.com.lucas.escola.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "modulo")
public class Modulo implements Serializable {
		
	private static final long serialVersionUID = 7144223329352103721L;

	@Id
	@GeneratedValue
	@Column(name = "ID_MODULO")
	private Integer idModulo;
	
	@Column(name = "DESCRICAO")
	private String descricao;

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((idModulo == null) ? 0 : idModulo.hashCode());
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
		Modulo other = (Modulo) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idModulo == null) {
			if (other.idModulo != null)
				return false;
		} else if (!idModulo.equals(other.idModulo))
			return false;
		return true;
	}
	

	
	
	
}
