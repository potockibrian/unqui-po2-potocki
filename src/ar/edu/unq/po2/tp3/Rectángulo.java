package ar.edu.unq.po2.tp3;

public class Rectángulo {

	public Point point;
	private int height;
	private int length;
	
	public Rectángulo(Point point, int height, int length) {
		
		this.point = point;
		this.height = height;
		this.length = length;
		
	}
	
	public int getArea() { return length * height; }
	
	public int getPerimeter() { return (length * 2) + (height * 2); }
	
	public boolean isHorizontal() { return length > height; }
	
	public boolean isVertical() { return length < height; }
	
}