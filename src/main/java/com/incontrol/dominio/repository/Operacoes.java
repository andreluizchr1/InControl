package com.incontrol.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incontrol.dominio.Operacao;

public interface Operacoes extends JpaRepository<Operacao, Long> {

}
