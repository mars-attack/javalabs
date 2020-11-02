// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020
package exercise2;

public class PartTimeGameTester extends GameTester
{
	private int hours;
	private double salary = 20; //hourly
	
	// constructor
	public PartTimeGameTester(String name, int hours) 
	{
		// sets status to false
		super(name, false);
		this.hours = hours;
	}

	// getter and setter for salary
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	// getter and setter for hours
	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + String.format("Hourly Wage: $%.2f%nHours: %d%n", salary, hours);
	}
	
}// end Class PartTimeGameTester
