package com.cibertec.edu.pe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.models.Usuario;
import com.cibertec.edu.pe.repositories.UsuarioDao;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	UsuarioDao dao;
	
	@Override
	public List<Usuario> listarUsuarios() {
		return dao.findAll();
	}

	@Override
	public Usuario buscarUsuario(Long id) {
		Optional<Usuario>data = dao.findById(id);
		if(data.isPresent())
			return data.get();
		return null;
	}

	@Override
	public Usuario actualizarUsuario(Usuario u) {
		return dao.save(u);
	}

	@Override
	public String eliminarUsuario(Long id) {
		dao.deleteById(id);
		return "Usuario eliminado correctamente";
	}

	@Override
	public Usuario agregarUsuario(Usuario u) {
		return dao.save(u);
	}

}
