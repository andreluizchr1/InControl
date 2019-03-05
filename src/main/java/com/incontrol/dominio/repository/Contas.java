package com.incontrol.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incontrol.dominio.Conta;

public interface Contas extends JpaRepository<Conta, Long> {

}
