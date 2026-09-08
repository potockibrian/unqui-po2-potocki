package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoDeCooperativaTest {

	private Producto producto;
	
	@BeforeEach
	public void setUp () {
		
		producto = new ProductoDeCooperativa("Pan", 5000.0d);
		
	}
	
	@Test
	public void testPrecio () {
		
		assertEquals(producto.getPrecio(), 5000.0d - (5000.0d * (10 / 100)));
		
	}

}
