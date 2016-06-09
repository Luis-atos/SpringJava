package com.pruebas.interceptor;

import java.util.Map;

import org.apache.struts2.convention.annotation.ParentPackage;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
@ParentPackage("socio")
public class SessionInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		System.out.println("iniciando el interceptor...");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		System.out.println("Entro al interceptor");
		if(session.get("objUsuario") == null){
			
			System.out.println("validando");
			return "NOLOGUEADO";
			
		}
		
		return invocation.invoke();
	}

}
