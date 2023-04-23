

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class TwoDimRaggedArrayUtility {

	
	public static final int MAX_SIZE = 10;
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	public static double getAverage(double[][] data)
	{
		double sum = 0;
		int total = 0;
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            sum += data[i][j];
	            total++;
	        } 
	    }
		return (double)sum/total;
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0;
		for (int i = 0; i < data.length; i++)
		{
			total += data[i][col];
		}
		return total;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double highest = 0;
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            if(data[i][j] > highest)
	            	highest = data[i][j];
	        } 
	    }
		return highest;
	}
	
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highest = 0;
		for (int i = 0; i < data.length; i++)
		{
			if(data[i][col] > highest)
            	highest = data[i][col];
		}
		return highest;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		double highest = 0;
		int index = 0;
		for (int i = 0; i < data.length; i++)
		{
			
			{
			if(data[i][col] > highest)
            	highest = data[i][col];
				index = i;
			}
		}
		return index;
	}
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double highest = 0;
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] > highest)
				highest = data[row][i];
		}
		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		double highest = 0;
		int index = 0;
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] > highest)
				highest = data[row][i];
				index = i;
		}
		return index;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double lowest = data[0][0];
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            if(data[i][j] < lowest)
	            	lowest = data[i][j];
	        } 
	    }
		return lowest;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowest = data[0][col];
		for (int i = 0; i < data.length; i++)
		{
			if(data[i][col] < lowest)
            	lowest = data[i][col];
		}
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int index = 0;
		double lowest = data[0][col];
		for (int i = 0; i < data.length; i++)
		{
			if(data[i][col] < lowest)
			{
            	lowest = data[i][col];
				index = i;
			}
		}
		return index;
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowest = data[row][0];
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowest)
				lowest = data[row][i];
		}
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int index = 0;
		double lowest = data[row][0];
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowest)
			{
				lowest = data[row][i];
				index = i;
			}
		}
		return index;
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double sum = 0;
		for(int i = 0; i < data[row].length;i++)
		{
			sum += data[row][i];
		}
		return sum;
	}
	
	public static double getTotal(double[][] data)
	{
		double sum = 0;
		
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            sum += data[i][j];
	            
	        } 
	    }
		return sum;
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		String dataFile = file.getName();
		String text;
		
		Scanner sc = new Scanner(new BufferedReader(new FileReader(dataFile)));
		
		double[][] data = new double[MAX_SIZE][MAX_SIZE];
		
		for (int i = 0; i < MAX_SIZE; i++)
		{
			for (int j = 0; j < MAX_SIZE; j++)
			{
				data[i][j] = 0;
			}
		}
		
		for(int i = 0; i < MAX_SIZE; i++)
		{
			text = sc.nextLine();
			if(text == null)
				break;
			String breaks[] = text.split(" ");
			int index = 0;
			for(int j=0;j < breaks.length;j++)
			{
				if(index<MAX_SIZE)
				{
					if(breaks[j].length()>0)
					{
						data[i][j] = Double.parseDouble(breaks[j]);
					}
					else break;
				}
			}
		}
		return(data);
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter(outputFile);
		String dataString;
		for (int i = 0; i < data.length;i++)
		{
			dataString = "";
			for (int j = 0; j < data[i].length;j++)
			{
				dataString += data[i][j] + " ";
			}
			dataString += "\n";
			pw.write(dataString);
		}
		pw.close();
	}
}
