package com.step_definition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import com.base_class.baseClass;
import com.object_repository.Age_18_admin_panel_POM;
import com.object_repository.Age_18_object_repository;
import com.object_repository.under_16_1_Object_repository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class age_18_category_step extends baseClass {

	@Given("user is on the STI Order test Kit home page")
	public void user_is_on_the_sti_order_test_kit_home_page() {
		getDriver("https://staging.brook.mindwave.site/hometest");
	}

	@When("user should choose the theme , know the details")
	public void user_should_choose_the_theme_know_the_details() {
		Age_18_object_repository u = new Age_18_object_repository();
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

	@When("user should enters the {string} , {string}")
	public void user_should_enters_the(String string, String string2) {
		Age_18_object_repository u = new Age_18_object_repository();
		sendKeys(u.getPostcode_entry(), string);
		Click(u.getNext_button());
		dropdownSelectByValue(u.getAge_dropdown(), string2);
		Click(u.getNext_button());
		Click(u.getSymptoms_dont_know());
		Click(u.getNext_button());
	}

	@When("user should verify elegible or not with {string}")
	public void user_should_verify_elegible_or_not_with(String string) {
		Age_18_object_repository u = new Age_18_object_repository();
		System.out.println(gettext(u.getElegible_text()));
		Click(u.getNext_button());
	}

	@When("user should enter the type of sex and genitals")
	public void user_should_enter_the_type_of_sex_and_genitals() {
		Age_18_object_repository u = new Age_18_object_repository();
		Click(u.getType_vaginal());
		Click(u.getGiven());
		Click(u.getNext_button());
		Click(u.getGentials_penis());
		Click(u.getNext_button());
		Click(u.getNext_button());
		Click(u.getNext_button());
	}

	@When("user should enter the {string} , {string}")
	public void user_should_enter_the(String string, String string2) {
		Age_18_object_repository u = new Age_18_object_repository();
		sendKeys(u.getFirst_name(), string);
		sendKeys(u.getLast_name(), string2);
		Click(u.getNext_button());
	}

	@When("user should enter the DOB {string},{string} and {string}")
	public void user_should_enter_the_dob_and(String string, String string2, String string3)
			throws InterruptedException {
		Age_18_object_repository u = new Age_18_object_repository();
		dropdownSelectByValue(u.getDOB_date(), string);
		Thread.sleep(2000);
		dropdownSelectByVisibleText(u.getDOB_month(), string2);
		Thread.sleep(2000);
		dropdownSelectByValue(u.getDOB_year(), string3);
		Thread.sleep(2000);
		Click(u.getNext_button());
	}

	@When("user should enter the {string} and {string}")
	public void user_should_enter_the_and(String string, String string2) throws InterruptedException {
		Age_18_object_repository u = new Age_18_object_repository();
		sendKeys(u.getMobile_num(), string);
		sendKeys(u.getEmail(), string2);
		Thread.sleep(2000);
		Click(u.getNext_button());
		Thread.sleep(2000);
		Click(u.getNext_button());
	}

	@When("user should enter the {string} , {string} and {string}")
	public void user_should_enter_the_and(String string, String string2, String string3) {
		Age_18_object_repository u = new Age_18_object_repository();
		sendKeys(u.getAddress_line1(), string);
		sendKeys(u.getAddress_line2(), string2);
		sendKeys(u.getTown(), string3);
		Click(u.getNext_button());
		Click(u.getConfirm_button());
		Click(u.getConsent_confirmation());
		Click(u.getNext_button());
		Click(u.getNext_button());
	}

	@When("user should choose the ethnicity")
	public void user_should_choose_the_ethnicity() {
		Age_18_object_repository u = new Age_18_object_repository();
		Click(u.getEthnicity_asian());
		Click(u.getAsian_indian());
		Click(u.getNext_button());
	}

	@When("user should choose their gender")
	public void user_should_choose_their_gender() {
		Age_18_object_repository u = new Age_18_object_repository();
		Click(u.getGender_man());
		Click(u.getNext_button());
	}

	@Then("user should submit the form")
	public void user_should_submit_the_form() {
		Age_18_object_repository u = new Age_18_object_repository();
		Click(u.getFinish_button());
		Click(u.getFinish_button());
	}

	@Given("user is on the admin home page")
	public void user_is_on_the_admin_home_page() {
		try {
			navigateToUrl("https://staging.brook.mindwave.site/user/login");
		} catch (Exception e) {
			getDriver("https://staging.brook.mindwave.site/user/login");
		}
	}

	@When("user should login with valid {string} , {string}")
	public void user_should_login_with_valid(String string, String string2) {
		Age_18_admin_panel_POM v = new Age_18_admin_panel_POM();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin());
	}

	@When("user should verify the name as the form submitted with {string} and it should be on Auto approved tab")
	public void user_should_verify_the_name_as_the_form_submitted_with_and_it_should_be_on_auto_approved_tab(
			String string) throws IOException {
		Age_18_admin_panel_POM v = new Age_18_admin_panel_POM();
		Click(v.getApprove_tab());
		System.out.println(gettext(v.getName_approved()));
		screenshotFp("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\Approved_18_abovdss.png");
		assertEquals(string, gettext(v.getName_approved()));
		driver.close();
	}
}
