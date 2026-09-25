package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	private Carta carta1;
	private Carta carta2;
	
	@BeforeEach
	public void beforeEach() {
		
		carta1 = new Carta(2, "P");
		carta2 = new Carta(10, "D");
		
	}
	
	@Test
	void testValor() {

		assertEquals(carta1.getValor(), 2);	 // J: 11, Q: 12, K: 13, A: 14
		assertEquals(carta2.getValor(), 10);
		
	}
	
	@Test
	void testPalo() {

		assertEquals(carta1.getPalo(), "P");
		assertEquals(carta2.getPalo(), "D");
		
	}
	
	@Test
	void testEsSuperiorA() {

		assertFalse(carta1.esSuperiorA_(carta2));
		assertTrue(carta2.esSuperiorA_(carta1));
		
		
	}

}
