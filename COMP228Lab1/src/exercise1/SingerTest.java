// Marianne Palmer - 301122149 - COMP228 Fall2020
package exercise1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SingerTest 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		Singers singer1  = new Singers(); // instantiates with zero arguments
		
		System.out.println("===========Default Values===========");
		System.out.println("ID: " + singer1.getID());
		System.out.println("Name: " + singer1.getName());
		System.out.println("Address:" + singer1.getAddress());
		System.out.println("DOB: " + singer1.getDOB());
		System.out.println("Albums: " + singer1.getNumAlbums());
		System.out.println();
		System.out.println("====================================");
		
		System.out.println("Please enter the following information:");
		
		// takes input and sets id
		System.out.print("Singer id: ");
		int id = input.nextInt();
		singer1.setID(id);
		
		input.nextLine();  // consumes newline left-over
		
		// takes input and sets name
		System.out.print("Singer name: ");
		String name = input.nextLine();
		singer1.setName(name);
		
		//  takes input and sets address
		System.out.print("Singer address: ");
		String address = input.nextLine();
		singer1.setAddress(address);
		
		// loops if date format is incorrect
		while (singer1.getDOB() == null) 
		{
			System.out.print("Singer date of birth (dd/MM/yyyy): ");
			String dobString = input.next();
			
			// converting a String to Date
			String pattern = "dd/MM/yyyy";
			SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
			Date dob = new Date();
			// exception handling for if the string does not match the date format
			try 
			{
				dob = dateFormat.parse(dobString);
				singer1.setDOB(dob);
			} 
			catch (ParseException e) 
			{
				System.out.printf("Error: Incorrect Date Format. Please enter again. %n");
			}
		}
		
		// takes input and sets the number of albums
		System.out.print("Number of albums: ");
		int numAlbums = input.nextInt();
		singer1.setNumAlbums(numAlbums);
		
		System.out.print(singer1.toString());
		input.close(); // closes the scanner
		
	} // end main

} // end class
