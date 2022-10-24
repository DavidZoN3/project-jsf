/**
 * 
 */
package com.zone.david.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.zone.david.projectjsf.dto.UsuarioDTO;

/**
 * @author David Serrano Cortés Clase que se encarga de mantener la informacion
 *         del usuario que ingresa al aplicativo en sesión
 *
 */
@ManagedBean
@SessionScoped
public class SessionController {
	/*
	 * Usuario que se mantendra en sesión.
	 */
	private UsuarioDTO usuarioDTO;

	/*
	 * Inicializa la sesion del usuario
	 */
	@PostConstruct
	private void init() {
		System.out.println("Cargando información del usuario en la sesión");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
}
