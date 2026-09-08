package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoDeEmpresaTradicionalTest {

	Producto producto;
	
	@BeforeEach
	public void setUp () {
		
		producto = new ProductoDeEmpresaTradicional("Vino", 1000.0d);
		
	}
	
	@Test
	public void testPrecio () {
		
		assertEquals(producto.getPrecio(), 1000.0d);
		
	}

}
