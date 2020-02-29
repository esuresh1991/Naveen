package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void LoginTest()
	{

		System.out.println("Login test");
		//int i = 9/0;
		
	}

	@Test(dependsOnMethods="LoginTest")
	public void Homepage()
	{
		System.out.println("Homepage");
		
	}
	
	
	@Test(dependsOnMethods="LoginTest")
	public void Homepage1()
	{
		System.out.println("Homepage1");
		
	}
	
	@Test
	public void Search()
	{
		System.out.println("Search");
		
	}
	
	
}
