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

public class Smoothie extends Beverage
{
	String bevName;
	Size size;
	int numOfFruits;
	Boolean addProtein;
	Type type = Type.SMOOTHIE;
	final double PROTEIN_COST = 1.50;
	final double FRUIT_COST = 0.50;
	
	public Smoothie(String bevName, Size size, int numOfFruits, Boolean addProtein)
	{
		super(bevName, Type.SMOOTHIE, size);
		this.bevName = bevName;
		this.size = size;
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	public int getNumOfFruits()
	{
		return this.numOfFruits;
	}
	
	public Boolean getAddProtein()
	{
		return this.addProtein;
	}
	
	public String toString()
	{
		return this.bevName + " " + this.size + " " + this.addProtein + " " + this.numOfFruits + " " + calcPrice();
	}
	
	public double calcPrice()
	{
		double total = 0;
		total += addSizePrice();
		if(getAddProtein() == true)
		{
			total += 1.50;
		}
		for(int i = 0; i < getNumOfFruits(); i++)
		{
			total += 0.50;
		}
		return total;
	}
	
	public boolean equals(Object anotherBev)
	{
		Smoothie s = (Smoothie) anotherBev;
		if(this.type != s.type)
		{
			return false;
		}
		if(this.size != s.size)
		{
			return false;
		}
		if(this.BASE_PRICE != s.BASE_PRICE)
		{
			return false;
		}
		if(this.numOfFruits != s.numOfFruits)
		{
			return false;
		}
		if(this.addProtein != s.addProtein)
		{
			return false;
		}
		return true;
	}
}
