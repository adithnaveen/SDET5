package com.fannie.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
	public static void main(String[] args) {
		// Load The Driver 
		
		WebDriver driver ;
		
		// if this does not work 
//		System.setProperty("webdriver.gecko.driver",
		
		
//		System.setProperty("webdriver.firefox.marionette", 
//				"C:\\Software\\SDET5-SeleniumSoftware\\driver\\geckodriver-v0.16.1-win64\\geckodriver.exe");

		
		// if it is internet explorer 
		// webdriver.ie.driver
		System.setProperty
			("webdriver.chrome.driver", 
					"C:\\Software\\SDET5-SeleniumSoftware\\driver\\chromedriver.exe");
		
		
		// driver= new FirefoxDriver();
		driver = new ChromeDriver();
		
		// Open the browser for the driver
		String baseUrl = "http://google.com";
		driver.get(baseUrl);
		// do the task 
		System.out.println("Title  -> " + driver.getTitle());
		
		// Alt + Shift + Z
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// close the browser 
		driver.quit();
	
	}
}
