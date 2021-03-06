package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// we have clickable elements make it void 
public class FlightPagePOM {
	private static WebElement element;
	
	public static void clickFlightTab(WebDriver driver){
		 driver.findElement(By.id("tab-flight-tab-hp")).click();
	}
	
	public static void sendFlyFromTextBox(String flyFrom, WebDriver driver){
		// this will come from property file / xml / db 
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.clear();
		element.sendKeys(flyFrom);
		
	}

	public static void sendFlyToTextBox(String flyTo, WebDriver driver){
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		element.clear();
		element.sendKeys(flyTo);
	}

	public static void sendDepartDate(String departDate, WebDriver driver){
		element = driver.findElement(By.id("flight-departing-hp-flight")); 
		element.click();
		element.clear();
		element.sendKeys(departDate);
		
	}
	public static void sendReturnDate(String returnDate, WebDriver driver){
		element = driver.findElement(By.id("flight-returning-hp-flight")); 
		element.click();
		element.clear();
		element.sendKeys(returnDate);
	}
	
	public static void clickSearchButton(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button"));
		element.click();
	}
	
	
}
