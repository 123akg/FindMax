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
		Assert.assertEquals(new Integer(6), max.findMaximumInteger(new Integer[] {4,3,6}));		
	}	
	@Test
	public void givenMaxNumber_At2ndPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(7), max.findMaximumInteger(new Integer[] {7,2,4}));		
	}
	@Test
	public void givenMaxNumber_At3rdPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(9), max.findMaximumInteger(new Integer[] {3,9,5}));		
	}
	
	
	@Test
	public void givenMaxFloat_At1stPosition_ReturnFloat() {
		Assert.assertEquals(new Float(2.99f), max.findMaximumFloat(new Float[] {2.8f,2.9f,2.99f}));		
	}	
	@Test
	public void givenMaxFloat_At2ndPosition_ReturnFloat() {
		Assert.assertEquals(new Float(6.8f), max.findMaximumFloat(new Float[] {6.79f,6.78f,6.8f}));		
	}
	@Test
	public void givenMaxFloat_At3Position_ReturnFloat() {
		Assert.assertEquals(new Float(7.92f), max.findMaximumFloat(new Float[] {7.9f,7.92f,7.91f}));		
	}

}
