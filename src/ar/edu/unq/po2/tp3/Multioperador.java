package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {

	public int addElements(List<Integer> numbers) {
		
		int actual = 0;
		
		for (int number : numbers) {
			
			actual += number;
			
		}
		
		return actual;
		
	}
	
	public int substractElements(List<Integer> numbers) {
		
		int actual = 0;
		
		for (int number : numbers) {
			
			actual -= number;
			
		}
		
		return actual;
		
	}
	
	public int multiplyElements(List<Integer> numbers) {
		
		int actual = 1;
		
		for (int number : numbers) {
			
			actual *= number;
			
		}
		
		return actual;
		
	}
	
}
