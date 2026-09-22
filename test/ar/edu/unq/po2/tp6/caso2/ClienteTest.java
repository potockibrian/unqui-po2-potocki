package ar.edu.unq.po2.tp6.caso2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private Cliente cliente;
	private Banco banco;
	
	@BeforeEach
	void setUp() {

		banco = new Banco();
		cliente = new Cliente("Nombre", "Apellido", "Dirección", LocalDate.now(), 100000.0d, banco);
		
	}
	
	@Test
	public void testEdad() {
		
		assertEquals(cliente.edad(), 0);
		
	}
	
	@Test
	public void testSueldoNetoMensual() {
		
		assertEquals(cliente.sueldoNetoMensual(), 100000.0d);
		
	}
	
	@Test
	public void testSueldoNetoAnual() {
		
		assertEquals(cliente.sueldoNetoAnual(), 100000.0d * 12);
		
	}

}
