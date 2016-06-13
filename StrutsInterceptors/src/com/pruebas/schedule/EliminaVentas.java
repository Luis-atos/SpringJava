package com.pruebas.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EliminaVentas {

	@Scheduled(fixedRate = 1000*60*10)
	public void eliminaVentasNoConfirmadas(){
		System.out.println("Probando...");
	}
	
}
