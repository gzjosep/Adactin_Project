package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_class1;
import com.adactin.pom.Book_POM;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Book_SD extends Base_class1 {
	public static WebDriver driver = Runner.driver;
	Book_POM bp = new Book_POM(driver);

	
	@When("^User enters First name$")
	public void user_enters_First_name() throws Throwable {
	   inputOfElement(bp.getFirstname(), "Joseph");
	}

	@When("^User enters Last name$")
	public void user_enters_Last_name() throws Throwable {
	   inputOfElement(bp.getLastname(), "G");
	}

	@When("^User enters Address$")
	public void user_enters_Address() throws Throwable {
	    inputOfElement(bp.getAddress(), "Ashok nagar, Chennai");
	}

	@When("^user enters Credit Card Number$")
	public void user_enters_Credit_Card_Number() throws Throwable {
	   inputOfElement(bp.getCcnumber(), "1234567887654321");
	}

	@When("^user enters Credit Card Type$")
	public void user_enters_Credit_Card_Type() throws Throwable {
	   dropDown(bp.getCctype(), "byValue", "VISA");
	}

	@When("^User enters Expiry Month And Year$")
	public void user_enters_Expiry_Month_And_Year() throws Throwable {
	    dropDown(bp.getExpmonth(), "byValue", "2");
	    dropDown(bp.getExpyear(), "byValue", "2022");
	}

	@When("^User enters CVV number$")
	public void user_enters_CVV_number() throws Throwable {
	   inputOfElement(bp.getCvv(), "123");
	}

	@Then("^User clicks Book Now button to validate For Confirm booking$")
	public void user_clicks_Book_Now_button_to_validate_For_Confirm_booking() throws Throwable {
	   clickOnElement(bp.getBooknow());
	}
	
	
}
