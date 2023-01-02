package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class login_POM extends baseClass {

	public login_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login_button;

	@FindBy(xpath = "//img[@alt=\"Logout\"]")
	private WebElement logout_button;

	@FindBy(xpath = "//button[text()=\"Yes\"]")
	private WebElement logout_confirmation;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getLogout_button() {
		return logout_button;
	}

	public WebElement getLogout_confirmation() {
		return logout_confirmation;
	}

}
