package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class archive_and_unarchive extends baseClass {
	
	public archive_and_unarchive() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login_button;
	
	@FindBy(xpath = "//img[@alt=\"Settings\"]")
	private WebElement settings_page;
	
	@FindBy(xpath="//a[text()=\"Your account\"]")
	private WebElement your_account_page;
	
	@FindBy(xpath="//a[text()=\"Archive account\"]")
	private WebElement archive_account_page;
	
	@FindBy(xpath="//button[text()=\"Archive account\"]")
	private WebElement archive_account_button;
	
	@FindBy(xpath = "//img[@alt=\"Logout\"]")
	private WebElement logout_button;

	@FindBy(xpath = "//button[text()=\"Yes\"]")
	private WebElement logout_confirmation;
	
	@FindBy(xpath = "//span[@class=\"badge badge-primary badge-class\"]")
	private WebElement notification_page;

	@FindBy(xpath = "//a[text()=\"View all\"]")
	private WebElement view_all_notification;

	@FindBy(xpath = "(//button[text()=\"Approve\"])[1]")
	private WebElement approve_button;
	
	@FindBy(xpath="//a[text()=\"Admin\"]")
	private WebElement admin_page;
	
	@FindBy(xpath="//a[text()=\"Aaaaa\"]")
	private WebElement user_profile;
	
	@FindBy(xpath="//button[@class=\"approve-kit-btn reject custo-class\"]")
	private WebElement unarchive_button;
	
	@FindBy(xpath="//button[text()=\"Yes\"]")
	private WebElement unarchive_confirmation_button;
	
	@FindBy(xpath="//div[text()=\"Close\"]")
    private WebElement closs_popup;

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

	public WebElement getYour_account_page() {
		return your_account_page;
	}

	public WebElement getArchive_account_page() {
		return archive_account_page;
	}

	public WebElement getArchive_account_button() {
		return archive_account_button;
	}

	public WebElement getLogout_button() {
		return logout_button;
	}

	public WebElement getLogout_confirmation() {
		return logout_confirmation;
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

	public WebElement getAdmin_page() {
		return admin_page;
	}

	public WebElement getUser_profile() {
		return user_profile;
	}

	public WebElement getUnarchive_button() {
		return unarchive_button;
	}

	public WebElement getUnarchive_confirmation_button() {
		return unarchive_confirmation_button;
	}

	public WebElement getCloss_popup() {
		return closs_popup;
	}
	
	
	//(//span[@class="errorMessage"])[1]

}
