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
import java.util.ArrayList;
import java.util.Random;

public class Order extends Object implements OrderInterface, Comparable<Order> 
{
	int orderTime = 0;
	Day orderDay;
	Customer cust;
	final int MIN_ORDER_NO = 10000;
	final int MAX_ORDER_NO = 90000;
	public ArrayList<Beverage>bevs;
	
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		bevs = new ArrayList<Beverage>();
	}
	
	public int generateOrder()
	{
		Random rand = new Random();
		int orderNo = rand.nextInt(MAX_ORDER_NO - MIN_ORDER_NO + 1) + MIN_ORDER_NO;
		return orderNo;
	}
	
	public int getOrderNo()
	{
		return generateOrder();
	}
	
	public int getOrderTime()
	{
		return this.orderTime;
	}
	
	public Day getOrderDay()
	{
		return this.orderDay;
	}
	
	public Customer getCustomer()
	{
		return this.cust;
	}
	
	public Day getDay()
	{
		return this.orderDay;
	}
	
	public boolean isWeekend()
	{
		if(this.orderDay == Day.SATURDAY || this.orderDay == Day.SUNDAY)
		{
			return true;
		}
		return false;
	}
	
	public Beverage getBeverage(int itemNo)
	{
		return bevs.get(itemNo);
	}
	
	public int getTotalItems()
	{
		int count = 0;
		for (int i = 0; i < bevs.size(); i++)
		{
			count ++;
		}
		return count;
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		Coffee c = new Coffee(bevName, size, extraShot, extraSyrup);
		bevs.add(c);
	}
	
	public void addNewBeverage(String bevName, Size size)
	{
		boolean isWeekend = isWeekend();
		Alcohol a = new Alcohol(bevName, size, isWeekend);
		bevs.add(a);
		
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		Smoothie s = new Smoothie(bevName, size, numOfFruits, addProtein);
		bevs.add(s);
	}
	
	public double calcOrderTotal()
	{
		double total = 0;
		Beverage bev;
		for(int i = 0; i < bevs.size(); i++)
		{
			bev = bevs.get(i);
			total += bev.calcPrice();
		}
		return total;
	}
	
	public int findNumOfBeveType(Type type)
	{
		int duplicate = 0;
		for(int i = 0; i < bevs.size(); i++)
		{
			if(bevs.get(i).getType() == type)
			{
				duplicate++;
			}
		}
		return duplicate;
	}
	
	public String toString()
	{
		return getOrderNo() + " " + getOrderTime() + " " + getOrderDay() + " "  + cust.getName() + " " + cust.getAge() + " " + bevs;
	}
	
	public int compareTo(Order anotherOrder)
	{
		int status = 0;
		if(getOrderNo() == anotherOrder.getOrderNo())
		{
			status = 0;
		}
		else if(getOrderNo() > anotherOrder.getOrderNo())
		{
			status = -1;
		}
		else if(getOrderNo() < anotherOrder.getOrderNo())
		{
			status = 1;
		}
		return status;
	}
}
