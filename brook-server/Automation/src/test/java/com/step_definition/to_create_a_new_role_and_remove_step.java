package com.step_definition;

import com.base_class.baseClass;
import com.object_repository.to_create_a_new_role_and_remove_that;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class to_create_a_new_role_and_remove_step extends baseClass {

	@Given("User1 is on Admin home page")
	public void user1_is_on_admin_home_page() {
		getDriver("https://staging.brook.mindwave.site/user/login");
	}

	@When("user1 is login with {string} & {string}")
	public void user1_is_login_with(String string, String string2) {
		to_create_a_new_role_and_remove_that v = new to_create_a_new_role_and_remove_that();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
	}

	@When("user1 is navigated to over view page in settings page")
	public void user1_is_navigated_to_over_view_page_in_settings_page() throws InterruptedException {
		to_create_a_new_role_and_remove_that v = new to_create_a_new_role_and_remove_that();
		Thread.sleep(2000);
		Click(v.getSettings_page());
		Click(v.getOver_view());
	}

	@When("user1 is create a {string}")
	public void user1_is_create_a(String string) throws InterruptedException {
		to_create_a_new_role_and_remove_that v = new to_create_a_new_role_and_remove_that();
		Click(v.getCreate_new_role_button());
	    sendKeys(v.getRole_name(), string);	
	    Thread.sleep(2000);
	    Click(v.getRole_submit());
	}

	@When("user1 should remove the role")
	public void user1_should_remove_the_role() {
		to_create_a_new_role_and_remove_that v = new to_create_a_new_role_and_remove_that();
		Click(v.getRemove_the_role());
	}
}
