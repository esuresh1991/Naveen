package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\C drive\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
	driver.get("https://www.spicejet.com/");
	
	Thread.sleep(3000);
	Actions a = new Actions(driver);
	Thread.sleep(3000);
	a.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();;
	Thread.sleep(5000);
	driver.findElement(By.xpath("//li[@class='li-login float-right tabres']//ul//li//a[contains(text(),'Travel Agent Login')]")).click();
	

	}

}
