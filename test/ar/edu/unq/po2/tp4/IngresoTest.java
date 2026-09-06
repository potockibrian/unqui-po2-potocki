package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoTest {

	Ingreso ingreso;
	
	@BeforeEach
	public void setUp() {
		
		ingreso = new Ingreso(LocalDate.now(), "Sueldo", 100d);
		
	}
	
	@Test
	public void testMontoPercibido () {
		
		assertEquals(100d, ingreso.getMontoPercibido());
		
	}
	
	@Test
	public void testMontoImponible () {
		
		assertEquals(100d, ingreso.getMontoImponible());
		
	}

}
