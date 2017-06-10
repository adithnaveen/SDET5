package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"features/com/fannie"}, 
		glue={"com.fannie.step"},
		plugin={"pretty", "html:target/cucumber-html-report"}, 
		// output on console 
		monochrome=true
)

public class TestRunner  extends AbstractTestNGCucumberTests{

}
