// Marianne Palmer - 301122149 - COMP228-004 - Lab3 - Fall2020
package exercise2;

public abstract class GameTester {
	private String name;
	private boolean status;
	
	// constructor
	public GameTester(String name, boolean status)
	{
		this.name = name;
		this.status = status;
	}

	public abstract void setSalary(double salary);

	// getter and setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter and setter for status
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString()
	{
		return String.format("%nName: %s%nFull-time: %b%n", name, status);
	}
	
} // end Class GameTester
