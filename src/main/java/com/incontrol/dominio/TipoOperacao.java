package com.incontrol.dominio;

public enum TipoOperacao {

	COMPRA("Compra"), VENDA("Venda");

	private String descricao;

	TipoOperacao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
