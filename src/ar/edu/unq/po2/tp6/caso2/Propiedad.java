package ar.edu.unq.po2.tp6.caso2;

public class Propiedad {

	private Double valorFiscal;
	public String descripcion;
	public String direccion;
	
	public Propiedad(String descripcion, String direccion, Double valorFiscal) {

		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
		
	}

	public Double getValorFiscal() {

		return valorFiscal;
		
	}

}
