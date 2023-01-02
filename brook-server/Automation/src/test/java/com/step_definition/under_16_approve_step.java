package com.step_definition;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.baseClass;
import com.object_repository.Under_16_admin_panel_approval_POM;
import com.object_repository.under_16_1_Object_repository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class under_16_approve_step extends baseClass {

	@Given("user is on the STI Order test Kit page")
	public void user_is_on_the_sti_order_test_kit_page() {
		getDriver("https://staging.brook.mindwave.site/hometest");
	}

	@When("user should choose the theme and know the details")
	public void user_should_choose_the_theme_and_know_the_details() {
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

	@When("user should enters the {string} and {string}")
	public void user_should_enters_the_and(String string, String string2) {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		sendKeys(u.getPostcode_entry(), string);
		Click(u.getNext_button());
		dropdownSelectByValue(u.getAge_dropdown(), string2);
		Click(u.getNext_button());
	}

	@When("user should verify the all the links")
	public void user_should_verify_the_all_the_links() throws IOException {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		Click(u.getManchester_link());
		Click(u.getDudley_link());
		windowhandlesSS("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\link.png");
		Click(u.getProceed());
	}

	@When("user should enter  {string} , {string}")
	public void user_should_enter(String string, String string2) {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		sendKeys(u.getFirst_name(), string);
		sendKeys(u.getLast_name(), string2);
		Click(u.getNext_button());
	}

	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		sendKeys(u.getMobile_num(), string);
		sendKeys(u.getEmail(), string2);
		Click(u.getNext_button());
	}

	@When("user should verify the privacy link")
	public void user_should_verify_the_privacy_link() throws IOException {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		Click(u.getPrivacy_link());
		windowhandlesSS("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\link2.png");
	}

	@Then("user submitted the form")
	public void user_submitted_the_form() throws IOException {
		under_16_1_Object_repository u = new under_16_1_Object_repository();
		Click(u.getFinish_button());
		screenshotFp("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\link3.png");
		Click(u.getFinish_button());
	}

	@When("user is on the admin panel home page")
	public void user_is_on_the_admin_panel_home_page() {
		try {
			navigateToUrl("https://staging.brook.mindwave.site/user/login");
		} catch (Exception e) {
			getDriver("https://staging.brook.mindwave.site/user/login");
		}
	}

	@When("user should login with valid {string} and {string}")
	public void user_should_login_with_valid_and(String string, String string2) {
		Under_16_admin_panel_approval_POM v = new Under_16_admin_panel_approval_POM();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin());
	}

	@When("user should verify the name as the form submitted with {string}")
	public void user_should_verify_the_name_as_the_form_submitted_with(String string) {
		Under_16_admin_panel_approval_POM v = new Under_16_admin_panel_approval_POM();
		System.out.println(gettext(v.getGetName()));
		assertEquals(string, gettext(v.getGetName()));
	}

	@When("user should approve the form")
	public void user_should_approve_the_form() {
		Under_16_admin_panel_approval_POM v = new Under_16_admin_panel_approval_POM();
		Click(v.getApprove_button());
	}

	@When("user should enter the {string} , {string} , {string}, {string}")
	public void user_should_enter_the(String string, String string2, String string3, String string4)
			throws AWTException {
		Under_16_admin_panel_approval_POM v = new Under_16_admin_panel_approval_POM();
		Click(v.getClient_contacted());
		sendKeys(v.getAddress1(), string);
		sendKeys(v.getAddress2(), string2);
		sendKeys(v.getTown(), string3);
		Click(v.getEthnicity_dropdown());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		/*
		 * List<WebElement> ethnicity_dropdown = v.getEthnicity_options(); for(int i =
		 * 0; i<=ethnicity_dropdown.size()-1; i++) {
		 * if(ethnicity_dropdown.get(i).getText().contains("Asia")) {
		 * ethnicity_dropdown.get(i).click(); break; }
		 */
		Click((v.getEthnicity_region()));
		Click(v.getGender_dropdown());
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		sendKeys(v.getAdditional_details(), string4);
		Click(v.getApprove_kit_button());
		// WebDriverWait w = new WebDriverWait(driver, 20); //
		// w.until(ExpectedConditions.elementToBeClickable(v.getApprove_confirmation()));
		actionMoveElement(v.getApprove_confirmation());
		Click(v.getApprove_confirmation()); //
		// w.until(ExpectedConditions.elementToBeClickable(v.getApprove_finish_button()));
		Click(v.getApprove_finish_button());
	}

	@Then("user should verify that it is navigated to approved page and Lilie page  with {string}")
	public void user_should_verify_that_it_is_navigated_to_approved_page_and_lilie_page_with(String string) {
		Under_16_admin_panel_approval_POM v = new Under_16_admin_panel_approval_POM();
		Click(v.getApprove_tab());
		System.out.println(gettext(v.getName_approved()));
		assertEquals(string, gettext(v.getGetName()));
		Click(v.getLilie_tab());
		System.out.println(gettext(v.getName_lilie()));
		assertEquals(string, gettext(v.getGetName()));
	}

}
