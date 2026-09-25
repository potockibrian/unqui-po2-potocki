package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.ArrayList;

public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		List<Carta> cartas = new ArrayList<Carta>(List.of(carta1, carta2, carta3, carta4, carta5));
		
		if (esPoker(cartas)) {
			return "POKER";
		} else if (esColor(cartas)) {
			return "COLOR";
		}
		else if (esTrio(cartas)) {
			return "TRIO";
		}
		
		return "NADA";
		
	}

	private boolean esPoker(List<Carta> cartas) {
		return cartas.stream()
				.map(s -> s.getValor())
				.anyMatch(c -> cartas.stream()
						.filter(s -> s.getValor() == c)
						.count() == 4 );
	}
	
	private boolean esColor(List<Carta> cartas) {
		
		return cartas.stream()
				.map(s -> s.getPalo())
				.distinct()
				.count() == 1;
		
	}
	
	private boolean esTrio(List<Carta> cartas) {
		
		return cartas.stream()
				.map(s -> s.getValor())
				.anyMatch(c -> cartas.stream()
						.filter(s -> s.getValor() == c)
						.count() >= 3);
		
	}
	
}
