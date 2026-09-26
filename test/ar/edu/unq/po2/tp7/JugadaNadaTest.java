package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaNadaTest {

	private Jugada otraJugada;
	private Jugada jugadaNada;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;	
	
	@BeforeEach
	public void setUp() {
		
		//DOC
		otraJugada = mock(Jugada.class);
		
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		carta6 = mock(Carta.class);
		carta7 = mock(Carta.class);
		carta8 = mock(Carta.class);
		carta9 = mock(Carta.class);
		carta10 = mock(Carta.class);
		when(carta1.getValor()).thenReturn(3);
		when(carta2.getValor()).thenReturn(4);
		when(carta3.getValor()).thenReturn(5);
		when(carta4.getValor()).thenReturn(6);
		when(carta5.getValor()).thenReturn(7);
		
		//SUT
		jugadaNada = new JugadaNada(new ArrayList<Carta>(List.of(carta1,carta2,carta3,carta4,carta5)));
		
	}
	
	@Test
	void testJugadaNadaNoLeGanaAJugadaPoker() {

		//Setup
		when(otraJugada.leGanaLaJugadaNada(jugadaNada)).thenReturn(false);
		
		//Execution & Verify
		assertFalse(jugadaNada.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaNada(jugadaNada);
		
	}
	
	@Test
	void testJugadaNadaNoLeGanaAJugadaColor() {

		//Setup
		when(otraJugada.leGanaLaJugadaNada(jugadaNada)).thenReturn(false);
		
		//Execution & Verify
		assertFalse(jugadaNada.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaNada(jugadaNada);
		
	}

	@Test
	void testJugadaNadaNoLeGanaAJugadaTrio() {

		//Setup
		when(otraJugada.leGanaLaJugadaNada(jugadaNada)).thenReturn(false);
		
		//Execution & Verify
		assertFalse(jugadaNada.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaNada(jugadaNada);
		
	}
	
	@Test
	void testJugadaNadaLeGanaAJugadaNadaCuandoTieneMayorValor() {		
		
		//Setup
		when(carta6.getValor()).thenReturn(2);
		when(carta7.getValor()).thenReturn(3);
		when(carta8.getValor()).thenReturn(4);
		when(carta9.getValor()).thenReturn(5);
		when(carta10.getValor()).thenReturn(6);
		
		Jugada otraJugadaNada = new JugadaNada(new ArrayList<Carta>(List.of(carta6, carta7, carta8, carta9, carta10)));
		
		
		assertTrue(jugadaNada.leGanaAJugada(otraJugadaNada));
		
	}
	
	@Test
	void testJugadaNadaNoLeGanaAJugadaNadaCuandoTieneMenorValor() {	
		
		//Setup
		when(carta6.getValor()).thenReturn(4);
		when(carta7.getValor()).thenReturn(5);
		when(carta8.getValor()).thenReturn(6);
		when(carta9.getValor()).thenReturn(7);
		when(carta10.getValor()).thenReturn(8);
		
		Jugada otraJugadaNada = new JugadaNada(new ArrayList<Carta>(List.of(carta6, carta7, carta8, carta9, carta10)));
		
		assertFalse(jugadaNada.leGanaAJugada(otraJugadaNada));
		
	}
	
	@Test
	void testJugadaPokerGanaAJugadaNada() {
		
		assertTrue(jugadaNada.leGanaLaJugadaPoker(otraJugada));		
		
	}
	
	@Test
	void testJugadaColorGanaAJugadaNada() {
		
		assertTrue(jugadaNada.leGanaLaJugadaColor(otraJugada));		
		
	}
	
	@Test
	void testJugadaTrioGanaAJugadaNada() {
		
		assertTrue(jugadaNada.leGanaLaJugadaTrio(otraJugada));		
		
	}
	
}
