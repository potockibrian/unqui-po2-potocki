package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPorHorasExtrasTest {

	IngresoPorHorasExtras ingresoPorHorasExtras;
	
	@BeforeEach
	public void setUp() {
		
		ingresoPorHorasExtras = new IngresoPorHorasExtras(LocalDate.now(), "Sueldo", 100d, 10);
		
	}
	
	@Test
	public void testMontoPercibido () {
		
		assertEquals(100d, ingresoPorHorasExtras.getMontoPercibido());
		
	}
	
	@Test
	public void testMontoImponible () {
		
		assertEquals(0d, ingresoPorHorasExtras.getMontoImponible());
		
	}

}
