package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_class1;
import com.adactin.pom.Login_pom;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Login_sd extends Base_class1 {
	public static WebDriver driver = Runner.driver;
	Login_pom lp = new Login_pom(driver);
	
	
	@Given("^User launch url of adactin application$")
	public void user_launch_url_of_adactin_application() throws Throwable {
		
		getUrl("https://adactinhotelapp.com/");
		
	}	    

	@When("^User enters \"([^\"]*)\" username$")
	public void user_enters_username(String arg1) throws Throwable {
	    inputOfElement(lp.getUsername(), arg1);
		
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    inputOfElement(lp.getPassword(), arg1);
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		
		clickOnElement(lp.getLogin());
	    
	}

	@Then("^User validate the login button$")
	public void user_validate_the_login_button() throws Throwable {
	   
	}

}
