package com.incontrol.dominio;

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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name = "corretora")
public class Corretora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Nome é Obrigatório")
	@NotBlank(message = "Nome é Obrigatório")
	private String nome;

	@NotNull(message = "O cnpj é Obrigatório")
	@Column(unique = true)
	private long cnpj;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_atualizacao")
	private Date dataAtualizacao;

	@OneToMany(mappedBy = "corretora", targetEntity = Conta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Conta> contas;
	
	@OneToMany(mappedBy = "corretora", targetEntity = Corretagem.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Corretagem> corretagens;

}
