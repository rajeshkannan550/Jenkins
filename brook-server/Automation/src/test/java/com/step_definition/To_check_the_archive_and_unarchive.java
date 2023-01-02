package com.step_definition;

import com.base_class.baseClass;
import com.mongodb.gridfs.CLI;
import com.object_repository.archive_and_unarchive;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class To_check_the_archive_and_unarchive extends baseClass {
	
	@Given("user3 is on the admin panel home page")
	public void user3_is_on_the_admin_panel_home_page() {
	    getDriver("https://staging.brook.mindwave.site/user/login");
	}

	@When("user3 is login with {string} and {string}")
	public void user3_is_login_with_and(String string, String string2) {
		archive_and_unarchive v = new archive_and_unarchive();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
	}

	@When("user3 should navigate to Your account page in settings")
	public void user3_should_navigate_to_your_account_page_in_settings() {
		archive_and_unarchive v = new archive_and_unarchive();
		Click(v.getSettings_page());
		//Click(v.getYour_account_page());
		Click(v.getArchive_account_page());
		Click(v.getArchive_account_button());
	}

	@When("user3 should give archive account request")
	public void user3_should_give_archive_account_request() {
		archive_and_unarchive v = new archive_and_unarchive();
		Click(v.getArchive_account_page());
		Click(v.getArchive_account_button());
		Click(v.getLogout_button());
		Click(v.getLogout_confirmation());
	}

	@When("should log in as a super admin with {string} and {string}")
	public void should_log_in_as_a_super_admin_with_and(String string, String string2) {
		archive_and_unarchive v = new archive_and_unarchive();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
		
	}

	@When("Super admin should approve the archive account received")
	public void super_admin_should_approve_the_archive_account_received() throws InterruptedException {
		archive_and_unarchive v = new archive_and_unarchive();
		Click(v.getNotification_page());
		Thread.sleep(3000);
		Click(v.getView_all_notification());
		Click(v.getApprove_button());
		Thread.sleep(3000);
		Click(v.getLogout_button());
		Click(v.getLogout_confirmation());
	}

	@Then("Verify the archive account by loggin in with {string} and {string}")
	public void verify_the_archive_account_by_loggin_in_with_and(String string, String string2) {
		archive_and_unarchive v = new archive_and_unarchive();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
	}

	@When("super admin account should be logged in with {string} and {string}")
	public void super_admin_account_should_be_logged_in_with_and(String string, String string2) {
		archive_and_unarchive v = new archive_and_unarchive();
		navigateRefresh();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
	}

	@When("super admin should unarchive the account")
	public void super_admin_should_unarchive_the_account() throws InterruptedException {
		archive_and_unarchive v = new archive_and_unarchive();
		Thread.sleep(2000);
		Click(v.getAdmin_page());
		Thread.sleep(2000);
		Click(v.getUser_profile());
		Click(v.getUnarchive_button());
		Click(v.getUnarchive_confirmation_button());
		Click(v.getCloss_popup());
		Click(v.getLogout_button());
		Click(v.getLogout_confirmation());
	}

	@Then("Verify the unarchive account by logging in with {string} and {string}")
	public void verify_the_unarchive_account_by_logging_in_with_and(String string, String string2) {
		archive_and_unarchive v = new archive_and_unarchive();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
	}

}
