// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020
package exercise2;

public class FullTimeGameTester extends GameTester
{

	private double salary = 3000;
	
	// constructor
	public FullTimeGameTester(String name) 
	{
		// sets status to true
		super(name, true);
	}

	// getter and setter for salary
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	};
	
	@Override	
	public String toString()
	{
		// adds onto super class string
		return super.toString() + String.format("Salary: $%.2f%n", salary);
	}
	
} // end Class FullTimeGameTester
