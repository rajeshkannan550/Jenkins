package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class to_create_a_new_role_and_remove_that extends baseClass {

	public to_create_a_new_role_and_remove_that() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login_button;

	@FindBy(xpath = "//img[@alt=\"Settings\"]")
	private WebElement settings_page;

	@FindBy(xpath = "//a[text()=\"Overview\"]")
	private WebElement over_view;

	@FindBy(xpath = "//button[text()=\"Create new role\"]")
	private WebElement create_new_role_button;

	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement role_name;

	@FindBy(xpath = "//button[text()=\"Create role\"]")
	private WebElement role_submit;

	@FindBy(xpath="(//a[text()=\"Staff manager\"])[2]//ancestor::td//following-sibling::td//button[text()=\"Remove\"]")
	private WebElement remove_the_role;

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

	public WebElement getOver_view() {
		return over_view;
	}

	public WebElement getCreate_new_role_button() {
		return create_new_role_button;
	}

	public WebElement getRole_name() {
		return role_name;
	}

	public WebElement getRole_submit() {
		return role_submit;
	}

	public WebElement getRemove_the_role() {
		return remove_the_role;
	}
	
}
