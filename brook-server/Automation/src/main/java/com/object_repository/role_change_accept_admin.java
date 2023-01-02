package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class role_change_accept_admin extends baseClass {

	public role_change_accept_admin() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login;

	@FindBy(xpath = "//span[@class=\"badge badge-primary badge-class\"]")
	private WebElement notification_page;

	@FindBy(xpath = "//a[text()=\"View all\"]")
	private WebElement view_all_notification;

	@FindBy(xpath = "(//button[text()=\"Approve\"])[1]")
	private WebElement approve_button;

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

	public WebElement getLogout_button() {
		return logout_button;
	}

	public WebElement getLogout_confirmation() {
		return logout_confirmation;
	}

}
