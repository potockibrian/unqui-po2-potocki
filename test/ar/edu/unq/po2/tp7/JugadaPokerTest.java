package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaPokerTest {

	private Jugada otraJugada;
	private Jugada jugadaPoker;
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
		when(carta4.getValor()).thenReturn(3);
		when(carta5.getValor()).thenReturn(7);
		
		//DOC
		otraJugada = mock(Jugada.class);
		
		//STUB
		jugadaPoker = new JugadaPoker(new ArrayList<Carta>(List.of(carta1,carta2,carta3,carta4,carta5)));
		
	}
	
	@Test
	void testJugadaPokerLeGanaAJugadaColor() {

		when(otraJugada.leGanaLaJugadaPoker(jugadaPoker)).thenReturn(true);
		
		assertTrue(jugadaPoker.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaPoker(jugadaPoker);
		
	}
	
	@Test
	void testJugadaPokerLeGanaAJugadaTrio() {

		when(otraJugada.leGanaLaJugadaPoker(jugadaPoker)).thenReturn(true);
		
		assertTrue(jugadaPoker.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaPoker(jugadaPoker);
		
	}

	@Test
	void testJugadaPokerLeGanaAJugadaNada() {

		when(otraJugada.leGanaLaJugadaPoker(jugadaPoker)).thenReturn(true);
		
		assertTrue(jugadaPoker.leGanaAJugada(otraJugada));
		
		verify(otraJugada).leGanaLaJugadaPoker(jugadaPoker);
		
	}
	
	@Test
	void testJugadaPokerLeGanaAJugadaPokerCuandoTieneMayorValor() {
		
		//Setup
		when(carta6.getValor()).thenReturn(2);
		when(carta7.getValor()).thenReturn(2);
		when(carta8.getValor()).thenReturn(2);
		when(carta9.getValor()).thenReturn(2);
		when(carta10.getValor()).thenReturn(4);
		
		Jugada otraJugadaPoker = new JugadaPoker(new ArrayList<Carta>(List.of(carta6,carta7,carta8,carta9,carta10)));
		
		assertTrue(jugadaPoker.leGanaAJugada(otraJugadaPoker));
		
	}
	
	@Test
	void testJugadaPokerNoLeGanaAJugadaPokerCuandoTieneMenorValor() {
		
		//Setup
		when(carta6.getValor()).thenReturn(8);
		when(carta7.getValor()).thenReturn(8);
		when(carta8.getValor()).thenReturn(8);
		when(carta9.getValor()).thenReturn(8);
		when(carta10.getValor()).thenReturn(4);
		
		Jugada otraJugadaPoker = new JugadaPoker(new ArrayList<Carta>(List.of(carta6,carta7,carta8,carta9,carta10)));
		
		assertFalse(jugadaPoker.leGanaAJugada(otraJugadaPoker));
		
	}
	
	@Test
	void testJugadaColorNoGanaAJugadaPoker() {
		
		assertFalse(jugadaPoker.leGanaLaJugadaColor(otraJugada));		
		
	}
	
	@Test
	void testJugadaTrioNoGanaAJugadaPoker() {
		
		assertFalse(jugadaPoker.leGanaLaJugadaTrio(otraJugada));		
		
	}
	
	@Test
	void testJugadaNadaNoGanaAJugadaPoker() {
		
		assertFalse(jugadaPoker.leGanaLaJugadaNada(otraJugada));		
		
	}
	
}
