package com.object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class Under_16_admin_panel_approval_POM extends baseClass {

	public Under_16_admin_panel_approval_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath="(//td[@data-label=\"Name\"])[1]")
	private WebElement getName;
	
	@FindBy(xpath="(//button[text()=\"Approve\"])[1]")
	private WebElement approve_button;
	
	@FindBy(xpath="(//span[@class=\"checkmark\"])")
	private WebElement client_contacted;
	
	@FindBy(id="address_1")
	private WebElement address1;
	
	@FindBy(id="address_2")
	private WebElement address2;
	
	@FindBy(id="town")
	private WebElement town;
	
    @FindBy(xpath="(//div[@class=\"select-form__value-container select-form__value-container--has-value css-1d8n9bt\"])[1]")
    private WebElement ethnicity_dropdown;
    
    @FindBy(xpath="//div[@class=\"select-form__single-value css-qc6sy-singleValue\"]")
    private List<WebElement> ethnicity_options;
  
    @FindBy(xpath="(//input[@id=\"vehicle1\"])[1]")
    private WebElement ethnicity_region;
    
    @FindBy(xpath="(//div[@class=\"select-form__value-container select-form__value-container--has-value css-1d8n9bt\"])[2]")
    private WebElement gender_dropdown;
    
	@FindBy(xpath="(//textarea[@class=\"form-control h-textbox w-txt area-color\"])")
	private WebElement additional_details;
	
	@FindBy(xpath="(//button[text()=\"Approve test kit\"])")
	private WebElement approve_kit_button;
	
	@FindBy(xpath="//input[@id=\"confirmation\"]")
	private WebElement lilie_confirmation;
	
	@FindBy(xpath="//button[@type=\"button\"]")
	private WebElement approve_finish_button;
	
	@FindBy(xpath="(//a[text()=\"Approved\"])")
	private WebElement approve_tab;
	
	@FindBy(xpath="(//td[@data-label=\"Name\"])[1]")
	private WebElement name_approved;
	
	@FindBy(xpath="(//a[text()=\"Added to Lilie\"])")
	private WebElement lilie_tab;
	
	@FindBy(xpath="(//td[@data-label=\"Name\"])[1]")
	private WebElement name_lilie;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getGetName() {
		return getName;
	}

	public WebElement getApprove_button() {
		return approve_button;
	}

	public WebElement getClient_contacted() {
		return client_contacted;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getTown() {
		return town;
	}

	public WebElement getEthnicity_dropdown() {
		return ethnicity_dropdown;
	}
	

	public List<WebElement> getEthnicity_options() {
		return ethnicity_options;
	}

	public WebElement getEthnicity_region() {
		return ethnicity_region;
	}

	public WebElement getGender_dropdown() {
		return gender_dropdown;
	}

	public WebElement getAdditional_details() {
		return additional_details;
	}

	public WebElement getApprove_kit_button() {
		return approve_kit_button;
	}

	public WebElement getApprove_confirmation() {
		return lilie_confirmation;
	}

	public WebElement getApprove_finish_button() {
		return approve_finish_button;
	}

	public WebElement getApprove_tab() {
		return approve_tab;
	}

	public WebElement getName_approved() {
		return name_approved;
	}

	public WebElement getLilie_tab() {
		return lilie_tab;
	}

	public WebElement getName_lilie() {
		return name_lilie;
	}
	
	

}
