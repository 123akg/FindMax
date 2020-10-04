package com.findMax;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
 
public class MaxTest {
	
	Max max;

	@Before
	public void initialize() {
		max = new Max();
	}

	@Test
	public void givenMaxNumber_At1stPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(4), max.findMaximumInteger(new Integer[] {3,4,1}));
		
	}	
	@Test
	public void givenMaxNumber_At2ndPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(5), max.findMaximumInteger(new Integer[] {5,2,4}));
		
	}
	@Test
	public void givenMaxNumber_At3rdPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(9), max.findMaximumInteger(new Integer[] {6,2,9}));
		
	}


}
