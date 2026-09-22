package ar.edu.unq.po2.tp6.caso2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoTest {

	SolicitudDeCredito solicitudPersonal;
	SolicitudDeCredito solicitudHipotecario;
	
	@BeforeEach
	void setUp() {
		
		Banco banco = new Banco();
		Cliente cliente = new Cliente("Nombre", "Apellido", "Dirección", LocalDate.now(), 10000.0d, banco);
		Propiedad propiedad = new Propiedad("Descripción", "Dirección", 10000.0d);
		
		solicitudPersonal = new SolicitudDeCreditoPersonal(cliente, 10000.0d, 5);
		solicitudHipotecario = new SolicitudDeCreditoHipotecario(cliente, 100000.0d, 100, propiedad);
		
	}
	
	@Test
	void testEsAceptable() {
		
		assertEquals(solicitudPersonal.esAceptable(), false);
		assertEquals(solicitudHipotecario.esAceptable(), false);
		
	}

}
