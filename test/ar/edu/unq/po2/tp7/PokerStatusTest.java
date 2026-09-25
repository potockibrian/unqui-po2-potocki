package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PokerStatusTest {

	//Setup
	private PokerStatus pokerStatus = new PokerStatus();
	private Carta carta1 = new Carta(7, "P");
	private Carta carta2 = new Carta(5, "C");
	private Carta carta3 = new Carta(12, "C");
	private Carta carta4 = new Carta(14, "C");
	private Carta carta5 = new Carta(10, "C");
	private Carta carta6 = new Carta(9, "C");
	private Carta carta7 = new Carta(9, "T");
	private Carta carta8 = new Carta(9, "P");
	private Carta carta9 = new Carta(9, "D");
	
	@BeforeEach
	public void setUp()	{
		
		//pokerStatus = new PokerStatus();
	
	}
	
	@Test
	public void testVerificar() {
		
		//Exercise y verify
		assertEquals(pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5), "NADA");
		
		assertEquals(pokerStatus.verificar(carta8, carta9, carta6, carta7, carta5), "POKER");

		assertEquals(pokerStatus.verificar(carta6,carta2,carta3,carta4,carta5), "COLOR");
		
		assertEquals(pokerStatus.verificar(carta8, carta9, carta6, carta4, carta5), "TRIO");
		
	}
	
}
