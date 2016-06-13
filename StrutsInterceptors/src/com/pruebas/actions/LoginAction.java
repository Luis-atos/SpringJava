package com.pruebas.actions;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage("BoletajePalomino03")
public class LoginAction extends ActionSupport implements SessionAware {
	
	private Map<String, Object> session = new HashMap<String, Object>();
	
	@Action(value = "a_simulalogin", results = {@Result(name = SUCCESS, location = "views/logueado.jsp")})
	public String simulaLogin(){
		
		session.put("objUsuario", "usuario1");
		
		return SUCCESS;
	}
	
	@Action(value = "a_revisasession", results = { @Result(name = SUCCESS, location = "views/login.jsp") })
	public String revisaSession() {
		System.out.println("Entro a pruebas");
		return SUCCESS;

	}
	
	@Action(value = "/accesorestringido", results = { @Result(name = INPUT, location = "views/accesonegado.jsp") })
	public String accesoRestringido(){
		
		System.out.println("acceso restringido");
		
		return  INPUT;
	}
	
	@Action(value = "a_testjson", results = {@Result(name = SUCCESS, type = "json")})
	public String testJSON(){
		
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
