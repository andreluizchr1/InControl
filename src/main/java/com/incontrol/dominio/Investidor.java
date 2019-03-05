package com.incontrol.dominio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name = "investidor")
public class Investidor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O nome é obrigatório")
	@NotEmpty(message = "O nome não pode ficar em branco")
	private String nome;

	@OneToMany(mappedBy = "investidor", targetEntity = Conta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Conta> contas;
	

}
