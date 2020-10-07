// Marianne Palmer - 301122149 - COMP228 F2020
package exercise2;
import javax.swing.JOptionPane;

public class LottoTest {

	public static void main(String[] args) {
		
		// instantiates object
		Lotto myLotto = new Lotto();
		
		// sum winning numbers
		int[] winningNumbers = myLotto.getLotto();
		int lottoSum = 0;
		for (int number : winningNumbers) { 
		    lottoSum += number;
		}

		// prints out numbers and sum for test purposes only
		System.out.print("Secret numbers: ");
		for (int i = 0; i < winningNumbers.length; i++) {
			System.out.print(winningNumbers[i] + " ");
		}
		System.out.print("\nSum: " + lottoSum);
		
		// user input and checks if it matches the sum
		boolean isWinner = false;
		int totalAttempts = 5;

		for (int attempt = 0; attempt < totalAttempts; attempt++) {
			
			if (isWinner == false) {
				
				int myNumber = Integer.parseInt(JOptionPane.showInputDialog(
					null,
					"Enter a number between 3 and 27: ",
					"Lotto",
					JOptionPane.QUESTION_MESSAGE
					));	
				
				// check and update isWinner
				if (myNumber == lottoSum) {
					isWinner = true;
				}
				// displays message if incorrect
				else {
					String message = totalAttempts - attempt - 1 + " Attempts left";
					JOptionPane.showMessageDialog(null, message);
				}
			}
			else {
				break;
			}		
		}
		
		// displays a message if winner/loser
		if (isWinner) {
			JOptionPane.showMessageDialog(null, "Winner!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Computer wins :( \nTry again another time");
		}
	}// Main end
}// LottoTest end
