package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\C drive\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("ANGOLA");
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s1.selectByVisibleText("INDIA");

	}

}
