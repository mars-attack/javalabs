// Marianne Palmer - 301122149 - COMP228-004 Lab 3
package exercise1;

public abstract class Insurance 
{
	
	// properties
	private String insuranceType;
	protected double monthlyCost;
	
	// constructor
	public Insurance(String insuranceType, double monthlyCost)
	{
		this.insuranceType = insuranceType;
		this.monthlyCost = monthlyCost;
	}

	// getter for insuranceType
	public String getInsuranceType() 
	{
		return insuranceType;
	}
	
	//getter for monthlyCost
	public double getMonthlyCost() 
	{
		return monthlyCost;
	}

	// abstract methods
	
	public abstract void setInsuranceCost(double monthlyCost);
	
	public abstract void displayInfo();
	
} // end abstract class Insurance
