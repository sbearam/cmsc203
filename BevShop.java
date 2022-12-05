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

public class BevShop extends Object implements BevShopInterface
{
	
	public ArrayList<Order>orders = new ArrayList<Order>();
	int numOfAlcohol = 0;
	int index = 0;
	
	public boolean isValidTime(int time)
	{
		if (time <= MAX_TIME && time >= MIN_TIME)
		{
			return true;
		}
		return false;
	}
	
	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits)
	{
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		return false;
	}
	
	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isEligibleForMore()
	{
		if(numOfAlcohol == getMaxOrderForAlcohol())
		{
			return true;
		}
		return false;
	}
	
	public int getNumOfAlcoholDrink()
	{
		return numOfAlcohol;
	}
	
	public boolean isValidAge(int age)
	{
		if(age >= MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge)
	{
		
		Customer c = new Customer(customerName, customerAge);
		c.setAge(customerAge);
		c.setName(customerName);
		Order o = new Order(time, day, c);
		orders.add(o);
		index = orders.indexOf(o);
		numOfAlcohol = 0;
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		Order o = orders.get(index);
		o.addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public void processAlcoholOrder(String bevName, Size size)
	{
		Order o = orders.get(index);
		o.addNewBeverage(bevName, size);
		numOfAlcohol++;
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		Order o = orders.get(index);
		o.addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	public int findOrder(int orderNo)
	{
		int status = -1;
		for(int i = 0; i < orders.size(); i++)
		{
			Order o = orders.get(i);
			if(o.getOrderNo() == orderNo)
			{
				return orderNo;
			}
		}
		return status;
	}
	
	public double totalOrderPrice(int orderNo)
	{
		Order o = orders.get(orderNo);
		return o.calcOrderTotal();
	}
	
	public double totalMonthlySale()
	{
		double total = 0;
		for(int i = 0; i < orders.size(); i++)
		{
			Order o = orders.get(i);
			total += o.calcOrderTotal();
		}
		return total;
	}
	
	public int totalNumOfMonthlyOrders()
	{
		return orders.size();
	}
	
	public Order getCurrentOrder()
	{
		Order o = orders.get(index);
		return o;
	}
	
	public Order getOrderAtIndex(int index)
	{
		Order o = orders.get(index);
		return o;
	}
	
	public void sortOrders()
	{
		int minIndex, minValue, start, index;
		Order temp;
		for (start = 0; start < (orders.size() - 1); start++)
		{ 
			Order o = orders.get(start);
			minIndex = start; 
			minValue = o.getOrderNo(); 
			for (index = start + 1; index < orders.size(); index++) 
			{ 
				Order o1 = orders.get(index);
				if (o1.getOrderNo() < minValue) 
				{ 
				minValue = o1.getOrderNo(); 
				minIndex = index; 
				} 
			} 
		temp = orders.get(minIndex);
		orders.add(minIndex, orders.get(start));
		orders.add(start,temp);
		}
	}
	
	
	public String toString()
	{
		return orders + " " + totalMonthlySale();
	}
}
