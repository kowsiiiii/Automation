package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {

	public WebDriver driver; // --> null

	@FindBy(id = "username")

	private WebElement email;

	@FindBy(name = "password")

	private WebElement password;

	@FindBy(id = "login")

	private WebElement logIn;

	public LogIn_Page(WebDriver abc) {

		this.driver = abc;

		PageFactory.initElements(driver, this);

	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}

}
