package com.pruebas.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.security.access.prepost.PreAuthorize;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage("BoletajePalomino03")
public class PruebasAction extends ActionSupport implements SessionAware {
	
	private Map<String, Object> session;
	private List<String> mensajes = new ArrayList<String>();

	@PreAuthorize("hasAnyRole('SUPERADMIN')")
	@Action(value = "a_metodo1", results = {@Result(name = SUCCESS, location = "views/metodo1.jsp")})
	public String metodo1(){
		
		return SUCCESS;
	}
	
	@Action(value = "a_metodo2", results = {@Result(name = SUCCESS, type = "json")})
	public String metodo2(){
	
		mensajes.add("hola");
		mensajes.add("bye");
		
		return SUCCESS;
	}
	
	public List<String> getMensajes() {
		return mensajes;
	}
	public void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
}
