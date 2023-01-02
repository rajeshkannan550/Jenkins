package com.step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.base_class.baseClass;
import com.object_repository.new_account_approval_POM;
import com.object_repository.signup_page_POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class new_user_signup_and_approve_step extends baseClass {

	@Given("user is on the Admin panel sign up page")
	public void user_is_on_the_admin_panel_sign_up_page() {
		getDriver("https://staging.brook.mindwave.site/user/login");
		signup_page_POM u = new signup_page_POM();
		Click(u.getSignup_page());
	}

	@When("user should enter valid {string} & {string} for signup")
	public void user_should_enter_valid_for_signup(String string, String string2) {
		signup_page_POM u = new signup_page_POM();
		sendKeys(u.getName(), string);
		sendKeys(u.getEmail(), string2);
	}

	@When("user should create a password {string} and {string}")
	public void user_should_create_a_password_and(String string, String string2) throws InterruptedException {
		signup_page_POM u = new signup_page_POM();
		sendKeys(u.getPassword(), string);
		Thread.sleep(2000);
		sendKeys(u.getConfirm_password(), string2);
		//Thread.sleep(2000);
		
	}

	@When("user should select the {string} , {string} and {string}")
	public void user_should_select_the_and(String string, String string2, String string3) throws AWTException {
		signup_page_POM u = new signup_page_POM();
		Click(u.getNext_button());
		sendKeys(u.getRegion_select(), string);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		sendKeys(u.getRole_at_Brook(), string2);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		sendKeys(u.getPronouns(), string3);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("user should submit the Request account")
	public void user_should_submit_the_request_account() {
		signup_page_POM u = new signup_page_POM();
		Click(u.getRequest_account_button());
	}

	@Given("user is on admin panel login page")
	public void user_is_on_admin_panel_login_page() {
		navigateToUrl("https://staging.brook.mindwave.site/user/login");
	}

	@When("user should login with valid {string} & {string}")
	public void user_should_login_with_valid(String string, String string2) {
		new_account_approval_POM v = new new_account_approval_POM();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin());
	}

	@When("user should navigate to the notification page")
	public void user_should_navigate_to_the_notification_page() {
		new_account_approval_POM v = new new_account_approval_POM();
		Click(v.getNotification_page());
	}

	@Then("user should approve the request for new user")
	public void user_should_approve_the_request_for_new_user() {
		new_account_approval_POM v = new new_account_approval_POM();
		Click(v.getApprove_button());
	}

}
