package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\C drive\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
	driver.get("https://www.toolsqa.com/iframe-practice-page/");
	Thread.sleep(10000);
	//driver.switchTo().frame(0);
	driver.switchTo().frame("iframe1");
	//driver.findElement(By.className("skip-link screen-reader-text")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Skip')]")).click();
	
	
	}

}
