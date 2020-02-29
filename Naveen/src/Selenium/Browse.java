package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\C drive\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
	driver.get("http://demo.guru99.com/test/upload/");
	driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\u50518\\Downloads\\test file.txt");
	driver.findElement(By.xpath("//input[@id='terms']")).click();
	driver.findElement(By.id("submitbutton")).click();
	
	
	
	}

}
