package com.pruebas.spring.config;

import javax.servlet.Filter;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@ImportResource("classpath:struts.xml")
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{SpringConfig.class, SpringSecurityConfig.class, AspectConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	@Override
	protected Filter[] getServletFilters() {
		return new Filter[]{new StrutsPrepareAndExecuteFilter(), new DelegatingFilterProxy("springSecurityFilterChain")};
	}

}
