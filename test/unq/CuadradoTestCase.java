package unq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.*;

public class CuadradoTestCase {

	private Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() {
		
		this.cuadrado = new Cuadrado(new Point(100, 100), 300);
		
	}
	
	@Test
	public void testArea() {
		
		assertEquals(cuadrado.getArea(), 300 * 300);
		
	}
	
	@Test
	public void testPerimeter() {
		
		assertEquals(cuadrado.getPerimeter(), 300 * 4);
		
	}
	
}
