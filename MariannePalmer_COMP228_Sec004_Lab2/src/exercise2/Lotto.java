// Marianne Palmer - 301122149 - COMP228 F2020
package exercise2;
import java.security.SecureRandom;

public class Lotto {
	private int[] winningNumbers = new int[3];
	
	// constructor
	public Lotto() {
		SecureRandom random = new SecureRandom();
		
		winningNumbers[0]= random.nextInt(9) + 1; // generates number from 0 to 8 and adds one to adjust to 1-9
		winningNumbers[1]= random.nextInt(9) + 1;
		winningNumbers[2]= random.nextInt(9) + 1;
	}
	
	// getter - returns array
	public int[] getLotto() {
		return winningNumbers;
	}

	// setter
	public void setLotto() {
		SecureRandom random = new SecureRandom();
		winningNumbers[0]= random.nextInt(9) + 1; 
		winningNumbers[1]= random.nextInt(9) + 1;
		winningNumbers[2]= random.nextInt(9) + 1;
	}
}
