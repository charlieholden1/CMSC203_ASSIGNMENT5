/*
 * Class: CMSC203 
 * Instructor:Farnaz Eivazi
 * Description: (Give a brief description for each Class)
 * Due: 4/19/23
 * Platform/compiler:Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Charlie Holden
*/
public class HolidayBonus extends TwoDimRaggedArrayUtility{

	public static final double LOW_BONUS = 1000, HIGH_BONUS = 5000, MIDDLE_BONUS = 2000;
	public HolidayBonus()
	{
	
	}
	
	public static double[] calculateHolidayBonus(double[][] data)
	{
		
		double[] totals = new double[data.length];
		double[] bonuses = new double[data.length];
		for (int i = 0; i < data.length; i++)
		{
			totals[i] = getRowTotal(data, i);
		}
		int lowest = 0, highest = 0;
		double lowestTotal = totals[0], highestTotal = totals[0];
		for(int i = 0; i < totals.length;i++)
		{
			if(totals[i] > highestTotal)
			{
				highest = i;
				highestTotal = totals[i];
			}
			if(totals[i] < lowestTotal)
			{
				lowest = i;
				lowestTotal = totals[i];
			}
		}
		
		for (int i = 0; i < data.length; i++)
		{
			if(i == lowest)
				bonuses[i]= LOW_BONUS * data[i].length ;
			else if(i == highest)
				bonuses[i] = HIGH_BONUS * data[i].length ;
			else bonuses[i] = MIDDLE_BONUS * data[i].length ;
			
				
		}
		return(bonuses);
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double[] bonuses = calculateHolidayBonus(data);
		double sum=0;
		for(int i = 0; i < bonuses.length;i++)
		{
			sum += bonuses[i];
		}
		return sum;
	}
}
