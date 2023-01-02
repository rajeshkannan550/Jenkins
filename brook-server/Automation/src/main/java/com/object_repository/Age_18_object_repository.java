package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class Age_18_object_repository extends baseClass {

	public Age_18_object_repository() {

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
	
	@FindBy(xpath="//button[text()='No']")
	private WebElement symptoms_no;
	
	@FindBy(xpath="//button[text()=\"Don't know\"]")
	private WebElement symptoms_dont_know;
	
	@FindBy(xpath="//div[@class=\"b1-style\"]")
	private WebElement elegible_text;
	
	@FindBy(xpath="//input[@value=\"Vaginal\"]")
    private WebElement type_vaginal;
	
	@FindBy(xpath="//button[text()=\"given\"]")
	private WebElement given;
	
	@FindBy(xpath="//input[@value=\"Penis\"]")
	private WebElement gentials_penis;
	
	@FindBy(xpath="//input[@placeholder='Enter your first name']")
    private WebElement first_name;
	
	@FindBy(xpath="//input[@placeholder='Enter your last name']")
	private WebElement last_name;
	
	@FindBy(xpath="//select[@class=\"form-select select-style\"]")
	private WebElement DOB_date;
	
	@FindBy(xpath="(//select[@class=\"form-select select-style ml-2\"])[1]")
	private WebElement DOB_month;
	
	@FindBy(xpath="(//select[@class=\"form-select select-style ml-2\"])[2]")
	private WebElement DOB_year;
	
	@FindBy(xpath="//input[@placeholder='Enter your Mobile Number']")
	private WebElement mobile_num;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email Address']")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your address line 1\"]")
	private WebElement address_line1;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your address line 2\"]")
	private WebElement address_line2;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your town/city\"]")
	private WebElement town;
	
	@FindBy(xpath="//button[text()=\"Confirm\"]")
    private WebElement confirm_button;
	
	@FindBy(xpath="//input[@id=\"vehicle1\"]")
	private WebElement consent_confirmation;
	
	@FindBy(xpath="(//input[@id=\"vehicle1\"])[1]")
	private WebElement ethnicity_asian;
	
	@FindBy(xpath="(//input[@id=\"vehicle1\"])[2]")
	private WebElement asian_indian;
	
	@FindBy(xpath="//button[text()=\"Man or boy\"]")
    private WebElement gender_man;
	
	@FindBy(xpath="//button[text()=\"Finish\"]")
	private WebElement finish_button;

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

	public WebElement getSymptoms_no() {
		return symptoms_no;
	}

	public WebElement getSymptoms_dont_know() {
		return symptoms_dont_know;
	}

	public WebElement getElegible_text() {
		return elegible_text;
	}

	public WebElement getType_vaginal() {
		return type_vaginal;
	}

	public WebElement getGiven() {
		return given;
	}

	public WebElement getGentials_penis() {
		return gentials_penis;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getDOB_date() {
		return DOB_date;
	}

	public WebElement getDOB_month() {
		return DOB_month;
	}

	public WebElement getDOB_year() {
		return DOB_year;
	}

	public WebElement getMobile_num() {
		return mobile_num;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress_line1() {
		return address_line1;
	}

	public WebElement getAddress_line2() {
		return address_line2;
	}

	public WebElement getTown() {
		return town;
	}

	public WebElement getConfirm_button() {
		return confirm_button;
	}

	public WebElement getConsent_confirmation() {
		return consent_confirmation;
	}

	public WebElement getEthnicity_asian() {
		return ethnicity_asian;
	}

	public WebElement getAsian_indian() {
		return asian_indian;
	}

	public WebElement getGender_man() {
		return gender_man;
	}

	public WebElement getFinish_button() {
		return finish_button;
	}
	
	
}
