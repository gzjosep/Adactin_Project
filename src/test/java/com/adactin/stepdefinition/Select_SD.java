package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_class1;
import com.adactin.pom.Select_POM;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Select_SD extends Base_class1 {
	
	public static WebDriver driver = Runner.driver;
	Select_POM se = new Select_POM(driver);
	
	@When("^User select the name of the hotel$")
	public void user_select_the_name_of_the_hotel() throws Throwable {
	    clickOnElement(se.getRadioButton());
	}

	@Then("^user click and validate the continue button$")
	public void user_click_and_validate_the_continue_button() throws Throwable {
	    clickOnElement(se.getNext());
	}

}
