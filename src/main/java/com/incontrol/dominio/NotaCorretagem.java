package com.incontrol.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name = "nota_de_corretagem")
public class NotaCorretagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@NotNull(message = "É obrigatório informar a data de emissão da nota de corretagem")
	@Column(name = "data_emissao")
	private Date dataEmissao;
	
	@OneToMany(mappedBy = "notaCorretagem", targetEntity = Operacao.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Operacao> operacoes;
	
	@Column(name = "valor_investido")
	private BigDecimal valorInvestido;
	
	@Column(name = "custo_operacoes")
	private BigDecimal custoOperacoes;
}
