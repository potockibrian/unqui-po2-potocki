package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Double getMontoTotalPercibido () {
		
		Double totalActual = 0d;
		
		for (Ingreso ingreso : ingresos) {
			
			totalActual += ingreso.getMontoPercibido();
			
		}
		
		return totalActual;
		
	}
	
	public Double getMontoImponible () {
		
		Double totalActual = 0d;
		
		for (Ingreso ingreso : ingresos) {
			
			totalActual += ingreso.getMontoImponible();
			
		}
		
		return totalActual;
		
	}
	
	public Double getImpuestoAPagar () {
		
		return this.getMontoImponible() * 0.02;
		
	}
	
	public void añadirIngreso (Ingreso ingreso) {
		
		ingresos.add(ingreso);
		
	}
	
}
