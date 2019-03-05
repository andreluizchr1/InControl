package com.incontrol.dominio;

public enum FormaOperacao {

	DAY_TRADE("Day Trade"), NORMAL("Normal");

	private String descricao;

	private FormaOperacao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
