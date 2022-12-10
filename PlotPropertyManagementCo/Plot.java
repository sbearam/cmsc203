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

public class Plot extends Object 
{
	private int x, y, depth, width;
	public Plot()
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.getX();
		this.y = otherPlot.getY();
		this.width = otherPlot.getWidth();
		this.depth = otherPlot.getDepth();
	}

	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public int getDepth()
	{
		return this.depth;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public String toString()
	{
		return x + "," + y + "," + width + "," + depth;
	}
	
	public boolean encompasses(Plot plot) 
	{

        int pX = plot.getX();

        int pY = plot.getY();

        int pW = plot.getWidth();

        int pD = plot.getDepth();

        return ((pX >= x) && (pY >= y) && (pX + pW <= x + width) && (pY + pD <= y + depth));

	}
	
	public boolean overlaps(Plot plot)
	{
		Boolean overlapping = true;
		int pX = plot.getX();
		int pY = plot.getY();
		int pW = plot.getWidth();
		int pD = plot.getDepth();
		//int cbottomLeft = (getX() + getY());
		//int ctopLeft = (getX() + getDepth());
		//int cbottomRight = (getX());
		if (x >= (pX + pW)) 
		{
			overlapping = false;
		}
		else if (y >= (pY +pD))
		{
			overlapping = false;
		}
		else if ((x + width) <= pX)
		{
			overlapping = false;
		}
		else if ((y + depth) <= pY)
		{
			overlapping = false;
		}
		return overlapping; 
		//return ((pX < x + width) && (pX + pW > x) && (pY < y + depth) && (pY + pD > y));
	}
}
