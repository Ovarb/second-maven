package ovarb.secondmaven;

import org.junit.Test;

import junit.framework.Assert;

public class CalcTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalcAdd() {
		Calculator c = new Calculator();
		int result = 6;
		Assert.assertEquals(result, c.calcadd(2, 3));
	}
	

}
