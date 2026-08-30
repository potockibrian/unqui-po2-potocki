package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;
	
	public Point() {
		
		this.x = 0;
		this.y = 0;
		
	}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	
	}

	public int getX() { return this.x; };
	
	public int getY() { return this.y; };
	
	public void setXY(int x, int y) { this.x = x; this.y = y; };
	
	public void addPoint(Point point) { this.x += point.getX(); this.y += point.getY(); };
	
}
