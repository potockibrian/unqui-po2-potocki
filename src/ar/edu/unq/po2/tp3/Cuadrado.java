package ar.edu.unq.po2.tp3;

public class Cuadrado {

	private Rectángulo rectángulo;
	
	public Cuadrado(Point point, int lado) {
		
		this.rectángulo = new Rectángulo(point, lado, lado);
		
	}
	
	public int getArea() { return rectángulo.getArea(); }
	
	public int getPerimeter() { return rectángulo.getPerimeter(); }
	
}
