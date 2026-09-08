package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {

	private String nombre;
	private Double precio;
	
	public ProductoDeCooperativa(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		
	}

	@Override
	protected Double getPrecio() {

		return precio - descuento();
		
	}
	
	private Double descuento () {
		
		return (precio * (10 / 100));
		
	}

}
