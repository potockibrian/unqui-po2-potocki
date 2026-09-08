package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgenciaTributariaTest {

	AgenciaTributaria agenciaTributaria;
	
	@BeforeEach
	public void setUp () {
		
		agenciaTributaria = new AgenciaTributaria();
		
	}
	
	@Test
	public void testTienePagosRegistrados () {
		
		assertEquals(agenciaTributaria.tienePagosRegistrados(), false);
		
		agenciaTributaria.registrarPago(new Impuesto(1000.0d));
		
		assertEquals(agenciaTributaria.tienePagosRegistrados(), true);
		
	}

}
