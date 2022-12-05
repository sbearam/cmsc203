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

public class Alcohol extends Beverage
{
	String bevName;
	Size size;
	Boolean isWeekend;
	public Alcohol(String bevName, Size size, Boolean isWeekend)
	{
		super(bevName, Type.ALCOHOL, size);
		this.bevName = bevName;
		this.size = size;
		this.isWeekend = isWeekend;
	}
	
	public double calcPrice()
	{
		double total = 0;
		total += addSizePrice();
		if(isWeekend == true)
		{
			total += 0.60;
		}
		return total;
	}
	
	public String toString()
	{
		return this.bevName + " " + this.size + " " + this.isWeekend + " " + calcPrice();
	}
	
	public boolean equals(Object anotherBev)
	{
		Alcohol a = (Alcohol) anotherBev;
		if(this.type != a.type)
		{
			return false;
		}
		if(this.size != a.size)
		{
			return false;
		}
		if(this.BASE_PRICE != a.BASE_PRICE)
		{
			return false;
		}
		if(this.isWeekend != a.isWeekend)
		{
			return false;
		}
		return true;
	}
	
	public Boolean isWeekend()
	{
		return this.isWeekend;
	}
}
