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

import java.util.ArrayList;
public class ManagementCompany extends Object 
{
static final int MAX_PROPERTY = 5;
static final int MGMT_DEPTH = 10;
static final int MGMT_WIDTH = 10;
private Plot mgmPlot;
private String name, taxID;
private Property[] properties;
//private ArrayList<Property> properties2 = new ArrayList<Property>();
double mgmFee = 0;

public ManagementCompany()
{
	this.mgmPlot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	this.properties = new Property[MAX_PROPERTY];
}

public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
{
	this.name = name;
	this.taxID = taxID;
	this.mgmFee = mgmFee;
	this.mgmPlot = new Plot(x, y, width, depth);
	this.properties = new Property[MAX_PROPERTY];
}

public ManagementCompany(String name, String taxID, double mgmFee)
{
	this.name = name;
	this.taxID = taxID;
	this.mgmFee = mgmFee;
	this.mgmPlot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	this.properties = new Property[MAX_PROPERTY];
}

public ManagementCompany(ManagementCompany otherCompany)
{
	this.properties = otherCompany.properties;
	this.mgmPlot = otherCompany.mgmPlot;
	this.mgmFee = otherCompany.mgmFee;
	this.taxID = otherCompany.taxID;
	this.name = otherCompany.name;
}

public int addProperty(String name, String city, double rent, String owner)
{
	Property home = new Property(name, city, rent, owner);
	int value = -1;
	Property prop;
	if(home == null)
	{
		value = -2;
	}
	for (int i = 0; i < properties.length; i++)
	{
		prop = properties[i];
		if(properties[i] != null)
		{
			if (prop.getPlot().overlaps(home.getPlot()))
			{
				return -4;
			}
			else if (mgmPlot.encompasses(home.getPlot()))
			{
				properties[i] = home;
				return i;
			}
		}
		
	}
	return value;
}

public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
{
	Property home = new Property(name, city, rent, owner, x, y, width, depth);
	int value = -1;
	Property prop;
	if(home == null)
	{
		value = -2;
	}
	for (int i = 0; i < properties.length; i++)
	{
		prop = properties[i];
		if(properties[i] != null)
		{
			System.out.print("Testing property prop:" + prop + "vs" + home);
			if (prop.getPlot().overlaps(home.getPlot()))
			{
				return -4;
			}
			else if (mgmPlot.encompasses(home.getPlot()))
			{
				properties[i] = home;
				return i;
			}
		}
		
	}
	return value;
}

public int addProperty(Property property)
{
	Property home = new Property(property);
	int value = -1;
	Property prop;
	{
	if(home == null)
	{
		value = -2;
	}
	else if(!mgmPlot.encompasses(home.getPlot()))
	{
		value = -3;
	}
	else
	{
		for (int i = 0; i < properties.length; i++)
		{
			prop = properties[i];
			if(properties[i] != null)
			{
				//Property p = new Property(home);
				//value = i;
				//System.out.print("Testing property prop:" + prop + "vs" + home);
				if(prop.getPlot().overlaps(home.getPlot()))
				{
					value = -4;
				}
				
			}
			else if(value == -1)
			{
				properties[i] = home;
				value = i;
			}
		}
	}
	
		
	
	}
	return value;
}

public void removeLastProperty()
{
	for (int i = MAX_PROPERTY; i > 0; i--)
	{
		if (properties[i] != null)
		{
			properties[i] = null;
			break;
		}
	}
}

public boolean isPropertiesFull()
{
	boolean full = true;
	for(int i = 0; i < MAX_PROPERTY; i++)
	{
		if(properties[i] == null)
		{
			full = false;
			break;
		}
	}
	return full;
}

public int getPropertiesCount()
{
	int sum = 0;
	for (int i = 0; i < MAX_PROPERTY; i++)
	{
		if (properties[i] != null)
		{
			sum++;
		}
	}
	return sum;
}

public double getTotalRent()
{
	double sum = 0;
	
	for(int i = 0; i < properties.length; i++)
	{
		if(properties[i] != null)
		{
			sum = properties[i].getRentAmount() + sum;
		}
	}
	return sum;
}

public Property getHighestRentProperty()
{
	//Property home = new Property();
	int highprop = 0;
	
	for (int i = 0; i < properties.length; i++)
	{
		if(properties[i] != null)
		{
			if (properties[i].getRentAmount() > properties[highprop].getRentAmount())
			{
				highprop = i;
			}
		}
		
	}
	return properties[highprop];
}

public Boolean isManagementFeeValid()
{
	if (this.mgmFee < 100 && this.mgmFee > 0)
	{
		return true;
	}
	else 
	{
		return false;
	}
}

public String getName()
{
	return this.name;
}

public String getTaxID() 
{
	return this.taxID;
}

public Property[] getProperties()
{
	return properties;
}

public double getMgmFeePer()
{
	return this.mgmFee;
}

public Plot getPlot()
{
	return this.mgmPlot;
}

public String toString()
{
	StringBuilder props = new StringBuilder();
	for (int i = 0; i < MAX_PROPERTY; i++)
		if(properties[i] != null)
			props.append(properties[i].toString()).append("\n\n");
	
	return props.toString();
}
}
