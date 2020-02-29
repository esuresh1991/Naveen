package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	
	@BeforeSuite
	public void SetUp()
	{
		System.out.println("setup system property for chrom");
	}
	
	@BeforeTest
	public void lauchBrowser()
	{
		System.out.println("lauchBrowser");
	}
	
	@BeforeClass
	public void enterURL()
	{
		System.out.println("enterURL");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	

	@Test
	public void test1()
	{
		System.out.println("tested  1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("tested  2");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("loglot");
	}

	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("CloseBrowser");
	}
	
	
	@AfterTest
	public void Delete()
	{
		System.out.println("delete all cookies");
	}
	

	@AfterSuite
	public void Result()
	{
		System.out.println("Result");
	}
	
	
	
}
