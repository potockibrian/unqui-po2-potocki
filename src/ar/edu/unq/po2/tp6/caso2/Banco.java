package ar.edu.unq.po2.tp6.caso2;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente cliente) {
		
		clientes.add(cliente);
		
	}

	public void solicitarCredito(SolicitudDeCredito solicitudDeCreditoHipotecario) {

		solicitudes.add(solicitudDeCreditoHipotecario);
		
	}

	public Double totalADesembolsar() {

		return solicitudes.stream()
				.filter(s -> s.esAceptable())
				.mapToDouble(s -> s.monto)
				.sum();
		
	}

}
