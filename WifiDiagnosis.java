/*
 * Class: CMSC203 
 * Instructor:Kuijt
 * Description: (Give a brief description for each Class)
 * Due: 09/12/22
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shawn Bearam Jr.
*/


import java.util.Scanner;
public class WifiDiagnosis 
{
	public static void main(String[] args)
	{
		final String DECISION = "Did that fix the problem(Yes or No)?";
		Scanner keyboard = new Scanner(System.in);
		String fixed = "";
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("Reboot the computer and try to connect.\n" + DECISION);
		fixed = keyboard.nextLine();
		fixed = fixed.toLowerCase();
		if (fixed.equals("no"))
		{
			System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router\n" + DECISION);
			fixed = keyboard.nextLine();
			fixed = fixed.toLowerCase();
			if (fixed.equals("no"))
			{
				System.out.println("Move the computer closer to the router and try to connect\n" + DECISION);
				fixed = keyboard.nextLine();
				fixed = fixed.toLowerCase();
				if (fixed.equals("no"))
				{
					System.out.println("Contact your ISP");
				}
			}
		}
		if (!fixed.equals("no") && !fixed.equals("yes"))
		{
			System.out.println("Invalid answer, try again");
		}
		System.out.println("Done!");
		System.out.println("Programmer: Shawn Bearam Jr.");
		return;
	}
	
}
