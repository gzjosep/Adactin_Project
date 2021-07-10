package com.adactin.runner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_class1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", 
		                    glue = "com\\adactin\\stepdefinition",
                            monochrome = true)               // to avoid special characters)    



public class Runner {

	public static WebDriver driver;
	
	@BeforeClass 
	 public static void setUp() { 
		
		driver = Base_class1.getDriver("chrome"); 
		
		

	} 
	
	@AfterClass
	 public static void tearDown() { 
		
		

 	}

}
