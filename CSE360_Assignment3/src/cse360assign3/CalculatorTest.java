package cse360assign3;

/** Creating a calculator and commit to GitHub
 * @author Thien Duc Phung 
 * 		PIN#: 703
 * @version 2/20/2016
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test // Junit test case for Calculator method
	public void testCalculator() 
	{
		Calculator TI83 = new Calculator();
		
		assertNotNull("This method is not null", TI83);
	}
	
	@Test // Junit test case for getTotal method
	public void testGetTotal()
	{
		fail("Not yet implement");
	}
	
	@Test // Junit test case for add method
	public void testAdd()
	{
		fail("Not yet implement");
	}
	
	@Test // Junit test case for subtract method
	public void testSubtract()
	{
		fail("Not yet implement");
	}
	
	@Test // Junit test case for multiply method
	public void testMultiply()
	{
		fail("Not yet implement");
	}
	
	@Test // Junit test case for divide method
	public void testDivide()
	{
		fail("Not yet implement");
	}
	
	@Test // Junit test case for getHistory method
	public void testGetHistory()
	{
		fail("Not yet implement");
	}
}
