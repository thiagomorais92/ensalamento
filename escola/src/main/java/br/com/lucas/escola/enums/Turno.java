package br.com.lucas.escola.enums;

import java.util.EnumSet;
import java.util.Set;

/**
 * 
 * @author Lucas Moreira
 *
 */

public enum Turno {

	TURNO_MATUTINO("1", "Matutino"),
	TURNO_VESPERTINO("2", "Vespertino"),
	TURNO_NOTURNO("3", "Noturno");
	
	private Turno(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	private String codigo;
	private String descricao;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Turno> getTurnos() {
		return EnumSet.of(TURNO_MATUTINO, TURNO_VESPERTINO, TURNO_NOTURNO);
	}
	
	
}
