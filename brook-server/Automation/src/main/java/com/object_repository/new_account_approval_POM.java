package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class new_account_approval_POM extends baseClass {

	public new_account_approval_POM() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login;

	@FindBy(xpath = "//span[@class=\"badge badge-primary badge-class\"]")
	private WebElement notification_page;

	@FindBy(xpath = "//a[text()=\"View all\"]")
	private WebElement view_all_notification;

	@FindBy(xpath = "(//button[text()=\"Approve\"])[1]")
	private WebElement approve_button;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getNotification_page() {
		return notification_page;
	}

	public WebElement getView_all_notification() {
		return view_all_notification;
	}

	public WebElement getApprove_button() {
		return approve_button;
	}

}
