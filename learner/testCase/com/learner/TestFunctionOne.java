package com.learner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.learner.FunctionOne;

public class TestFunctionOne {
	
	public FunctionOne fc = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("enter BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("enter AferClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("enter Before");
		fc = new FunctionOne();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("enter After");
	}

	@Test
	public void testOne() {
		System.out.println("enter testOne........");
		assertEquals(fc.funSum(3, 4), 7);
		assertEquals(fc.funSum(3, 5), 8);
		assertEquals(fc.funSum(3, 6), 9);
		assertEquals(fc.funSum(3, 7), 10);
		assertEquals(fc.funSum(3, 8), 11);		
		
	}
	
	@Test
	public void testTwo() {
	}

}
