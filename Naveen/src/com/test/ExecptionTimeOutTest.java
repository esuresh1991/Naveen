package com.test;

import org.testng.annotations.Test;

public class ExecptionTimeOutTest {
	
	@Test(invocationTimeOut=2)
	public void InfinteLoop()
	{

		int i = 1;
		while(i==1){
			System.out.println(i);
		}
		
		
	}


	@Test(expectedExceptions=NumberFormatException.class)
	public void ExpectionHandle()
	{

	String x= "1000A";
	Integer.parseInt(x);
		
		
	}

	
}
