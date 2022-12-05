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

public class Coffee extends Beverage
{
	Size size;
	Boolean extraShot, extraSyrup;
	String bevName;
	
	public Coffee(String bevName, Size size, Boolean extraShot, Boolean extraSyrup)
	{
		super(bevName, Type.COFFEE , size);
		this.size = size;
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		this.bevName = bevName;
	}
	
	public boolean getExtraShot()
	{
		return this.extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return this.extraSyrup;
	}
	
	public double calcPrice()
	{
		double total = 0;
		total += addSizePrice();
		if(getExtraShot() == true)
		{
			total += 0.50;
		}
		if(getExtraSyrup() == true)
		{
			total += 0.50;
		}
		return total;
	}
	
	public String toString()
	{
		return this.bevName + " " + this.size + " " + this.extraShot + " " + this.extraSyrup + " " + calcPrice();
	}
	
	public boolean equals(Object anotherBev)
	{
		Coffee f = (Coffee) anotherBev;
		if(this.type != f.type)
		{
			return false;
		}
		if(this.size != f.size)
		{
			return false;
		}
		if(this.BASE_PRICE != f.BASE_PRICE)
		{
			return false;
		}
		if(this.extraShot != f.extraShot)
		{
			return false;
		}
		if(this.extraSyrup != f.extraSyrup)
		{
			return false;
		}
		return true;
	}
}
