package exercise1;

public class Health extends Insurance {

	// constructor
	public Health(double insuranceCost) {
		// sets insurance type to Health
		super("Health", insuranceCost);
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

}// end class Health
