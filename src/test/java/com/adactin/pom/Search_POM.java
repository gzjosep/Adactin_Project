package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_POM {
	
	public static WebDriver driver;
	
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "Submit")
	private WebElement search;

	
	public Search_POM(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	

}
