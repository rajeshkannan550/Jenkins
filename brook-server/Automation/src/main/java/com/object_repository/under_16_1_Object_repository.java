package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base_class.baseClass;


public class under_16_1_Object_repository extends baseClass {

	public under_16_1_Object_repository() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Dark']")
	private WebElement theme_mode;
	
	@FindBy(xpath="//button[text()='Start']")
	private WebElement start_button;
	
	@FindBy(xpath="//img[@alt='Add']")
	private WebElement expand_details;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement next_button;

	@FindBy(xpath="//button[text()=\"Yes, I'd like to know more\"]")
	private WebElement know_more_button;
	
	@FindBy(xpath="//input[@type=\"email\"]")
	private WebElement postcode_entry;
	
	@FindBy(xpath="//select[@class=\"form-select select-style\"]")
	private WebElement age_dropdown;
	
	@FindBy(xpath="//a[@href=\"https://www.brook.org.uk/service/brook-manchester\"]")
	private WebElement manchester_link;
	
	@FindBy(xpath="//a[@href=\"https://www.brook.org.uk/regions/brook-dudley\"]")
	private WebElement dudley_link;
	
	@FindBy(xpath="//a[@href=\"https://www.brook.org.uk/find-a-service\"]")
	private WebElement find_service_link;
	
	@FindBy(xpath="//button[text()=\"Proceed\"]")
	private WebElement proceed;
	
	@FindBy(xpath="//input[@placeholder='Enter your first name']")
    private WebElement first_name;
	
	@FindBy(xpath="//input[@placeholder='Enter your last name']")
	private WebElement last_name;
	
	@FindBy(xpath="//input[@placeholder='Enter your Mobile Number']")
	private WebElement mobile_num;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email Address']")
	private WebElement email;
	
	@FindBy(xpath="//a[text()='http://www.brook.org.uk/privacy-and-confidentiality']")
	private WebElement privacy_link;
	
	@FindBy(xpath="//button[text()='Finish']")
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

	public WebElement getManchester_link() {
		return manchester_link;
	}

	public WebElement getDudley_link() {
		return dudley_link;
	}

	public WebElement getFind_service_link() {
		return find_service_link;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getMobile_num() {
		return mobile_num;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPrivacy_link() {
		return privacy_link;
	}

	public WebElement getFinish_button() {
		return finish_button;
	}
	
	
}
