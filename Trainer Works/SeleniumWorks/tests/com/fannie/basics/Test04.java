package com.fannie.basics;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utility.Driver;

public class Test04 {
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
		baseURL = "http://naveenks.com/selenium/RegForm.html";
		driver.get(baseURL);
	}



	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	

	// select radio button 
	@Test
	public void test()  throws Exception{
		WebElement male = driver.findElement(By.id("genderMale"));
		male.click();
		
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.id("genderFemale"));
		female.click();
		
		Thread.sleep(2000);
		
		WebElement trans = driver.findElement(By.id("genderTrans"));
		trans.click();
		
		
		System.out.println("Selected Male -> " + male.isSelected());
		System.out.println("Selected Female -> " + female.isSelected());
		System.out.println("Selected Trans Gender -> " + trans.isSelected());
		
		
		
		
	}

}
