package com.step_definition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import com.base_class.baseClass;
import com.object_repository.Under_16_admin_panel_approval_POM;
import com.object_repository.Under_16_admin_panel_reject_POM;
import com.object_repository.under_16_1_Object_repository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class under_16_reject_step extends baseClass {

	@Given("user is on the STI form test Kit page")
	public void user_is_on_the_sti_form_test_kit_page() {
		getDriver("https://staging.brook.mindwave.site/hometest");
	}

	@When("user should choose theme and know the details")
	public void user_should_choose_theme_and_know_the_details() {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		Click(u.getTheme_mode());
		Click(u.getStart_button());
		Click(u.getExpand_details());
		Click(u.getNext_button());
		Click(u.getExpand_details());
		Click(u.getNext_button());
		Click(u.getNext_button());
		Click(u.getKnow_more_button());
		Click(u.getNext_button());
		Click(u.getNext_button());
		Click(u.getNext_button());
		Click(u.getNext_button());
		Click(u.getNext_button());
		Click(u.getNext_button());
	}

	@When("user should enters {string} and {string}")
	public void user_should_enters_and(String string, String string2) {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		sendKeys(u.getPostcode_entry(), string);
		Click(u.getNext_button());
		dropdownSelectByValue(u.getAge_dropdown(), string2);
		Click(u.getNext_button());
	}

	@When("user should verify all the links")
	public void user_should_verify_all_the_links() throws IOException {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		Click(u.getManchester_link());
		Click(u.getDudley_link());
		windowhandlesSS("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\link.png");
		Click(u.getProceed());
	}

	@When("user should enter  {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		sendKeys(u.getFirst_name(), string);
		sendKeys(u.getLast_name(), string2);
		Click(u.getNext_button());
	}

	@When("user should enter {string} , {string}")
	public void user_should_enter_(String string, String string2) {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		sendKeys(u.getMobile_num(), string);
		sendKeys(u.getEmail(), string2);
		Click(u.getNext_button());
	}

	@When("user should verify privacy link")
	public void user_should_verify_privacy_link() throws IOException {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		Click(u.getPrivacy_link());
		windowhandlesSS("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\link2.png");
	}

	@Then("user should submit form")
	public void user_should_submit_form() throws IOException {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		Click(u.getFinish_button());
		screenshotFp("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\link3.png");
		Click(u.getFinish_button());
	}

	@Given("user is on admin panel home page")
	public void user_is_on_admin_panel_home_page() {
		try {
			navigateToUrl("https://staging.brook.mindwave.site/user/login");
		} catch (Exception e) {
			getDriver("https://staging.brook.mindwave.site/user/login");
		}
	}

	@When("user should login with the valid {string} and {string}")
	public void user_should_login_with_the_valid_and(String string, String string2) {
		Under_16_admin_panel_approval_POM v = new Under_16_admin_panel_approval_POM();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin());
	}

	@When("user should verify name as the form submitted with {string}")
	public void user_should_verify_name_as_the_form_submitted_with(String string) {
		Under_16_admin_panel_approval_POM v = new Under_16_admin_panel_approval_POM();
		System.out.println(gettext(v.getGetName()));
		// assertEquals(string,gettext(v.getGetName()));
	}

	@When("user should reject the form")
	public void user_should_reject_the_form() {
		Under_16_admin_panel_reject_POM v = new Under_16_admin_panel_reject_POM();
		Click(v.getReject_button());
		Click(v.getClient_contacted());
		Click(v.getReject_depression());
		Click(v.getReject_older_partner());
		Click(v.getReject_protection_sex());
		sendKeys(v.getAdditional_details(), "test");
		Click(v.getReject_kit_button());
		Click(v.getLilie_confirmation());
		Click(v.getReject_finish_button());
	}

	@Then("user should verify that it is navigated to rejected page and Lilie page  with {string}")
	public void user_should_verify_that_it_is_navigated_to_rejected_page_and_lilie_page_with(String string) {
		Under_16_admin_panel_reject_POM v = new Under_16_admin_panel_reject_POM();
		Click(v.getRejected_tab());
		System.out.println(gettext(v.getName_rejected()));
		assertEquals(string, gettext(v.getName_rejected()));
		Click(v.getLilie_tab());
		System.out.println(gettext(v.getName_lilie()));
		assertEquals(string, gettext(v.getName_lilie()));
	}
}
