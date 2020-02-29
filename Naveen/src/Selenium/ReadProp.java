package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties P = new Properties();
		FileInputStream F = new FileInputStream("D:\\auto\\Naveen\\src\\Selenium\\My.properties");
		P.load(F);
		System.out.println(P.getProperty("url"));
		
		
	}
	

}
