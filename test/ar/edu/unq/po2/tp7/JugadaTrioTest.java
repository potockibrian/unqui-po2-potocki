package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTrioTest {

	private Jugada otraJugada;
	private Jugada jugadaTrio;
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
		
		//Setup & Teardown
		
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
		when(carta2.getValor()).thenReturn(3);
		when(carta3.getValor()).thenReturn(3);
		when(carta4.getValor()).thenReturn(2);
		when(carta5.getValor()).thenReturn(7);
		
		//STUB
		jugadaTrio = new JugadaTrio(new ArrayList<Carta>(List.of(carta1, carta2, carta3, carta4, carta5)));
		
	}
	
	@Test
	void testJugadaTrioNoLeGanaAJugadaPoker() {

		when(otraJugada.leGanaLaJugadaTrio(jugadaTrio)).thenReturn(false);
		
		assertFalse(jugadaTrio.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaTrio(jugadaTrio);
		
	}
	
	@Test
	void testJugadaTrioNoLeGanaAJugadaColor() {

		when(otraJugada.leGanaLaJugadaTrio(jugadaTrio)).thenReturn(false);
		
		assertFalse(jugadaTrio.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaTrio(jugadaTrio);
		
	}

	@Test
	void testJugadaTrioLeGanaAJugadaNada() {

		when(otraJugada.leGanaLaJugadaTrio(jugadaTrio)).thenReturn(true);
		
		assertTrue(jugadaTrio.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaTrio(jugadaTrio);
		
	}
	
	@Test
	void testJugadaTrioLeGanaAJugadaTrioCuandoTieneMayorValor() {
		
		//Setup
		when(carta6.getValor()).thenReturn(2);
		when(carta7.getValor()).thenReturn(2);
		when(carta8.getValor()).thenReturn(2);
		when(carta9.getValor()).thenReturn(3);
		when(carta10.getValor()).thenReturn(4);
		
		Jugada otraJugadaTrio = new JugadaTrio(new ArrayList<Carta>(List.of(carta6, carta7, carta8, carta9, carta10)));
		
		assertTrue(jugadaTrio.leGanaAJugada(otraJugadaTrio));
		
	}
	
	@Test
	void testJugadaTrioNoLeGanaAJugadaTrioCuandoTieneMenorValor() {
		
		//Setup
		when(carta6.getValor()).thenReturn(4);
		when(carta7.getValor()).thenReturn(4);
		when(carta8.getValor()).thenReturn(4);
		when(carta9.getValor()).thenReturn(2);
		when(carta10.getValor()).thenReturn(7);
		
		Jugada otraJugadaTrio = new JugadaTrio(new ArrayList<Carta>(List.of(carta6, carta7, carta8, carta9, carta10)));
		
		assertFalse(jugadaTrio.leGanaAJugada(otraJugadaTrio));
		
	}
	
	@Test
	void testJugadaPokerGanaAJugadaTrio() {
		
		assertTrue(jugadaTrio.leGanaLaJugadaPoker(otraJugada));		
		
	}
	
	@Test
	void testJugadaColorGanaAJugadaTrio() {
		
		assertTrue(jugadaTrio.leGanaLaJugadaColor(otraJugada));		
		
	}
	
	@Test
	void testJugadaNadaNoGanaAJugadaTrio() {
		
		assertFalse(jugadaTrio.leGanaLaJugadaNada(otraJugada));		
		
	}
	
}
