// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020
package exercise3;

public class PersonalMortgage extends Mortgage{

	public PersonalMortgage(String customerName, double mortgageAmt, int term, double interestRate) 
	{
		super(customerName, mortgageAmt, term, "Personal");
		super.setInterestRate(interestRate + 1); // additional 1% over prime/current rate
	}
	
} // end class PersonalMortgage
