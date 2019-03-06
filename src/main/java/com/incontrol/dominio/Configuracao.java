package com.incontrol.dominio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "configuracao")
public class Configuracao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "relacao_risco_retorno")
	private int relacaoRiscoRetorno;

	@Column(name = "minimo_porcentagem_ganho")
	private double minimoPorcentagemGanho;
	
	@OneToMany(mappedBy = "configuracao", targetEntity = Conta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Conta> contas;
}
