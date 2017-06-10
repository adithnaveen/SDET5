package com.fannie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightPagePOMFactory {
	private WebDriver driver; 
	
	public FlightPagePOMFactory(WebDriver driver){
		this.driver = driver;
		// this -> to class 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightsTab;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement flyFrom;

	@FindBy(id="flight-destination-hp-flight")
	WebElement flyTo;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate; 
	
	@FindBy(xpath="//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button")
	WebElement searchBtn;
	
	@FindBy(id="flight-adults-hp-flight")
	WebElement noOfAdults; 
	
	
	public void clickFlightTab(){
		flightsTab.click();
	}
	
	public void sendFlyFrom(String flyFrom){
		this.flyFrom.clear();
		this.flyFrom.sendKeys(flyFrom);
	}
	
	public void sendFlyTo(String flyTo){
		this.flyTo.clear();
		this.flyTo.sendKeys(flyTo);
	}
	
	
	public void sendFlyFromDate(String flyFromDate){
		departDate.click();
		departDate.clear();
		departDate.sendKeys(flyFromDate);
	}
	
	public void sendFlyReturnDate(String flyReturnDate){
		returnDate.click();
		returnDate.clear();
		returnDate.sendKeys(flyReturnDate);
	}
	
	public void selectNoOfAdults(String noOfAdults){
		Select select = new Select(this.noOfAdults);
		select.selectByValue(noOfAdults);
	}
	
	public void clickSearch(){
		searchBtn.click();
	}
	
	
	
	
}
