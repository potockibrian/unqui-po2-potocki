package ar.edu.unq.po2.tp6.caso2;

public abstract class SolicitudDeCredito {

	protected Cliente cliente;
	protected Double monto;
	protected int plazoDeMeses;
	
	public abstract boolean esAceptable();

}
