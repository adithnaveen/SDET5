package com.fannie.screenshot;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.generic.ScreenShot;
import com.fannie.generics.GenericMethods;
import com.fannie.utility.Driver;

public class ScreenShotTest {
	WebDriver driver ; 
	String baseURL;
	GenericMethods genericMethods;
	ScreenShot screenShot;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
	}

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		baseURL = "https://www.expedia.com/";
		
		genericMethods = new GenericMethods(driver);
		screenShot  = new ScreenShot(driver);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
//		screenShot.takeScreenShot("sample2.png");
		screenShot.takeScreenShot();
		driver.quit();
	}
	
	@Test
	public void test() 
		throws Exception{
		
		String flyFrom ="Washington, DC (IAD-Washington Dulles Intl.)";
		String flyTo = "Washington, DC (IAD-Washington Dulles Intl.)";
		
		driver.get(baseURL);
		
		// click flight tab 
		genericMethods.getElement("tab-flight-tab-hp", "id").click();
		
		// enter fly From 
		genericMethods.getElement("flight-origin-hp-flight", "id").sendKeys(flyFrom);
		
		// Enter fly to 
		genericMethods.getElement("flight-destination-hp-flight", "id").sendKeys(flyTo);
		
		// click search 
		genericMethods.getElement
			("//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button", "xpath")
			.click();
		
	}
}













