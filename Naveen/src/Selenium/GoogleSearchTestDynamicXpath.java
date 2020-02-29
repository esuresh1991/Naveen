package Selenium;

import java.awt.List;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTestDynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\C drive\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		//ImplicitWait - Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	driver.get("http://www.google.co.in");
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
	//List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::[@class='sbl1']"));
	
	} 

}
