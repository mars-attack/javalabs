// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020
package exercise3;

public class BusinessMortgage extends Mortgage{
	public BusinessMortgage(String customerName, double mortgageAmt, int term, double interestRate) 
	{
		super(customerName, mortgageAmt, term, "Business");
		super.setInterestRate(interestRate + 2); // additional 2% over prime/current rate
	}
	
} // end class BusinessMortgage
