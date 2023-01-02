package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class To_verify_all_the_postcodes_POM extends baseClass {

	public To_verify_all_the_postcodes_POM() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[text()='Dark']")
	private WebElement theme_mode;

	@FindBy(xpath = "//button[text()='Start']")
	private WebElement start_button;

	@FindBy(xpath = "//img[@alt='Add']")
	private WebElement expand_details;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement next_button;

	@FindBy(xpath = "//button[text()=\"Yes, I'd like to know more\"]")
	private WebElement know_more_button;

	@FindBy(xpath = "//select[@class=\"form-select select-style\"]")
	private WebElement age_dropdown;

	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement enter_postcode;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement post_code_next;

	@FindBy(xpath = "//button[@class=\"float-left no-background-border\"]")
	private WebElement back_btn;

	@FindBy(xpath = "//div[contains(@class,\"b1-style\")]")
	private WebElement getText;

	public WebElement getTheme_mode() {
		return theme_mode;
	}

	public WebElement getStart_button() {
		return start_button;
	}

	public WebElement getExpand_details() {
		return expand_details;
	}

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getKnow_more_button() {
		return know_more_button;
	}

	public WebElement getAge_dropdown() {
		return age_dropdown;
	}

	public WebElement getEnter_postcode() {
		return enter_postcode;
	}

	public WebElement getPost_code_next() {
		return post_code_next;
	}

	public WebElement getBack_btn() {
		return back_btn;
	}

	public WebElement getGetText() {
		return getText;
	}

}
