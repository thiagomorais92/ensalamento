package br.com.lucas.escola.enums;

/**
 * 
 * @author Lucas Moreira
 *
 */

public enum DIAS {
	
	SEGUNDA("0","Segunda-Feira"),
	TERCA("1","Terça-Feira"),
	QUARTA("2","Quarta-Feira"),
	QUINTA("3","Quinta-Feira"),
	SEXTA("4","Sexta-Feira"),
	SABADO("5","Sábado");
	
	private DIAS (String codigo, String descricao){
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
	
}
