package ar.edu.unq.po2.tp6.caso2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private Banco banco;
	private Cliente cliente;
	private Propiedad propiedad;
	
	@BeforeEach
	void setUp() {
		
		banco = new Banco();
		cliente = new Cliente("Nombre", "Apellido", "Dirección", LocalDate.now(), 10000.0d, banco);
		propiedad = new Propiedad("Descripcion", "Dirección", 1000.0d);
		
		cliente.solicitarCreditoHipotecario(10000.0d, 33, propiedad);
		cliente.solicitarCreditoPersonal(10000.0d, 100);
		
	}
	
	@Test
	public void testTotalADesembolsar() {
		
		assertEquals(banco.totalADesembolsar(), 0.0d);
		
	}

}
