package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaveTable {

	public static void main(String[] args) {
		
		
		WebDriver wd;
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\Downloads\\chromedriver_win64\\chromedriver.exe");
		
    	wd = new ChromeDriver();
    	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	wd.get("https://www.google.co.in/");
    	wd.findElement(By.name("q")).sendKeys("tamil");;
    	//To locate table.
    	WebElement mytable = wd.findElement(By.xpath("//ul[@class='erkvQe']"));
    	//To locate rows of table. 
    //	List<WebElement> rows_table =new ArrayList<WebElement>();  
    //	rows_table = mytable.findElements(By.tagName("li"));
    	List < WebElement > rows_table = mytable.findElements(By.tagName("li"));
    	//To calculate no of rows In table.
    	int rows_count = rows_table.size();
    	System.out.println(rows_count);
    	
    	 for (WebElement element: rows_table) {
			 
	            System.out.println(element.getText());
    	 }

    	 rows_table.get(2).click();
    	
	}

}
