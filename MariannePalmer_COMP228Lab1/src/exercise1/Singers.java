// Marianne Palmer - 301122149 - COMP228 Fall2020
package exercise1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Singers 
{
	private int id;
	private String name;
	private String address;
	private Date dob;
	private int numAlbums;

	// Constructors
	public Singers() {}
	
	public Singers(int id) 
	{
		this.id = id;
	}
	
	public Singers(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	public Singers(int id, String name, String address) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Singers(int id, String name, String address, Date dob) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	
	public Singers(int id, String name, String address, Date dob, int numAlbums) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	
	// Setters
	public void setID (int id) 
	{
		this.id= id;
	}
	
	public void setName (String name) 
	{
		this.name = name;
	}
	
	public void setAddress (String address) 
	{
		this.address = address;
	}
	
	public void setDOB (Date dob) 
	{
		this.dob = dob;
	}
	
	public void setNumAlbums(int numAlbums) 
	{
		this.numAlbums = numAlbums;
	}
	
	// Setter for all properties
	public void setSingerInfo(int id, String name, String address, Date dob, int numAlbums) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.numAlbums = numAlbums;
	}
	
	// Getters
	public int getID () 
	{
		return id;
	}
	
	public String getName () 
	{
		return name;
	}
	
	public String getAddress () 
	{
		return address;
	}
	
	public Date getDOB () 
	{
		return dob;
	}
	
	public int getNumAlbums () 
	{
		return numAlbums;
	}

	@Override
	public String toString () 
	{
		// Converts Date to formatted String
		String dobString = "";
		if (this.dob != null) 
		{
			String pattern = "dd/MM/yyyy";
			DateFormat dateFormat = new SimpleDateFormat(pattern);
			dobString = dateFormat.format(this.dob);			
		}
		
		return String.format("\n==========Singer Information=========\n"
			+ "ID: %d%nName: %s%nAddress: %s%nDOB: %s%nAlbums: %d"
			, id, name, address, dobString, numAlbums);
	}

} // end Singers
