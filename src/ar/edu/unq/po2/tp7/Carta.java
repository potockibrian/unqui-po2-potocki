package ar.edu.unq.po2.tp7;

import java.util.function.BooleanSupplier;

public class Carta {

	private int valor;
	private String palo;
	
	public Carta(int valor, String palo) {

		this.valor = valor;
		this.palo = palo;
		
	}

	public int getValor() {

		return valor;
		
	}

	public String getPalo() {

		return palo;
		
	}

	public boolean esSuperiorA_(Carta carta) {

		return valor > carta.getValor();
		
	}

}
