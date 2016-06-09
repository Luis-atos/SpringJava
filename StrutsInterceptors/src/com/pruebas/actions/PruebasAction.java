package com.pruebas.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.security.access.prepost.PreAuthorize;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class PruebasAction extends ActionSupport {

	@PreAuthorize("hasAnyRole('SUPERADMIN')")
	@Action(value = "a_metodo1", results = {@Result(name = SUCCESS, location = "views/metodo1.jsp")})
	public String metodo1(){
		
		return SUCCESS;
	}
	
}
