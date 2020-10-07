// Marianne Palmer - 301122149 - COMP228 F2020
package exercise3;

public class SortValues {

	public static int[] SortNumbers(int ... numbers) {
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i] < numbers [j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];	
					numbers[j] = temp;
				}
			}
		}
		
		return numbers;
	}
} // SortValues end
