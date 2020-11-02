package exercise1;
import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceTest {

	public static void main(String[] args) {
	
		//ArrayList used for variable array size
		ArrayList<Insurance> insuranceList = new ArrayList<Insurance>();
		Scanner input = new Scanner(System.in);
		
		//Checks if user would like to add another account
		boolean addPolicy = true;
		while(addPolicy == true)
		{
			// enter insurance type
			System.out.print("\nEnter insurance type (Health or Life): ");
			String type =  input.next();
			
			// enter insurance fee
			System.out.print("Enter insurance fee: ");
			double fee = input.nextDouble();
			
			// instantiating objects
			Insurance policy;
			//validating input
			try
			{
				if (type.equalsIgnoreCase("Health") && fee > 0) 
				{
					policy = new Health(fee);
				}
				else if (type.equalsIgnoreCase("Life") && fee > 0)
				{
					policy = new Life(fee);
				}
				else 
				{
					throw new IllegalArgumentException("Input invalid");
				}
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
			
			insuranceList.add(policy); // adding to ArrayList
			System.out.println("\nInsurance added to insurance list");
			
			// prompts user to exit or continue
			System.out.print("Press 1 to add an account or 0 to exit: ");
			addPolicy = input.nextInt() == 1 ? true : false; // checking exit condition
		}
		
		// displaying all insurance objects
		System.out.println("------------All Insurance Accounts-------------");
		System.out.println();
		for (Insurance i : insuranceList)
		{
			i.displayInfo();
			System.out.println();
		}
		
		// increase fee and display insurance objects
		System.out.println("---------Increased monthly fee by $30----------");
		for (Insurance insurance : insuranceList)
		{
			insurance.setInsuranceCost(insurance.getMonthlyCost() + 30);
			insurance.displayInfo();
		}
		input.close();
		
	} // end main

} // end class InsuranceTest
