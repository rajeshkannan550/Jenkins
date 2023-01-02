package com.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.baseClass;

public class Report_and_feedback_POM extends baseClass {

	public Report_and_feedback_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login;

	@FindBy(xpath = "//a[@href=\"/staffhub/feedback\"]")
	private WebElement feed_back_page;

	@FindBy(xpath = "//textarea[@class=\"form-control admin-textarea-style\"]")
	private WebElement type_feedback;

	@FindBy(xpath = "//button[text()=\"Submit feedback\"]")
	private WebElement feedback_submit;
	
	@FindBy(xpath="//p[@class=\"f-size fw-bold\"]")
	private WebElement feedback_submit_thankyou;
	
	@FindBy(xpath="//div[@class=\"popup-text\"]")
	private WebElement feedback_success_message;

	@FindBy(xpath = "//button[text()=\"Close\"]")
	private WebElement feedback_close;

	@FindBy(xpath = "//a[text()=\"Report a problem\"]")
	private WebElement report_problem_button;

	@FindBy(xpath = "//textarea[@class=\"form-control admin-textarea-style\"]")
	private WebElement type_report_problem;

	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement contact_number;

	@FindBy(xpath = "//button[text()=\"Report problem\"]")
	private WebElement report_problem_submit;
	
	@FindBy(xpath="//p[@class=\"f-size fw-bold\"]")
	private WebElement problem_submit_thankyou;
	
	@FindBy(xpath="//div[@class=\"popup-text\"]")
	private WebElement problem_reported_message;

	@FindBy(xpath = "//button[text()=\"Close\"]")
	private WebElement report_close;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getFeed_back_page() {
		return feed_back_page;
	}

	public WebElement getType_feedback() {
		return type_feedback;
	}

	public WebElement getFeedback_submit() {
		return feedback_submit;
	}
	

	public WebElement getFeedback_submit_thankyou() {
		return feedback_submit_thankyou;
	}


	public WebElement getFeedback_success_message() {
		return feedback_success_message;
	}


	public WebElement getFeedback_close() {
		return feedback_close;
	}

	public WebElement getReport_problem_button() {
		return report_problem_button;
	}

	public WebElement getType_report_problem() {
		return type_report_problem;
	}

	public WebElement getContact_number() {
		return contact_number;
	}

	public WebElement getReport_problem_submit() {
		return report_problem_submit;
	}
	

	public WebElement getProblem_submit_thankyou() {
		return problem_submit_thankyou;
	}

	public WebElement getProblem_reported_message() {
		return problem_reported_message;
	}

	public WebElement getReport_close() {
		return report_close;
	}

}
