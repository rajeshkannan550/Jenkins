package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class filter_the_forms_by_using_regions_POM extends baseClass {

	public filter_the_forms_by_using_regions_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login_button;

	@FindBy(xpath = "//div[@class=\"card card-w-h\"]")
	private WebElement select_locations;

	@FindBy(xpath = "(//span[@class=\"slider round\"])[1]")
	private WebElement Dudley_region;

	@FindBy(xpath = "(//span[@class=\"slider round\"])[2]")
	private WebElement Trafford_region;

	@FindBy(xpath = "(//span[@class=\"slider round\"])[3]")
	private WebElement stockport_region;
	
	@FindBy(xpath="(//span[@class=\"slider round\"])[4]")
    private WebElement Tameside_region;
	
	@FindBy(xpath="(//span[@class=\"slider round\"])[5]")
    private WebElement Manchester_region;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getSelect_locations() {
		return select_locations;
	}

	public WebElement getDudley_region() {
		return Dudley_region;
	}

	public WebElement getTrafford_region() {
		return Trafford_region;
	}

	public WebElement getStockport_region() {
		return stockport_region;
	}

	public WebElement getTameside_region() {
		return Tameside_region;
	}

	public WebElement getManchester_region() {
		return Manchester_region;
	}
	
	
}
