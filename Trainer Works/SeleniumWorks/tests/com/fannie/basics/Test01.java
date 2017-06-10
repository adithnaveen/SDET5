package com.fannie.basics;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utility.Driver;

// to test based on linktext, partial text 
// send send keys 
public class Test01 {
	WebDriver driver ; 
	String baseURL;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		baseURL = "https://demostore.x-cart.com/";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	

	@Test
	public void test() {
		
		// xpath is generated by browser 
		//*[@id=\'header-area\']/div[1]/div/div[4]/div/ul/li[4]/a/span
		// or go by linktext 
		driver.findElement(By.linkText("Shipping")).click();
		
		driver.findElement(By.partialLinkText("Contact")).click();
		
		driver.findElement(By.id("name")).sendKeys("Testing");
	}

}
