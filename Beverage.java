/*
 * Class: CMSC203 
 * Instructor: Kuijt
 * Description: (Give a brief description for each Class)
 * Due: 12/5/22
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shawn Bearam Jr.
*/


import java.lang.Object;

public abstract class Beverage extends Object
{
	String bevName;
	Type type;
	Size size;
	final double BASE_PRICE = 2.0;
	final double SIZE_PRICE = 1.0;
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public double getBasePrice()
	{
		return BASE_PRICE;
	}
	
	public Type getType()
	{
		return this.type;
	}
	
	public String getBevName()
	{
		return this.bevName;
	}
	
	public Size getSize()
	{
		return this.size;
	}
	
	public double addSizePrice()
	{
		if(this.size == Size.MEDIUM)
		{
			return BASE_PRICE + SIZE_PRICE;
		}
		if(this.size == Size.MEDIUM)
		{
			return BASE_PRICE + SIZE_PRICE + SIZE_PRICE;
		}
		return BASE_PRICE;
	}
	
	public String toString()
	{
		return this.bevName + " " + this.size;
	}
	
	public boolean equals(Object anotherBev)
	{
		Beverage b = (Beverage) anotherBev;
		if(this.type != b.type)
		{
			return false;
		}
		if(this.size != b.size)
		{
			return false;
		}
		if(this.bevName != b.bevName)
		{
			return false;
		}
		return true;
	}
	
	public abstract double calcPrice(); 
}
