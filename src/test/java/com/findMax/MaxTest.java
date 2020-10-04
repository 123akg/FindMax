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

//INTEGER TEST	@Test
	public void givenMaxNumber_At1stPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(4), max.findMaximumInteger(new Integer[] {4,2,1}));		
	}	
	@Test
	public void givenMaxNumber_At2ndPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(7), max.findMaximumInteger(new Integer[] {3,4,7}));		
	}
	@Test
	public void givenMaxNumber_At3rdPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(5), max.findMaximumInteger(new Integer[] {3,4,5}));		
	}
	
//FLOAT TEST	
	@Test
	public void givenMaxFloat_At1stPosition_ReturnFloat() {
		Assert.assertEquals(new Float(2.9f), max.findMaximumFloat(new Float[] {2.9f,2f,1.8f}));		
	}	
	@Test
	public void givenMaxFloat_At2ndPosition_ReturnFloat() {
		Assert.assertEquals(new Float(3.7f), max.findMaximumFloat(new Float[] {3.7f,2.5f,1f}));		
	}
	@Test
	public void givenMaxFloat_At3Position_ReturnFloat() {
		Assert.assertEquals(new Float(5.2f), max.findMaximumFloat(new Float[] {3f,4.7f,5.2f}));		
	}

//STRING TEST
	@Test
	public void givenMaxString_At1stPosition_ReturnString() {
		Assert.assertEquals(new String("Cherries"), max.findMaximumString(new String[] {"Cherries","Banana","Apple"}));		
	}	
	@Test
	public void givenMaxString_At2ndPosition_ReturnString() {
		Assert.assertEquals(new String("Grapefruit"), max.findMaximumString(new String[] {"Cherries","Grapefruit","Apple"}));		
	}
	@Test
	public void givenMaxString_At3rdPosition_ReturnString() {
		Assert.assertEquals(new String("Kiwi"), max.findMaximumString(new String[] {"Cherries","Banana","Kiwi"}));		
	}
}
