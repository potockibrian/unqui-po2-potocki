package ar.edu.unq.po2.tp7;

import java.util.List;

public class JugadaPoker extends Jugada {

	public JugadaPoker(List<Carta> cartas) {

		this.cartas = cartas;
		
	}

	@Override
	protected boolean leGanaAJugada(Jugada otraJugada) {

		return otraJugada.leGanaLaJugadaPoker(this);
		
	}

	@Override
	public boolean leGanaLaJugadaPoker(Jugada jugadaPoker) {

		return jugadaPoker.getValor() > getValor();
		
	}

	@Override
	public boolean leGanaLaJugadaTrio(Jugada jugadaTrio) {
		
		return false;
	}

	@Override
	public boolean leGanaLaJugadaColor(Jugada jugadaColor) {
		
		return false;
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
						.count() == 4 )
				.mapToInt(c -> c.getValor())
				.distinct()
				.sum() * 4;

	}

}
