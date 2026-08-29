package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;

public class Counter {

	private List<Integer> numbers = new ArrayList<Integer>();
	
	public void addNumber(int number) {
		
		numbers.add(number);
	
	}
	
	public int getEvenOcurrences() {
		
		int actual = 0;
		
		for (int number : numbers) {
			
			actual += (number % 2 == 0) ? 1 : 0;
			
		}
		
		return actual;
		
	}
	
	public int getOddOcurrences() {
		
		int actual = 0;
		
		for (int number : numbers) {
			
			actual += (number % 2 != 0) ? 1 : 0;
			
		}
		
		return actual;
		
	}
	
	public int getMultipleOf_Ocurrences(int aNumber) {
		
		int actual = 0;
		
		for (int number : numbers) {
			
			actual += (number % aNumber == 0) ? 1 : 0;
			
		}
		
		return actual;
		
	}
	
	public int mostEvenDigitsNumberIn_(List<Integer> numbers) {
		
		int max = numbers.getFirst();
		int maxAmount = this.evenDigitsAmount(numbers.getFirst());
		
		for (int number : numbers) {
			
			int currentAmount = this.evenDigitsAmount(number);
			
			if (currentAmount > maxAmount) { max = number; maxAmount = currentAmount; }
			
		}
		
		return max;
		
	}
	
	private int evenDigitsAmount(int number) {
		
		int amount = 0;
		
		while (number != 0) {
			
			amount += (number % 2 == 0) ? 1 : 0;
			
			number = number / 10;
			
		}
		
		return amount;
		
	}
	
	public int simultaneousMultipleOf_And_(int firstNumber, int secondNumber) {
		
		int actual = 1000;
		
		while (actual != -1 && !isSimultaneousMultipleOf_And_(actual, firstNumber, secondNumber)) {
			
			--actual;
			
		}
		
		return actual;
		
	}
	
	private boolean isSimultaneousMultipleOf_And_(int multiple, int firstNumber, int secondNumber) {
		
		return (firstNumber % multiple == 0) && (secondNumber % multiple == 0);
		
	}
	
}