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

public class Customer extends Object 
{
	String name;
	int age;
	public Customer(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer c)
	{
		c = new Customer(name, age);
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return getName() + " " + getAge();
	}
}
