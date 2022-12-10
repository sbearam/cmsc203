/*
 * Class: CMSC203 
 * Instructor: Kuijt
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shawn Bearam Jr.
*/

package application;

public class Property 
{
	String propertyName = "";
	String city = "";
	double rentAmount = 0;
	String owner = "";
	Plot plot;
	
	public Property()
	{
	propertyName = "";
	city = "";
	rentAmount = 0;
	owner = "";
	plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
	}
	
	public Property(Property otherProperty)
	{
		propertyName = otherProperty.propertyName;
		city = otherProperty.city;
		owner = otherProperty.owner;
		rentAmount = otherProperty.rentAmount;
		plot = otherProperty.plot;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public String getPropertyName()
	{
		return this.propertyName;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public double getRentAmount()
	{
		return this.rentAmount;
	}
	
	public String getOwner()
	{
		return this.owner;
	}
	
	public String toString()
	{
		String prop;
		prop = propertyName + "," + city + "," + owner + "," + rentAmount;
		return prop;
	}
}
