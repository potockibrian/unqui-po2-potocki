package ar.edu.unq.po2.observer.enumsYStreams.secretariaDeportes;

public enum Deporte {
	Running(1), Futbol(2), Basket(2), Tennis(3), Jabalina(4);

	private int complejidad;

	Deporte(int complejidad) {

		this.complejidad = complejidad;
		
	}

	public int getComplejidad() {

		return complejidad;

	}

}
