package com.incontrol.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incontrol.dominio.Empresa;

public interface Empresas extends JpaRepository<Empresa, Long> {

}
