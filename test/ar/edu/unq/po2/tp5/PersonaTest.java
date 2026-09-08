package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona persona;
	LocalDate fecha = LocalDate.now();
	
	@BeforeEach
	public void setUp () {
		
		persona = new Persona("Juan", fecha);
		
	}
	
	@Test
	void testNombre() {
		
		assertEquals(persona.getNombre(), "Juan");
		
	}
	
	@Test
	void testFechaDeNacimiento () {
		
		assertEquals(persona.getFechaNacimiento(), fecha);
		
	}

}
