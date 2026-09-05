package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String dirección;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado (String nombre, String dirección) {
		
		this.nombre = nombre;
		this.dirección = dirección;
	
	}
	
	public void agregarProducto (Producto producto) {
		
		productos.add(producto);
		
	}
	
	public int getCantidadDeProductos () {
		
		return productos.size();
		
	}
	
	public Double getPrecioTotal () {
		
		Double totalActual = 0d;
		
		for ( Producto producto : productos ) {
			
			totalActual += producto.getPrecio();
			
		} 
		
		return totalActual;
		
	}
	
}
