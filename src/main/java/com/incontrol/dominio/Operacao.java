package com.incontrol.dominio;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "operacao")
public class Operacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Empresa empresa;

	private BigDecimal preco;

	private int quantidade;

	@ManyToOne
	@JoinColumn(name = "id_nota_corretagem")
	private NotaCorretagem notaCorretagem;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_operacao")
	private TipoOperacao tipoOperacao;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_mercado")
	private TipoMercado tipoMercado;

	@Enumerated(EnumType.STRING)
	@Column(name = "forma_operacao")
	private FormaOperacao formaOperacao;

	@Column(name = "taxa_liquidacao")
	private BigDecimal taxaLiquidacao;

	@Column(name = "taxa_emolumentos")
	private BigDecimal taxaEemolumentos;

	private BigDecimal irrf;

}
