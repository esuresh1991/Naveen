package Selenium;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\C drive\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.google.co.in");
		System.out.println(driver.getTitle());
		
	//	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("policy");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("policy");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ESCAPE);
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		
		//div[@class='FPdoLc tfB0Bf']//input[@class='gNO89b']
		
		if(driver.getTitle().equals("Google")) {
			System.out.println("Pass");
		
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	//	WebDriver driver1=new FirefoxDriver();
	//	driver1.get("http://www.google.co.in");
		
		
	}

}
