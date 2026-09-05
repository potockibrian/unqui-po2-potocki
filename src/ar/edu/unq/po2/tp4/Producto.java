package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	protected Double precio;
	private boolean esPrecioCuidado;
	
	public Producto (String nombre, Double precio, boolean esPrecioCuidado) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
		
	}
	
	public Producto (String nombre, Double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public Double getPrecio () {
		
		return precio;
		
	}
	
	public boolean esPrecioCuidado () {
		
		return esPrecioCuidado;
		
	}
	
	public void aumentarPrecio (Double cantidadDeDinero) {
		
		precio += cantidadDeDinero;
		
	}
	
}
