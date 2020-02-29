package com.test;

import org.testng.annotations.Test;

public class InvacationCountTest {

	@Test(invocationCount=10)
	public void LoginTest()
	{

		System.out.println("Login test");
		
	}
	
}
