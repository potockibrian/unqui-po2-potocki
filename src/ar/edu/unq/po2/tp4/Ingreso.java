package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class Ingreso {

	private LocalDate mesDePercepción;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso (LocalDate mesDePercepción, String concepto, Double montoPercibido) {
		
		this.mesDePercepción = mesDePercepción;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
		
	}
	
	public Double getMontoPercibido () {
		
		return montoPercibido;
		
	}
	
	public Double getMontoImponible () {
		
		return montoPercibido;
		
	}
	
}
