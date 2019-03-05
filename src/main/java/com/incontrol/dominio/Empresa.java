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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name = "empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "O nome é obrigatório")
	@NotNull(message = "O nome é obrigatório")
	private String nome;

	@NotNull(message = "O cnpj é obrigatório")
	@Column(unique = true)
	private long cnpj;

	@NotNull(message = "É obrigatório informar o setor de atuação da empresa")
	@ManyToOne
	@JoinColumn(name = "setor_id")
	private Setor setor;
	
	@NotEmpty(message = "É obrigatório informar o código do ativo")
	@NotNull(message = "É obrigatório informar o código do ativo")
	@Column(name = "codigo_b3")
	private String codigoB3;

	@OneToMany(mappedBy = "empresa", targetEntity = Fundamento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Fundamento> fundamentos;

	@Column(name = "cotacao_atual")
	private BigDecimal cotacaoAtual;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_atualizacao")
	private Date dataAtualizacao;

}
