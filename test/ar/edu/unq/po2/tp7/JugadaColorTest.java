package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaColorTest {

	private Jugada otraJugada;
	private Jugada jugadaColor;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
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
		when(carta1.getValor()).thenReturn(3);
		when(carta2.getValor()).thenReturn(4);
		when(carta3.getValor()).thenReturn(5);
		when(carta4.getValor()).thenReturn(2);
		when(carta5.getValor()).thenReturn(7);
		
		//STUB
		jugadaColor = new JugadaColor(new ArrayList<Carta>(List.of(carta1, carta2, carta3, carta4, carta5)));
		
	}
	
	@Test
	void testJugadaColorNoLeGanaAJugadaPoker() {

		when(otraJugada.leGanaLaJugadaColor(jugadaColor)).thenReturn(false);
		
		assertFalse(jugadaColor.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaColor(jugadaColor);
		
	}
	
	@Test
	void testJugadaColorLeGanaAJugadaTrio() {

		when(otraJugada.leGanaLaJugadaColor(jugadaColor)).thenReturn(true);
		
		assertTrue(jugadaColor.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaColor(jugadaColor);
		
	}

	@Test
	void testJugadaColorLeGanaAJugadaNada() {

		when(otraJugada.leGanaLaJugadaColor(jugadaColor)).thenReturn(true);
		
		assertTrue(jugadaColor.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaColor(jugadaColor);
		
	}
	
	@Test
	void testJugadaColorLeGanaAJugadaColorCuandoTieneMayorValor() {
		
		//DOC
		Carta carta6 = mock(Carta.class);
		Carta carta7 = mock(Carta.class);
		Carta carta8 = mock(Carta.class);
		Carta carta9 = mock(Carta.class);
		Carta carta10 = mock(Carta.class);
		
		//Setup
		when(carta6.getValor()).thenReturn(6);
		when(carta7.getValor()).thenReturn(2);
		when(carta8.getValor()).thenReturn(3);
		when(carta9.getValor()).thenReturn(4);
		when(carta10.getValor()).thenReturn(5);
		
		Jugada otraJugadaPoker = new JugadaColor(new ArrayList<Carta>(List.of(carta6, carta7, carta8, carta9, carta10)));
		
		assertTrue(jugadaColor.leGanaAJugada(otraJugadaPoker));
		
	}
	
	@Test
	void testJugadaColorNoLeGanaAJugadaColorCuandoTieneMenorValor() {
		//DOC
		Carta carta6 = mock(Carta.class);
		Carta carta7 = mock(Carta.class);
		Carta carta8 = mock(Carta.class);
		Carta carta9 = mock(Carta.class);
		Carta carta10 = mock(Carta.class);
		
		//Setup
		when(carta6.getValor()).thenReturn(6);
		when(carta7.getValor()).thenReturn(2);
		when(carta8.getValor()).thenReturn(3);
		when(carta9.getValor()).thenReturn(4);
		when(carta10.getValor()).thenReturn(7);
		
		Jugada otraJugadaPoker = new JugadaColor(new ArrayList<Carta>(List.of(carta6, carta7, carta8, carta9, carta10)));
		
		assertFalse(jugadaColor.leGanaAJugada(otraJugadaPoker));
	}
	
	@Test
	void testJugadaPokerGanaAJugadaColor() {
		
		assertTrue(jugadaColor.leGanaLaJugadaPoker(otraJugada));		
		
	}
	
	@Test
	void testJugadaTrioNoGanaAJugadaColor() {
		
		assertFalse(jugadaColor.leGanaLaJugadaTrio(otraJugada));		
		
	}
	
	@Test
	void testJugadaNadaNoGanaAJugadaPoker() {
		
		assertFalse(jugadaColor.leGanaLaJugadaNada(otraJugada));		
		
	}
	
}
