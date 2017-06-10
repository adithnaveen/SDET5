package com.fannie.action;

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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.fannie.utility.Driver;

public class ActionTest {
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
		baseURL = "http://tasyah.com";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	

	@Test
	public void test() throws Exception {
		String menuXpath=".//*[@id='menu_category_Menu_VIfWm2LT_332']/a/span/span";
		String subMenuXpath =".//*[@id='menu_category_Menu_VIfWm2LT_332']/div/div/div[1]/div/ul/li[1]/a/span";
	
		// Menu 
		WebElement mainElement = driver.findElement(By.xpath(menuXpath));
		Actions menuAction = new Actions(driver); 
		menuAction.moveToElement(mainElement).perform(); // -> hover 

		
		Thread.sleep(2000);
		
		// Sub Menu
		WebElement subElement = driver.findElement(By.xpath(subMenuXpath));
		// either do this 
//		subElement.click();
		
		// or do this 
		Actions subMenuAction = new Actions(driver);
		subMenuAction.moveToElement(subElement).click().perform();
	}

}













