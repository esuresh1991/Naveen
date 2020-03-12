package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;;

public class HTMLUnitDriver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\Downloads\\chromedriver_win64\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new HtmlUnitDriver();
		 
	driver.get("http://google.co.in");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("suresh", Keys.ENTER );
	System.out.println(driver.getTitle());
driver.quit();
	
	}

}
