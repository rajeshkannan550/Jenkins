package com.object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class Under_16_admin_panel_reject_POM extends baseClass {

	public Under_16_admin_panel_reject_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login;

	@FindBy(xpath = "(//td[@data-label=\"Name\"])[1]")
	private WebElement getName;

	@FindBy(xpath = "//button[text()=\"Reject\"]")
	private WebElement reject_button;

	@FindBy(xpath = "(//span[@class=\"checkmark\"])[1]")
	private WebElement client_contacted;
	
	@FindBy(xpath="(//span[@class=\"checkmark\"])[2]")
	private WebElement reject_users_age;
	
	@FindBy(xpath="(//span[@class=\"checkmark\"])[3]")
	private WebElement reject_protection_sex;
	
	@FindBy(xpath="(//span[@class=\"checkmark\"])[4]")
	private WebElement reject_depression;
	
	@FindBy(xpath="(//span[@class=\"checkmark\"])[5]")
	private WebElement reject_older_partner;
	
	@FindBy(xpath="(//span[@class=\"checkmark\"])[6]")
	private WebElement reject_drugs_alcohol;
	
	@FindBy(xpath="(//span[@class=\"checkmark\"])[7]")
	private WebElement reject_uncomfortable;
	
	@FindBy(xpath="(//textarea[@class=\"form-control h-textbox w-txt area-color\"])")
	private WebElement additional_details;
	
	@FindBy(xpath="//button[text()=\"Reject test kit\"]")
	private WebElement reject_kit_button;
	
	@FindBy(xpath="//span[@class=\"checkmark\"]")
	private WebElement lilie_confirmation;
	
	@FindBy(xpath="(//button[text()=\"Finish\"])")
	private WebElement reject_finish_button;

	@FindBy(xpath="//div[text()=\"Close\"]")
	private WebElement reject_close_button;
	
	@FindBy(xpath="//a[text()=\"Rejected\"]")
	private WebElement rejected_tab;
	
	@FindBy(xpath="(//td[@data-label=\"Name\"])[1]")
	private WebElement name_rejected;
	
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

	public WebElement getReject_button() {
		return reject_button;
	}

	public WebElement getClient_contacted() {
		return client_contacted;
	}

	public WebElement getReject_users_age() {
		return reject_users_age;
	}

	public WebElement getReject_protection_sex() {
		return reject_protection_sex;
	}

	public WebElement getReject_depression() {
		return reject_depression;
	}

	public WebElement getReject_older_partner() {
		return reject_older_partner;
	}

	public WebElement getReject_drugs_alcohol() {
		return reject_drugs_alcohol;
	}

	public WebElement getReject_uncomfortable() {
		return reject_uncomfortable;
	}

	public WebElement getAdditional_details() {
		return additional_details;
	}

	public WebElement getReject_kit_button() {
		return reject_kit_button;
	}

	public WebElement getLilie_confirmation() {
		return lilie_confirmation;
	}

	public WebElement getReject_finish_button() {
		return reject_finish_button;
	}

	public WebElement getReject_close_button() {
		return reject_close_button;
	}

	public WebElement getRejected_tab() {
		return rejected_tab;
	}

	public WebElement getName_rejected() {
		return name_rejected;
	}

	public WebElement getLilie_tab() {
		return lilie_tab;
	}

	public WebElement getName_lilie() {
		return name_lilie;
	}
	
}
