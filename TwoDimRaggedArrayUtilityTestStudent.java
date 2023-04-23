
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a TwoDimRaggedArrayUtility object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet1 = {{2,3,4},{5,6},{7,8,9,10}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(34.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,2),.001);
	}
	
	@Test
	public void getAverage() {
		assertEquals(6.0,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}
	
	@Test
	public void getColumnTotal()
	{
		assertEquals(14.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0),.001);
	}
	
	@Test
	public void getHighestInArray()
	{
		assertEquals(10.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
	}
	
	@Test
	public void getHighestInColumn()
	{
		assertEquals(8.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 1),.001);
	}
	
	@Test
	public void getHighestInColumnIndex()
	{
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 1),.001);
	}
	
	@Test
	public void getHighestInRow()
	{
		assertEquals(10.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2),.001);
	}
	
	@Test
	public void getHighestInRowIndex()
	{
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2),.001);
	}
	
	@Test
	public void getLowestInArray()
	{
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	}
	
	@Test
	public void getLowestInColumn()
	{
		assertEquals(3,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 1),.001);
	}
	
	@Test
	public void getLowestInColumnIndex()
	{
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 1),.001);
	}
	
	@Test
	public void getLowestInRow()
	{
		assertEquals(5.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 1),.001);
	}
	
	@Test
	public void getLowestInRowIndex()
	{
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 2),.001);
	}
	
	@Test
	public void getRowTotal()
	{
		assertEquals(11.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1),.001);
	}
	
	@Test
	public void getTotal()
	{
		assertEquals(54.0,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}
	
	
}
