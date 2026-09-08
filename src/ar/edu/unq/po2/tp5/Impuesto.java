package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {

	private double tasaDeServicio;

	public Impuesto(double tasaDeServicio) {

		this.tasaDeServicio = tasaDeServicio;
		
	}

	@Override
	public Double montoAPagar() {

		return tasaDeServicio;
		
	}

}
