package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class above_25_age_barrier extends baseClass {

	public above_25_age_barrier() {

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

	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement postcode_entry;

	@FindBy(xpath = "//select[@class=\"form-select select-style\"]")
	private WebElement age_dropdown;
	
	@FindBy(xpath ="//div[@class=\"b1-style\"]")
	private WebElement barrier_message;

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

	public WebElement getPostcode_entry() {
		return postcode_entry;
	}

	public WebElement getAge_dropdown() {
		return age_dropdown;
	}

	public WebElement getBarrier_message() {
		return barrier_message;
	}
	
	
}
