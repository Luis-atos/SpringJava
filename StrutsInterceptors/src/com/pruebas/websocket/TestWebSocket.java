package com.pruebas.websocket;

import java.util.Map;

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.struts2.interceptor.ApplicationAware;

@ServerEndpoint(value = "/websocket/test")
public class TestWebSocket  implements ApplicationAware {
	
	private Map<String, Object> applicationMap;

	@OnOpen
	public void onOpen(Session session, EndpointConfig endpointConfig) {
		
	}
	
	@OnMessage
	public void onMessage(String message , Session session) {
		// TODO Auto-generated method stub
	}
	
	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		// TODO Auto-generated method stub
	}
	

	@Override
	public void setApplication(Map<String, Object> applicationMap) {
		this.applicationMap = applicationMap;
	}
	
	
}
