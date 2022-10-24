/**
 * 
 */
package com.zone.david.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.zone.david.projectjsf.dto.UsuarioDTO;

/**
 * @author David Serrano Cortés Clase que permite controlar el funcionamiento de
 *         la pantalla de login.xhtml
 *
 */
@ManagedBean
public class LoginController {
	/*
	 * Usuario que ingresan en el login
	 */
	private String usuario;
	/*
	 * Contraseña ingresada en el login
	 */
	private String password;

	/*
	 * Bean que mantiene la informacion en sesson.
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * Metodo que permite ingresar a la pantalla principal del proyecto.
	 */
	public void ingresar() {
		System.out.println("Usario: " + usuario);
		if (usuario.equals("David") && password.equals("123456")) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "usuario correcto", ""));
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}

		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "usuario y/o contraseña incorrectos", ""));
		}
	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
