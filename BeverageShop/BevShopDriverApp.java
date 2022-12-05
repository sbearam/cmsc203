import java.util.*;

public class BevShopDriverApp 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Starting a new order at 12PM on Monday");
		System.out.println("Age: 17, Name:Shawn, Smoothie, Small");
		BevShop bevShop = new BevShop();
		bevShop.startNewOrder(12, Day.MONDAY, "Shawn", 17);
		bevShop.processSmoothieOrder("Large Smoothie", Size.SMALL, 0, false); 
		System.out.println("Total: " + bevShop.totalOrderPrice(0));
		keyboard.close();
	}

}
