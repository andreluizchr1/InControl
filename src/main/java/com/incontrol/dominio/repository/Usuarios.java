package com.incontrol.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incontrol.dominio.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

}
