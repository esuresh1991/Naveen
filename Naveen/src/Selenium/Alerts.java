package Selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\Downloads\\chromedriver_win64\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	

	Thread.sleep(4000);
	
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	
	if	(a.getText().equals("Please enter a valid user name"))
	{
		System.out.println("Pass");
		
	}
	else {
		System.out.println("Fail");
	}
	
	a.accept();

	//a.dismiss();
	driver.findElement(By.id("login1")).sendKeys("abc");


	}
	
	

	
	}


