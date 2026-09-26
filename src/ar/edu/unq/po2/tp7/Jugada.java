package ar.edu.unq.po2.tp7;

import java.util.List;

public abstract class Jugada {
	
	protected List<Carta> cartas;

	protected abstract boolean leGanaAJugada(Jugada otraJugada);

	public abstract boolean leGanaLaJugadaPoker(Jugada jugadaPoker);
	
	public abstract boolean leGanaLaJugadaTrio(Jugada otraJugada);

	public abstract boolean leGanaLaJugadaColor(Jugada jugadaColor);
	
	public abstract boolean leGanaLaJugadaNada(Jugada jugadaNada);
	
	public abstract int getValor();
	
}
