package com.cibertec.edu.pe.services;

import java.util.List;

import com.cibertec.edu.pe.models.Usuario;

public interface IUsuarioService {
	public List<Usuario>listarUsuarios();
	public Usuario buscarUsuario(Long id);
	public Usuario agregarUsuario(Usuario u);
	public Usuario actualizarUsuario(Usuario u);
	public String eliminarUsuario(Long id);
}
