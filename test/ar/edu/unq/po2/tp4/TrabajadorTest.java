package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

	Trabajador trabajador1;
	Trabajador trabajador2;
	
	@BeforeEach
	public void setUp() {
		
		trabajador1 = new Trabajador();
		trabajador2 = new Trabajador();
		
		trabajador1.añadirIngreso(new Ingreso(LocalDate.now(), "Sueldo", 9000d));
		trabajador1.añadirIngreso(new Ingreso(LocalDate.now(), "Sueldo", 1000d));
		
		trabajador2.añadirIngreso(new IngresoPorHorasExtras(LocalDate.now(), "Sueldo", 8000d, 10));
		trabajador2.añadirIngreso(new Ingreso(LocalDate.now(), "Sueldo", 1000d));
		
	}
	
	@Test
	public void testMontoTotalPercibido () {
		
		assertEquals(10000d, trabajador1.getMontoTotalPercibido());
		assertEquals(9000d, trabajador2.getMontoTotalPercibido());
		
	}
	
	@Test
	public void testMontoImponible () {
		
		assertEquals(10000d, trabajador1.getMontoImponible());
		assertEquals(1000d, trabajador2.getMontoImponible());
		
	}
	
	@Test
	public void testImpuestoAPagar () {
		
		assertEquals(200d, trabajador1.getImpuestoAPagar());
		assertEquals(20d, trabajador2.getImpuestoAPagar());
		
	}

}
