package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	private Factura impuesto; 
	private Factura servicio;
	
	@BeforeEach
	public void setUp () {
		
		impuesto = new Impuesto(10000.0d);
		servicio = new Servicio(50000.0d, 2);
		
	}
	
	@Test
	public void testMontoAPagar () {
		
		assertEquals(impuesto.montoAPagar(), 10000.0d);
		assertEquals(servicio.montoAPagar(), 50000.0d * 2);
		
	}

}
