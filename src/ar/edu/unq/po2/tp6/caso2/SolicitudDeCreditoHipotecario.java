package ar.edu.unq.po2.tp6.caso2;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	private Propiedad propiedad;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, int plazoDeMeses, Propiedad propiedad) {
		
		this.cliente = cliente;
		this.monto = monto;
		this.plazoDeMeses = plazoDeMeses;
		this.propiedad = propiedad;
		
	}

	@Override
	public boolean esAceptable() {

		return !superaMontoEl50PorcientoDeIngresosMensuales() &&
				!esMontoTotalSolicitadoMayorAl70PorcientoDelValorFiscalDeLaGarantia() &&
				!personaSuperaLos65AñosDeEdadAntesDeTerminarDePagarElCredito();
		
	}

	private boolean personaSuperaLos65AñosDeEdadAntesDeTerminarDePagarElCredito() {
		
		return edadAntesDeTerminarDePagarElCredito() > 75;
		
	}

	private int edadAntesDeTerminarDePagarElCredito() {

		return edadDeCliente() + añosHastaTerminarDePagarElCredito();
		
	}

	private int añosHastaTerminarDePagarElCredito() {
		
		return plazoDeMeses / 12;
		
	}

	public int edadDeCliente() {

		return cliente.edad();
		
	}

	private boolean esMontoTotalSolicitadoMayorAl70PorcientoDelValorFiscalDeLaGarantia() {

		return monto > setentaPorcientoDelValorFiscalDeLaGarantia();
		
	}

	private Double setentaPorcientoDelValorFiscalDeLaGarantia() {
		
		return propiedad.getValorFiscal() * (70 / 100);
		
	}

	private boolean superaMontoEl50PorcientoDeIngresosMensuales() {

		return monto > cincuentaPorcientoDeIngresosMensuales();
		
	}

	private Double cincuentaPorcientoDeIngresosMensuales() {

		return cliente.sueldoNetoMensual();
		
	}

}
