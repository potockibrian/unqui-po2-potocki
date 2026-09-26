package ar.edu.unq.po2.tp7;

import java.util.List;

public class JugadaColor extends Jugada {
	
	public JugadaColor(List<Carta> cartas) {

		this.cartas = cartas;
		
	}

	@Override
	protected boolean leGanaAJugada(Jugada otraJugada) {

		return otraJugada.leGanaLaJugadaColor(this);
		
	}

	@Override
	public boolean leGanaLaJugadaPoker(Jugada jugadaPoker) {

		return true;
		
	}

	@Override
	public boolean leGanaLaJugadaTrio(Jugada otraJugada) {

		return false;
		
	}

	@Override
	public boolean leGanaLaJugadaColor(Jugada jugadaColor) {

		return jugadaColor.getValor() > getValor();
		
	}

	@Override
	public boolean leGanaLaJugadaNada(Jugada jugadaNada) {

		return false;
		
	}

	@Override
	public int getValor() {

		return cartas.stream()
				.mapToInt(c -> c.getValor())
				.sum();
		
	}

}
