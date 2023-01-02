package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class to_change_the_password_profile_POM extends baseClass {

	public to_change_the_password_profile_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login_button;

	@FindBy(xpath = "role_change_to_admin_from_user_POM")
	private WebElement settings_page;

	@FindBy(xpath = "//a[text()='Your account']")
	private WebElement your_account_page;

	@FindBy(xpath = "//a[text()='Password']")
	private WebElement password_page;

	@FindBy(xpath = "//button[text()='Change password']")
	private WebElement change_password_button;

	@FindBy(xpath = "//input[@id=\"old_password\"]")
	private WebElement old_password_page;

	@FindBy(xpath = "//input[@id=\"create_password\"]")
	private WebElement create_password;

	@FindBy(xpath = "//input[@id=\"new_password\"]")
	private WebElement re_enter_password;

	@FindBy(xpath = "//button[text()=\"Save\"]")
	private WebElement save_button;

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

	public WebElement getSettings_page() {
		return settings_page;
	}

	public WebElement getYour_account_page() {
		return your_account_page;
	}

	public WebElement getPassword_page() {
		return password_page;
	}

	public WebElement getChange_password_button() {
		return change_password_button;
	}

	public WebElement getOld_password_page() {
		return old_password_page;
	}

	public WebElement getCreate_password() {
		return create_password;
	}

	public WebElement getRe_enter_password() {
		return re_enter_password;
	}

	public WebElement getSave_button() {
		return save_button;
	}

	public WebElement getLogout_button() {
		return logout_button;
	}

	public WebElement getLogout_confirmation() {
		return logout_confirmation;
	}

}
