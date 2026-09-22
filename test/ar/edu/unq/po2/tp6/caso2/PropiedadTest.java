package ar.edu.unq.po2.tp6.caso2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {

	private Propiedad propiedad;
	
	@BeforeEach
	void setUp() {

		propiedad = new Propiedad("Descripción", "Dirección", 10000.0d);
		
	}
	
	@Test
	public void testDescripcion() {
		
		assertEquals(propiedad.descripcion, "Descripción");
		
	}
	
	@Test
	public void testDireccion() {
		
		assertEquals(propiedad.direccion, "Dirección");
		
	}
	
	@Test
	public void testValorFiscal() {
		
		assertEquals(propiedad.getValorFiscal(), 10000.0d);
		
	}

}
