package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_POM {

	public static WebDriver driver;
	
	@FindBy(name = "first_name")
	private WebElement firstname;
	
	@FindBy(name = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement ccnumber;
	
	@FindBy(name = "cc_type")
	private WebElement cctype;
	
	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(name = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(name = "book_now")
	private WebElement booknow;

	
	public Book_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
}
