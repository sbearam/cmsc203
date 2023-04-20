package application;

public class HolidayBonus extends Object
{
	
	public static double[] calculateHolidayBonus(double[][] data)
    {
		double[] bonus = new double[data[0].length];
        double highest = 0, lowest = 0;
        for(int col = 0; col < data[0].length; col++)
        { 	 
             highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
          	lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);
            for(int row = 0; row < data.length; row++)
            {
             if(data[row].length <= col || col < 0)
              {
                continue;
              }
            	else if(data[row][col] <= 0)
            	{
            		bonus[row] += 0;
            	}
            	else if(data[row][col] == highest && data[row][col] != lowest)
                {
                    bonus[row] += 5000;
                }
                else if(data[row][col] == lowest && data[row][col] != highest)
                {
                    bonus[row] += 1000;
                }
                else
                {
                    bonus[row] += 2000;
                }
            }
        }
        return bonus;
    }
    
	

	    public static double calculateTotalHolidayBonus(double[][] data)
	    {
	        double total = 0;
	        for(int row = 0; row < data.length; row++)
	        {
	            total += calculateHolidayBonus(data)[row];
	        }
	        return total;
	    }
}
