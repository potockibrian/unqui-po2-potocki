package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	private int porcentajeDescuento;
	
	public ProductoPrimeraNecesidad (String nombre, Double precio, boolean esPrecioCuidado) {
		
		super(nombre, precio, esPrecioCuidado);
		
		this.porcentajeDescuento = 10;
		
	}
	
	public ProductoPrimeraNecesidad (String nombre, Double precio, boolean esPrecioCuidado, int porcentajeDescuento) {
		
		super(nombre, precio, esPrecioCuidado);
		
		this.porcentajeDescuento = porcentajeDescuento;
		
	}
	
	private Double descuento () {
		
		return 1 - (porcentajeDescuento / 100d);
		
	}
	
	@Override
	public Double getPrecio () {
		
		return precio * descuento();
		
	}
	
}
