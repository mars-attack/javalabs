// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020

package exercise3;

public abstract class Mortgage implements MortgageConstants {
	
	private static final String bankName = BANK; // name in MorgtageConstants
	private static int id = 10001; // used for auto generating mortgageNumber
	private final int mortgageNumber;
	private String customerName;
	private double mortgageAmt;
	private double interestRate;
	private int term;
	private final String mortgageType;
	
	// constructor
	public Mortgage(String customerName, double mortgageAmt, int term, String mortgageType)
	{
		this.customerName = customerName;
		this.setMortgageAmt(mortgageAmt);
		this.setTerm(term);
		this.mortgageType = mortgageType;
		
		//setting mortgage number to id value and then incrementing for next account
		this.mortgageNumber = id++;
	}
	
	
	// getter for bank name. no setter needed (final)
	public String getBankName()
	{
		return bankName;
	}
	
	// getter for mortgageNumber. no setter needed (auto generated)
	public int getMortgageNumber() 
	{
		return mortgageNumber;
	}
	
	// getter and setter for customerName
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	// getter and setter for interestRate
	public double getInterestRate() 
	{
		return interestRate;
	}
	// setter used for validation
	public void setInterestRate(double interestRate) {
		
		if (interestRate > 0)
		{
			this.interestRate = interestRate;
		}
		else
		{
			throw new IllegalArgumentException("Interest rate must be positive");
		}
	}

	// getter and setter for mortgage amount
	public double getMortgageAmt() 
	{
		return mortgageAmt;
	}
	//setter used for validation
	public void setMortgageAmt(double mortgageAmt) 
	{
		if (mortgageAmt <= MAX) // mortgage amount cannot be higher than the defined maximum
		{
			this.mortgageAmt = mortgageAmt;
		}
		else
		{
			throw new IllegalArgumentException("Error: Mortgage amount higher than maximum.");
		}
	}
	
	// getter and setter for term
	public int getTerm() 
	{
		return term;
	}
	// setter used for validation
	public void setTerm(int term) 
	{
		if (term == LONG)
		{
			this.term = term;
		}
		else if (term == MEDIUM)
		{
			this.term = term;
		}
		else
		{
			this.term = SHORT; //any term that is not defined in constants is short-term
		}
	}
	
	// getter for type, setter not needed
	public String getMortgageType() {
		return mortgageType;
	}
	
	// method to calculate total owed at any time
	public double calculateOwed(int years)
	{
		double interest;
		double owed;

		// will only calculate if years is less that term
		if (years <= term)
		{
			interest = mortgageAmt * interestRate/100 * years;
			owed = mortgageAmt + interest;
			return owed;
		}
		else
		{
			throw new IllegalArgumentException("Number of years is greater than term.");
		}

	}
	
	// returns all mortgage information
	public String getMortgageInfo()
	{
		return String.format("Bank: %s%nMortgage Number: %d%nMortgage Type: %s%nCustomer: %s%nMortgage Amount: $%.2f%nInterest Rate: %.2f%%%nTerm: %d years", 
				bankName, mortgageNumber, mortgageType, customerName, mortgageAmt, interestRate, term);
	}


} // end class Mortgage
