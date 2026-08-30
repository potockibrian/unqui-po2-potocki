package unq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.*;

public class RectánguloTestCase {

	private Rectángulo rectángulo;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		this.rectángulo = new Rectángulo(new Point(10, 20), 100, 50);
		
	}
	
	@Test
	public void testArea() {
		
		assertEquals(rectángulo.getArea(), 100 * 50); 
	
	}

	@Test
	public void testPerimeter() {
		
		assertEquals(rectángulo.getPerimeter(), (100 * 2) + (50 * 2));
		
	}
	
	@Test
	public void testHorizontal() {
		
		assertEquals(rectángulo.isHorizontal(), false);
		
	}
	
	@Test
	public void testVertical() {
		
		assertEquals(rectángulo.isVertical(), true);
		
	}
	
}
