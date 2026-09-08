package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MascotaTest {

	Mascota mascota;
	
	@BeforeEach
	public void setUp () {
		
		mascota = new Mascota("Pepita", "Golondrina");
		
	}
	
	@Test
	public void testNombre () {
		
		assertEquals(mascota.getNombre(), "Pepita");
		
	}
	
	@Test
	public void testRaza () {
		
		assertEquals(mascota.getRaza(), "Golondrina");
		
	}

}
