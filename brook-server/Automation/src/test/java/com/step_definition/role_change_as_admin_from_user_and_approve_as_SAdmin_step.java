package com.step_definition;

import java.io.IOException;

import com.base_class.baseClass;
import com.object_repository.role_change_accept_admin;
import com.object_repository.role_change_to_admin_from_user_POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class role_change_as_admin_from_user_and_approve_as_SAdmin_step extends baseClass {

	@Given("User is on the Admin login page")
	public void user_is_on_the_admin_login_page() {
		getDriver("https://staging.brook.mindwave.site/user/login");
	}

	@When("user is login with {string} , {string} as user")
	public void user_is_login_with_as_user(String string, String string2) {
		role_change_to_admin_from_user_POM u = new role_change_to_admin_from_user_POM();
		sendKeys(u.getEmail(), string);
		sendKeys(u.getPassword(), string2);
		Click(u.getLogin_button());
	}

	@When("user is navigated to settings page")
	public void user_is_navigated_to_settings_page() {
		role_change_to_admin_from_user_POM u = new role_change_to_admin_from_user_POM();
		Click(u.getSettings_page());
		Click(u.getRequest_change_button());

	}

	@When("user is requested role change with {string} and {string}")
	public void user_is_requested_role_change_with_and(String string, String string2) {
		role_change_to_admin_from_user_POM u = new role_change_to_admin_from_user_POM();
		dropdownSelectByVisibleText(u.getAdmin_dropdown(), string);
		sendKeys(u.getNotes(), string2);
	}

	@Then("user is submitted the request")
	public void user_is_submitted_the_request() {
		role_change_to_admin_from_user_POM u = new role_change_to_admin_from_user_POM();
		Click(u.getRequest_change_accept());
		Click(u.getDone_button());
	}

	@Given("User is on Admin panel login page")
	public void user_is_on_admin_panel_login_page() {
		try {
			navigateToUrl("https://staging.brook.mindwave.site/user/login");
		} catch (Exception e) {
			getDriver("https://staging.brook.mindwave.site/user/login");
		}
	}

	@When("user is login with {string} , {string} as super admin")
	public void role_change_accept_admin(String string, String string2) {
		role_change_accept_admin u = new role_change_accept_admin();
		sendKeys(u.getEmail(), string);
		sendKeys(u.getPassword(), string2);
		Click(u.getLogin());
	}

	@When("user is navigated to the notification page")
	public void user_is_navigated_to_the_notification_page() {
		role_change_accept_admin u = new role_change_accept_admin();
		Click(u.getNotification_page());
		Click(u.getView_all_notification());
	}

	@When("user is accepted the request")
	public void user_is_accepted_the_request() {
		role_change_accept_admin u = new role_change_accept_admin();
		Click(u.getApprove_button());

	}

	@Then("user is re verify the accepted role {string} , {string}")
	public void user_is_re_verify_the_accepted_role(String string, String string2) throws IOException {
		role_change_accept_admin u = new role_change_accept_admin();
		Click(u.getLogout_button());
		Click(u.getLogout_confirmation());
		role_change_to_admin_from_user_POM v = new role_change_to_admin_from_user_POM();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
		Click(v.getSettings_page());
		screenshotFp("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\role.png");
	}

}
