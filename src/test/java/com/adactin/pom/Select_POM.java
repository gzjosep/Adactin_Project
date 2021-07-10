package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_POM {

	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_1")
	private WebElement radioButton;
	
	@FindBy(id = "continue")
	private WebElement next;

	
	public Select_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getNext() {
		return next;
	}
	
	
	
	
	
	
	
}
