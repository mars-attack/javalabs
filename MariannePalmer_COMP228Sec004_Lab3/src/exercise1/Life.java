package exercise1;

public class Life extends Insurance{

	// constructor
	public Life(double insuranceCost) {
		// sets insurance type to Life
		super("Life", insuranceCost);
	}

	// implements abstract method
	public void setInsuranceCost(double insuranceCost) {
		super.monthlyCost = insuranceCost;
	}

	// implements abstract method
	public void displayInfo() {
		System.out.println(String.format("%nInsurance Type: %s%nInsurance Monthly Cost: $%.02f", 
				getInsuranceType(), getMonthlyCost()));
	}
}// end class Life
