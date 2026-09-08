package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {

	private int cantidadDeUnidadesConsumidas;
	private double costoPorUnidadConsumida;

	public Servicio(double costoPorUnidadConsumida, int cantidadDeUnidadesConsumidas) {
		
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
		
	}

	@Override
	public Double montoAPagar() {

		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
		
	}

}
