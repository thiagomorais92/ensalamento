package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.lucas.escola.enums.DIAS;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "dias_da_semana")
public class DiaDaSemana implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private DIAS diaDaSemana;
	
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horaFim;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DIAS getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DIAS diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((diaDaSemana == null) ? 0 : diaDaSemana.hashCode());
		result = prime * result + ((horaFim == null) ? 0 : horaFim.hashCode());
		result = prime * result
				+ ((horaInicio == null) ? 0 : horaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		DiaDaSemana other = (DiaDaSemana) obj;
		if (diaDaSemana != other.diaDaSemana)
			return false;
		if (horaFim == null) {
			if (other.horaFim != null)
				return false;
		} else if (!horaFim.equals(other.horaFim))
			return false;
		if (horaInicio == null) {
			if (other.horaInicio != null)
				return false;
		} else if (!horaInicio.equals(other.horaInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
