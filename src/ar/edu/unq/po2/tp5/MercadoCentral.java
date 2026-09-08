package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {

	private List<Producto> productos = new ArrayList<Producto>();
	private Caja caja = new Caja();
	
	public void ingresarProducto(Producto producto) {
		
		productos.add(producto);
		
	}

	public int cantidadDeStock() {
		
		return productos.size();
		
	}

	public void registrarProductoEnCaja(Producto producto) {
		
		caja.registrarProducto(producto);
		
		productos.remove(producto);
		
	}

}
