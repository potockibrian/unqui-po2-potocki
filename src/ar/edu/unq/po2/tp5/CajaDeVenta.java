package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaDeVenta implements Agencia {
	
	private AgenciaTributaria agenciaTributaria = new AgenciaTributaria();
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Double montoTotalAPagar () {
		
		Double montoActual = 0.0d;
		
		for (Producto producto : productos) {
			
			montoActual += producto.getPrecio();
			
		}
		
		return montoActual;
		
	}

	public void registrarProducto(Producto producto) {

		productos.add(producto);
		
	}

	@Override
	public void registrarPago(Factura factura) {

		agenciaTributaria.registrarPago(factura);
		
	}

	public boolean tienePagosRegistrados() {

		return agenciaTributaria.tienePagosRegistrados();
		
	}

}
