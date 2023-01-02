package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;


public class signup_page_POM extends baseClass {

	public signup_page_POM() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Sign up']")
	private WebElement signup_page;

	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "confirmpassword")
	private WebElement confirm_password;

	@FindBy(xpath = "//button[text()=\"Next\"]")
	private WebElement next_button;

	@FindBy(xpath = "//div[@id=\"react-select-5-placeholder\"]")
	private WebElement region_select;

	@FindBy(xpath = "//div[@id=\"react-select-6-placeholder\"]")
	private WebElement role_at_Brook;

	@FindBy(xpath = "//div[@id=\"react-select-4-placeholder\"]")
	private WebElement pronouns;

	@FindBy(xpath = "//button[text()=\"Request account\"]")
	private WebElement request_account_button;

	@FindBy(xpath = "//p[@class=\"login-style2 mt-3\"]")
	private WebElement confirmation_message;

	public WebElement getSignup_page() {
		return signup_page;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirm_password() {
		return confirm_password;
	}

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getRegion_select() {
		return region_select;
	}

	public WebElement getRole_at_Brook() {
		return role_at_Brook;
	}

	public WebElement getPronouns() {
		return pronouns;
	}

	public WebElement getRequest_account_button() {
		return request_account_button;
	}

	public WebElement getConfirmation_message() {
		return confirmation_message;
	}

}
