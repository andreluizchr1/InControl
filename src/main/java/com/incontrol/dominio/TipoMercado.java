package com.incontrol.dominio;

public enum TipoMercado {
	
	A_VISTA("À Vista"), FRACIONARIO("Fracionário");
	
	private String descricao;
	
	TipoMercado(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
