package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class AgenciaTributaria implements Agencia {

	private List<Factura> facturas = new ArrayList<Factura>();
	
	public boolean tienePagosRegistrados() {

		return !facturas.isEmpty();
		
	}

	@Override
	public void registrarPago(Factura factura) {

		facturas.add(factura);
		
	}

}
