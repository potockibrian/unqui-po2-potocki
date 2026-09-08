package ar.edu.unq.po2.tp5;

public class ProductoDeEmpresaTradicional extends Producto {

	private String nombre;
	private double precio;

	public ProductoDeEmpresaTradicional(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		
	}

	@Override
	protected Double getPrecio() {

		return precio;
		
	}

}
