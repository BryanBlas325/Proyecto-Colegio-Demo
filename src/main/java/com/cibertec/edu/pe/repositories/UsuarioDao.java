package com.cibertec.edu.pe.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.edu.pe.models.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
	List<Usuario>findAll();
	Optional<Usuario> findById(Long id);
}
