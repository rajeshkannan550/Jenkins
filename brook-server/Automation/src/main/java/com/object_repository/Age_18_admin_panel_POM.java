package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class Age_18_admin_panel_POM extends baseClass {
	
	public Age_18_admin_panel_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement login;
	
	@FindBy(xpath="(//a[text()=\"Approved\"])")
	private WebElement approve_tab;
	
	@FindBy(xpath="(//td[@data-label=\"Name\"])[1]")
	private WebElement name_approved;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getApprove_tab() {
		return approve_tab;
	}

	public WebElement getName_approved() {
		return name_approved;
	}
	
	

}
