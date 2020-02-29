package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\C drive\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");	
		
	}
	
	@Test(priority=1,groups="first Group")
	public void GoogleTitleTest()
	{

		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	
	@Test(priority=2,groups="first Group")
	public void GoogleImage()
	{

		boolean a =  driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(a);		
	}
	
	@Test(priority=3,groups="Second Group")
	public void Googleprint()
	{

		System.out.println("Print google");		
	}
	
	
	@AfterMethod
	public void Close()
	{

		driver.quit();
		
	}
	
}
