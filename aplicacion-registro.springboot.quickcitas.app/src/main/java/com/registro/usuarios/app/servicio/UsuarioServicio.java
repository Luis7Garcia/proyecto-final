package com.registro.usuarios.app.servicio;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.app.dto.UsuarioRegistroDTO;
import com.registro.usuarios.app.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService {

	public Usuario guardar(UsuarioRegistroDTO registroDTO);

	
	
}
