// Marianne Palmer - 301122149 - COMP228 F2020
package exercise3;
import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		
		// asks user for length of the array
		System.out.print("How many numbers do you want to sort? ");
		Scanner input = new Scanner(System.in);
		int arrayLength = input.nextInt();
		
		// loops to take input
		int[] array = new int[arrayLength];
		System.out.println("Enter your numbers: ");
		for (int i = 0; i < arrayLength; i++) {
			array[i] = input.nextInt();
		}
		
		// sorts numbers
		array = SortValues.SortNumbers(array);
		
		// prints out sorted array
		System.out.println("Your sorted numbers are: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		
		input.close();
	}// Main end

}// SortTest end
