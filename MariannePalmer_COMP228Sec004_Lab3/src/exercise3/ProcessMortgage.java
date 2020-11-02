// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020
package exercise3;
import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Mortgage[] accounts = new Mortgage[3];
		
		// taking input for current interest rate
		System.out.print("Enter the current interest rate: ");
		double rate = input.nextDouble();
		
		// looping to add accounts to array
		for (int i = 0; i < accounts.length; i++)
		{
			// taking input for mortgage type
			System.out.printf("%n----------Mortage #%d-------------%n", i+1);
			
			String mortgageType;
			do 
			{
				System.out.print("Enter the mortgage type (business or personal): ");
				mortgageType = input.next();
				// validating input
				if (!mortgageType.equalsIgnoreCase("business") && !mortgageType.equalsIgnoreCase("personal"))
				{
					System.out.println("Mortgage type invalid.");
				}
			}
			while (!mortgageType.equalsIgnoreCase("business") && !mortgageType.equalsIgnoreCase("personal"));
			
			
			// taking input for name
			System.out.print("Enter the customer name: ");
			String customerName = input.next();
			
			// taking input for mortgage amount
			System.out.print("Enter the mortgage amount: ");
			double mortgageAmt = input.nextDouble();
			
			// taking input for term
			System.out.print("Enter the mortgage term: ");
			int term = input.nextInt();
			
			// error handling for instantiating mortgages
			try
			{
				// determining the type of mortgage
				if (mortgageType.equalsIgnoreCase("business"))
				{
					accounts[i] = new BusinessMortgage(customerName, mortgageAmt, term, rate); //instantiating and adding to array
				}
				else if (mortgageType.equalsIgnoreCase("personal"))
				{
					accounts[i] = new PersonalMortgage(customerName, mortgageAmt, term, rate);  //instantiating and adding to array
				}
			}	
			catch (Exception e)
			{
				// if there's an error, display message
				System.out.println(e.getMessage());
				System.out.println(" Enter account info again:");
				i--; // decremented to reset loop
			}
		}
		
		// displaying all mortgages
		System.out.print("\n--------All Mortgages--------\n");
		int count = 1;
		for (Mortgage mortgage : accounts)
		{
			System.out.printf("\n----------Mortgage %d---------\n", count++);
			if(mortgage != null)
			{
				System.out.print(mortgage.getMortgageInfo());
				// amount owed after one year
				System.out.printf("%nAmount owed after one year: $%.2f", mortgage.calculateOwed(1));
			}
		}
		
		input.close();
		
	} // end main

} // end class ProcessMortgage
