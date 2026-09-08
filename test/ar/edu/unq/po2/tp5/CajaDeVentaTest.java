package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeVentaTest {

	private CajaDeVenta caja = new CajaDeVenta();
	private Producto producto1 = new ProductoDeCooperativa("Vino", 100000.0d);
	private Producto producto2 = new ProductoDeEmpresaTradicional("Pan", 5000.0d);
	
	@BeforeEach
	public void setUp () {
		
		caja.registrarProducto(producto1);
		caja.registrarProducto(producto2);
		
	}
	
	@Test
	public void testMontoTotalAPagar() {
	
		assertEquals(caja.montoTotalAPagar(), 100000.0d + (5000.0d - (5000.0d * (10 / 100))));
	
	}
	
	@Test
	public void testRegistrarPago () {
		
		caja.registrarPago(new Impuesto(1000.0d));
		
		assertEquals(caja.tienePagosRegistrados(), true);
		
	}

}
