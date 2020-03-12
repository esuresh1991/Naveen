package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.css.RGBColor;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\Downloads\\chromedriver_win64\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
	driver.get("http://google.co.in");
	
	
	WebElement loginBtn = driver.findElement(By.xpath("//input[@name='q']")); //login button
	flash(loginBtn, driver); //highlight the element
	
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("suresh", Keys.ENTER );
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	//js.executeScript("alert('Welcome to Guru99');");
	js.executeScript("window.scrollBy(100,900)");
	System.out.println(driver.getTitle());
//driver.quit();
	}

	public static void flash(WebElement element, WebDriver driver) {
		//JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
         
        	changeColor( "rgb(0,200,0)" , element,driver);//1
            changeColor(bgcolor, element,driver);//2
	
}

	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);
        js.executeScript("arguments[0].style.backgroundColor = 'Red'",  element);
        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }
}