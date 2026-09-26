package ar.edu.unq.po2.tp7;

import java.util.List;

public class JugadaNada extends Jugada {
	
	public JugadaNada(List<Carta> cartas) {

		this.cartas = cartas;
		
	}

	@Override
	protected boolean leGanaAJugada(Jugada otraJugada) {

		return otraJugada.leGanaLaJugadaNada(this);
		
	}

	@Override
	public boolean leGanaLaJugadaPoker(Jugada jugadaPoker) {

		return true;
		
	}

	@Override
	public boolean leGanaLaJugadaTrio(Jugada otraJugada) {

		return true;
		
	}

	@Override
	public boolean leGanaLaJugadaColor(Jugada jugadaColor) {

		return true;
		
	}

	@Override
	public boolean leGanaLaJugadaNada(Jugada jugadaNada) {

		return jugadaNada.getValor() > getValor();
		
	}

	@Override
	public int getValor() {

		return cartas.stream()
				.mapToInt(c -> c.getValor())
				.sum();
		
	}

}
