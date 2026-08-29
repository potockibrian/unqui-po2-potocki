package unq;

import ar.edu.unq.po2.tp3.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	
	private Counter counter;
	
	/**
	 * Crea un escenario de test básico, que consiste en un contador con 10 enteros
	 * 
	 * @throws Exception
	 * */
	@BeforeEach
	public void setUp() throws Exception {
		
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
	}
	
	@Test
	public void testEvenNumbers () {
		
		int amount = counter.getEvenOcurrences();
		
		assertEquals(amount, 1);
		
	}
	
	@Test
	public void testOddNumbers () {
		
		int amount = counter.getOddOcurrences();
		
		assertEquals(amount, 9);
		
	}
	
	@Test
	public void testMultiplesOf_Numbers () {
		
		int amount = counter.getMultipleOf_Ocurrences(5);
		
		assertEquals(amount, 1);
		
	}

}