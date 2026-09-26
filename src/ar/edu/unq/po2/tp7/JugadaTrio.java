package ar.edu.unq.po2.tp7;

import java.util.List;

public class JugadaTrio extends Jugada {

	public JugadaTrio(List<Carta> cartas) {

		this.cartas = cartas;
		
	}

	@Override
	protected boolean leGanaAJugada(Jugada otraJugada) {

		return otraJugada.leGanaLaJugadaTrio(this);
		
	}

	@Override
	public boolean leGanaLaJugadaPoker(Jugada jugadaPoker) {

		return true;
		
	}

	@Override
	public boolean leGanaLaJugadaTrio(Jugada otraJugada) {

		return otraJugada.getValor() > getValor();
		
	}

	@Override
	public boolean leGanaLaJugadaColor(Jugada jugadaColor) {

		return true;
		
	}

	@Override
	public boolean leGanaLaJugadaNada(Jugada jugadaNada) {

		return false;
		
	}

	@Override
	public int getValor() {

		return cartas.stream()
				.filter(c -> cartas.stream()
						.filter(c1 -> c.getValor() == c1.getValor())
						.count() == 3 )
				.mapToInt(c -> c.getValor())
				.sum();
		
	}

}
