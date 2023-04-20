package application;

import java.io.*;
import java.util.*;

public final class TwoDimRaggedArrayUtility extends Object 
{
	final int MAX_ROW = 10;
	final int MAX_COL = 10;
	
	 public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	    {
	        PrintWriter output = new PrintWriter(outputFile);
	        for(int row = 0; row < data.length; row++)
			{
	        	if(row > 0)
	        	{
	        		output.println();
	        	}
	        	
				for (int col = 0; col < data[row].length; col++)
				{
					 output.print(data[row][col] + " ");
				}
			}
	        output.close();
	    }
	
	 public static double[][] readFile(File file) throws FileNotFoundException
	    {
		 int row = 0;
	        Scanner eachline;
	        Scanner fileinput = new Scanner(file);
	        double[][] info;
	        while(fileinput.hasNextLine())
	        {
	            row++;
	            fileinput.nextLine();
	        }
	        fileinput.close();

	        info = new double[row][];
	        eachline = new Scanner(file);
	        for (int i = 0; i < row; i ++)
	        {
	            String line = eachline.nextLine();
	            String[] cols = line.split(" ");
	            info[i] = new double[cols.length];
	            for(int j = 0; j < cols.length; j++)
	            {
	                info[i][j] = Double.parseDouble(cols[j]);
	            }
	        }
	        eachline.close();
	        return info;
	        }
	 
	public static double getTotal(double[][] data)
	{
		//this method returns the total of all the element in a 2D ragged array
		double total = 0;
		for(int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				total += data[row][col];
			}
		}
		return total;
	} 
	
	 public static double getAverage(double[][] data)
	    {
	        double counter = 0;
			for(int row = 0; row < data.length; row++)
			{
				for (int col = 0; col < data[row].length; col++)
				{
					counter++;
	            }
			}
	        return (getTotal(data)/counter);
	    }
	    

	    public static double getRowTotal(double[][] data, int row)
	    {
	        double total = 0;
	        for(int col = 0; col < data[row].length; col++)
	        {
	            total += data[row][col];
	        }
	        return total;
	    }

	    public static double getColumnTotal(double[][] data, int col)
	    {
	        double total = 0;
	        for(int row = 0; row < data.length; row++)
	        {
	            total += data[row][col];
	        }
	        return total;
	    }

	    public static double getHighestInRow(double[][] data, int row)
	    {
	        double highest = 0;
	        for(int col = 0; col < data[row].length; col++)
	        {
	            if(data[row][col] > highest)
	            {
	                highest = data[row][col];
	            }
	        }
	        return highest;
	    }

	    public static int getHighestInRowIndex(double[][] data, int row)
	    {
	        double highest = 0;
	        int position = 0;
	        for(int col = 0; col < data[row].length; col++)
	        {
	            if(data[row][col] > highest)
	            {
	                highest = data[row][col];
	                position = col;
	            }
	        }
	        return position;
	    }

	    public static double getLowestInRow(double[][] data, int row)
	    {
	        double lowest = getHighestInRow(data, row);
	        for(int col = 0; col < data[row].length; col++)
	        {
	            if(data[row][col] < lowest)
	            {
	                lowest = data[row][col];
	            }
	        }
	        return lowest;
	    }

	    public static int getLowestInRowIndex(double[][] data, int row)
	    {
	        double lowest = getHighestInRowIndex(data, row);
	        int position = 0;
	        for(int col = 0; col < data[row].length; col++)
	        {
	            if(data[row][col] < lowest)
	            {
	                lowest = data[row][col];
	                position = col;
	            }
	        }
	        return position;
	    }

	    public static double getHighestInColumn(double[][] data, int col)
	    {
	        double highest = 0;
	        for(int row = 0; row < data.length; row++)
	        {
	        	if(data[row].length <= col || col < 0)
	              {
	                continue;
	              }
	            if(data[row][col] > highest)
	            {
	                highest = data[row][col];
	            }
	        }
	        return highest;
	    }

	    public static int getHighestInColumnIndex(double[][] data, int col)
	    {
	        double highest = 0;
	        int position = 0;
	        for(int row = 0; row < data.length; row++)
	        {
	        	if(data[row].length <= col || col < 0)
	              {
	                continue;
	              }
	            if(data[row][col] > highest)
	            {
	                highest = data[row][col];
	                position = row;
	            }
	        }
	        return position;
	    }

	    public static double getLowestInColumn(double[][] data, int col)
	    {
	        double lowest = getHighestInColumn(data, col);
	        for(int row = 0; row < data.length; row++)
	        {
	        	if(data[row].length <= col || col < 0)
	              {
	                continue;
	              }
	            if(data[row][col] < lowest)
	            {
	                lowest = data[row][col];
	            }
	        }
	        return lowest;
	    }

	    public static int getLowestInColumnIndex(double[][] data, int col)
	    {
	        double lowest = 0;
	        int position = 0;
	        for(int row = 0; row < data.length; row++)
	        {
	        	if(data[row].length <= col || col < 0)
	              {
	                continue;
	              }
	            if(data[row][col] < lowest)
	            {
	                lowest = data[row][col];
	                position = row;
	            }
	        }
	        return position;
	    }

	    public static double getHighestInArray(double[][] data)
	    {
	        double highest = 0;
			for(int row = 0; row < data.length; row++)
			{
				for (int col = 0; col < data[row].length; col++)
				{
	                if(data[row][col] > highest)
	                {
	                    highest = data[row][col];
	                }
				}
			}
			return highest;
	    }

	    public static double getLowestInArray(double[][] data)
	    {
	        double lowest = getHighestInArray(data);
			for(int row = 0; row < data.length; row++)
			{
				for (int col = 0; col < data[row].length; col++)
				{
	                if(data[row][col] < lowest)
	                {
	                    lowest = data[row][col];
	                }
				}
			}
			return lowest;
	    }

}
