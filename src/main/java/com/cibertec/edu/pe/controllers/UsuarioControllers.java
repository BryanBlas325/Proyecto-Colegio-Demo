package com.cibertec.edu.pe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.cibertec.edu.pe.models.Usuario;
import com.cibertec.edu.pe.services.UsuarioServiceImpl;

@Controller
@RequestMapping("/usuario")
public class UsuarioControllers {
	@Autowired
	UsuarioServiceImpl impl;
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Gestionar Usuarios");
		return "index";
	}
	@ModelAttribute("usuario")
	public List<Usuario> obtenerUsuarios(){
		List<Usuario>data = impl.listarUsuarios();
		return data;
	}
	@GetMapping("/usuario/{Usuario_id}")
	public String index(Model model,@PathVariable(name="Usuario_id")Long id) {
		model.addAttribute("titulo","Profesor N# "+id);
		Usuario data = impl.buscarUsuario(id);
		if(data==null)
			data = new Usuario();
		model.addAttribute("usuario",id);
		return "usuario";
	}
}
