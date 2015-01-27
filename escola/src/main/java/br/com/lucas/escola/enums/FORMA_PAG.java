package br.com.lucas.escola.enums;

public enum FORMA_PAG {

	A_VISTA("0", "À vista"),
	CARTAO("1", "Cartão"),
	CHEQUE("2", "Cheque"),
	CARNET("3", "Carnê");
	
	private FORMA_PAG (String codigo, String descricao) {
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
