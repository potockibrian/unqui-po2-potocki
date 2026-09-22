package ar.edu.unq.po2.tp6.caso2;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	private Cliente cliente;
	private Double monto;
	private int plazoDeMeses;
	
	public SolicitudDeCreditoPersonal(Cliente cliente, Double monto, int plazoDeMeses) {

		this.cliente = cliente;
		this.monto = monto;
		this.plazoDeMeses = plazoDeMeses;
		
	}

	@Override
	public boolean esAceptable() {

		return clienteTieneIngresosAnualesPorAlMenos_(15000.0d) &&
				!montoDeCuotaSuperaEl_PorcientoDeIngresosAnualesDelCliente(70);
		
	}

	private boolean montoDeCuotaSuperaEl_PorcientoDeIngresosAnualesDelCliente(int porcentaje) {

		return monto > (cliente.sueldoNetoAnual() * (porcentaje / 100));
		
	}

	private boolean clienteTieneIngresosAnualesPorAlMenos_(Double cantidad) {

		return cliente.sueldoNetoAnual() >= cantidad;
		
	}

}
