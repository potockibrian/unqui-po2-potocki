package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoCentralTest {

	private MercadoCentral mercadoCentral;
	private Producto producto;
	
	@BeforeEach
	public void setUp () {
		
		producto = new ProductoDeCooperativa("Vino", 1000.0d);
		
		mercadoCentral = new MercadoCentral();
		
		mercadoCentral.ingresarProducto(producto);
		
	}
	
	@Test
	public void testCantidadDeStock () {
		
		assertEquals(mercadoCentral.cantidadDeStock(), 1);
		
		mercadoCentral.registrarProductoEnCaja(producto);
		
		assertEquals(mercadoCentral.cantidadDeStock(), 0);
		
	}

}
