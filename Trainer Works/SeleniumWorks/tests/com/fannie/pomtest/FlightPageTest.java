package com.fannie.pomtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.pom.FlightPagePOM;
import com.fannie.pom.FlightPagePOMFactory;
import com.fannie.utility.DriverFactory;
import com.fannie.utility.DriverNames;

public class FlightPageTest {

	WebDriver driver; 
	String baseUrl; 
	FlightPagePOMFactory flightFactory; 

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.PHANTOM);
		baseUrl = "https://www.expedia.com/";
		flightFactory = new FlightPagePOMFactory(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Ignore
	@Test
	public void test() {
		driver.get(baseUrl);
		FlightPagePOM.clickFlightTab(driver);
		FlightPagePOM.sendFlyFromTextBox("Washington, DC (IAD-Washington Dulles Intl.)", 
					driver);
		FlightPagePOM.sendFlyToTextBox("San Francisco, California", driver);
		FlightPagePOM.sendDepartDate("06/14/2017", driver);
		FlightPagePOM.sendReturnDate("06/16/2017", driver);
		FlightPagePOM.clickSearchButton(driver);
		
	}

	
	@Test
	public void pomFactoryTest(){
		driver.get(baseUrl);
//		flightFactory.clickFlightTab();
//		flightFactory.sendFlyFrom("Washington, DC (IAD-Washington Dulles Intl.)");
//		flightFactory.sendFlyTo("San Francisco, California");
//		flightFactory.sendFlyFromDate("06/14/2017");
//		flightFactory.sendFlyReturnDate("06/16/2017");
//		flightFactory.selectNoOfAdults("3");
//		// 	flightFactory.clickSearch();
//		
	}
	
	
	
	
}
