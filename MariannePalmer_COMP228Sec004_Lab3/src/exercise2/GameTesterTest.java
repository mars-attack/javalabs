// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020
package exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class GameTesterTest 
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
	
		ArrayList<GameTester> testerList = new ArrayList<GameTester>();
		
		// exit condition for while loop
		boolean addTester = true;
		while(addTester)
		{
			System.out.print("\nPlease enter your name: ");
			String name = input.next();
			
			System.out.print("Please enter 'F' for full-time or 'P' for part-time: ");
			String status = input.next();
			
			// validating user input for full-time and part-time
			try
			{
				if (status.equalsIgnoreCase("F"))
				{
					testerList.add(new FullTimeGameTester(name)); // instantiating tester and adding to ArrayList
				}
				else if (status.equalsIgnoreCase("P"))
				{
					// input for part-time hours
					System.out.print("Please enter the number of hours: ");
					int hours = input.nextInt();
					
					testerList.add(new PartTimeGameTester(name, hours)); // instantiating tester and adding to ArrayList
				}
				else
				{
					throw new IllegalArgumentException("Input invalid"); // error if user does not enter 'F' or 'P'
				}
			}
			catch (IllegalArgumentException e)
			{
				System.out.println(e.getMessage()); // print error message
				continue;
			}
			
			System.out.println("\nTester added to list");
			System.out.print("Press 1 to add an account or 0 to exit: ");
			addTester = input.nextInt() == 1 ? true : false; // updating and checking exit condition
			
		}
			
		// printing all game testers
		System.out.print("\n-----------List of Game Testers----------");
		for (GameTester tester : testerList)
		{
			System.out.print(tester);
			System.out.printf("Class: %s%n", tester.getClass().getName().substring(10)); // print object class
		}
		
		input.close();
		
	}// end main

}// end Class GameTesterTest
