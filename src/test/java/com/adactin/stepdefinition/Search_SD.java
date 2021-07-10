package com.adactin.stepdefinition;



import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_class1;
import com.adactin.pom.Search_POM;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Search_SD extends Base_class1 {
	
   public static WebDriver driver = Runner.driver;
   Search_POM s = new Search_POM(driver);

	@When("^User select the location of hotel available$")
	public void user_select_the_location_of_hotel_available() throws Throwable {
	    dropDown(s.getLocation(), "byValue", "Paris");
	   
	   
	}

	@Then("^User click search button to validate$")
	public void user_click_search_button_to_validate() throws Throwable {
	    clickOnElement(s.getSearch());
	}


	
}
