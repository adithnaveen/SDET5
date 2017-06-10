package com.naveen.phantomtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.pom.FlightPagePOMFactory;
import com.fannie.utility.DriverFactory;
import com.fannie.utility.DriverNames;

public class PhantomTest {


	WebDriver driver; 
	String baseUrl; 
	FlightPagePOMFactory flightFactory; 

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.PHANTOM);
		baseUrl = "https://www.expedia.com/";
		flightFactory = new FlightPagePOMFactory(driver);
	}


	@Test
	public void test() {
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
	}

}
