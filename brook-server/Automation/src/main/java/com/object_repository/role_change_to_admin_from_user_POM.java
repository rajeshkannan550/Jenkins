package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class role_change_to_admin_from_user_POM extends baseClass {

	public role_change_to_admin_from_user_POM() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login_button;

	@FindBy(xpath = "//img[@alt=\"Settings\"]")
	private WebElement settings_page;

	@FindBy(xpath = "(//button[text()=\"Request change\"])[1]")
	private WebElement request_change_button;

	@FindBy(xpath = "//select[@id=\"request\"]")
	private WebElement admin_dropdown;

	@FindBy(xpath = "//input[@id=\"notes\"]")
	private WebElement notes;

	@FindBy(xpath = "(//button[text()=\"Request change\"])[2]")
	private WebElement request_change_accept;

	@FindBy(xpath = "(//button[text()=\"Done\"])")
	private WebElement done_button;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getSettings_page() {
		return settings_page;
	}

	public WebElement getRequest_change_button() {
		return request_change_button;
	}

	public WebElement getAdmin_dropdown() {
		return admin_dropdown;
	}

	public WebElement getNotes() {
		return notes;
	}

	public WebElement getRequest_change_accept() {
		return request_change_accept;
	}

	public WebElement getDone_button() {
		return done_button;
	}

}
