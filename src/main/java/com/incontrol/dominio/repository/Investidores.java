package com.incontrol.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incontrol.dominio.Investidor;

public interface Investidores extends JpaRepository<Investidor, Long> {

}
