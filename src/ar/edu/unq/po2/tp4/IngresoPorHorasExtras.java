package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantidadHorasExtras;
	
	public IngresoPorHorasExtras (LocalDate mesDePercepción, String concepto, Double montoPercibido, int cantidadHorasExtras) {

		super(mesDePercepción, concepto, montoPercibido);
		
		this.cantidadHorasExtras = cantidadHorasExtras;
		
	}
	
	@Override
	public Double getMontoImponible () {
		
		return 0d;
		
	}
	
}
