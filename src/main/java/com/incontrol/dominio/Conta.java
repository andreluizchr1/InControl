package com.incontrol.dominio;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity(name = "conta")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long numero;

	@ManyToOne
	@JoinColumn(name = "id_corretora")
	private Corretora corretora;

	@ManyToOne
	@JoinColumn(name = "id_investidor")
	private Investidor investidor;

	@ManyToOne
	@JoinColumn(name = "id_configuracao")
	private Configuracao configuracao;

	@Transient
	private BigDecimal valorInvestido;

	@Transient
	private BigDecimal saldoDisponivel;


}
