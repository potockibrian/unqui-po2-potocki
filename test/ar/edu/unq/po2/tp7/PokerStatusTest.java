package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class PokerStatusTest {

	//Setup
	private PokerStatus pokerStatus;
	private Carta carta1; 
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	public void setUp()	{

		//Setup & Teardown
		
		//DOC
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	
		//SUT
		pokerStatus = new PokerStatus();
		
	}

	@Test
	public void testCuandoHay4CartasDelMismoValorElJuegoEsPoker() {
		
		//Setup
		when(carta1.getValor()).thenReturn(10);
		when(carta2.getValor()).thenReturn(10);
		when(carta3.getValor()).thenReturn(10);
		when(carta4.getValor()).thenReturn(10);
		when(carta5.getValor()).thenReturn(3);
		
		//Exercise & verify
		assertEquals(pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5).getClass(), JugadaPoker.class);
		
	}	
	
	@Test
	public void testCuandoHay3CartasConElMismoPaloFormanUnTrio() {
		
		//Setup
		when(carta1.getPalo()).thenReturn("P");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("T");
		when(carta4.getPalo()).thenReturn("T");
		when(carta5.getPalo()).thenReturn("T");
		when(carta1.getValor()).thenReturn(2);
		when(carta2.getValor()).thenReturn(3);
		when(carta3.getValor()).thenReturn(4);
		when(carta4.getValor()).thenReturn(4);
		when(carta5.getValor()).thenReturn(4);
		
		//Exercise y verify
		assertEquals(pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5).getClass(), JugadaTrio.class);
		
	}
	
	@Test
	public void testCuandoHay5CartasDelMismoColorYPaloElJuegoEsColor() {
		
		//Setup
		when(carta1.getPalo()).thenReturn("P");
		when(carta2.getPalo()).thenReturn("P");
		when(carta3.getPalo()).thenReturn("P");
		when(carta4.getPalo()).thenReturn("P");
		when(carta5.getPalo()).thenReturn("P");
		when(carta1.getValor()).thenReturn(2);
		when(carta2.getValor()).thenReturn(3);
		when(carta3.getValor()).thenReturn(4);
		when(carta4.getValor()).thenReturn(5);
		when(carta5.getValor()).thenReturn(6);
		
		//Exercise & verify
		assertEquals(pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5).getClass(), JugadaColor.class);
		
	}
	
	@Test
	public void testCuandoLas5CartasNoFormanUnJuegoEsNada() {
		
		//Setup
		when(carta1.getPalo()).thenReturn("P");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("T");
		when(carta4.getPalo()).thenReturn("D");
		when(carta5.getPalo()).thenReturn("P");
		when(carta1.getValor()).thenReturn(2);
		when(carta2.getValor()).thenReturn(3);
		when(carta3.getValor()).thenReturn(4);
		when(carta4.getValor()).thenReturn(5);
		when(carta5.getValor()).thenReturn(6);
		
		
		
		//Exercise y verify
		assertEquals(pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5).getClass(), JugadaNada.class);
		
	}
	
}
