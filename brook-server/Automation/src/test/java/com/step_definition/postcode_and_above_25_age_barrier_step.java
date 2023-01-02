package com.step_definition;

import static org.junit.Assert.assertEquals;

import com.base_class.baseClass;
import com.object_repository.above_25_age_barrier;
import com.object_repository.postcode_barrier;
import com.object_repository.under_16_1_Object_repository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class postcode_and_above_25_age_barrier_step extends baseClass {

	@Given("user is on the STI form test Kit home page")
	public void user_is_on_the_sti_form_test_kit_home_page() {
		getDriver("https://staging.brook.mindwave.site/hometest");
	}

	@When("user should choose the theme & know the details")
	public void user_should_choose_the_theme_know_the_details() {
		postcode_barrier u = new postcode_barrier();
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

	@When("user should enters the {string}")
	public void user_should_enters_the(String string) {
		postcode_barrier u = new postcode_barrier();
		sendKeys(u.getPostcode_entry(), string);
		Click(u.getNext_button());
	}

	@Then("user should verify postcode barrier for dudely with {string}")
	public void user_should_verify_postcode_barrier_for_dudely_with(String string) {
		postcode_barrier u = new postcode_barrier();
		System.out.println(gettext(u.getBarrier_message()));
		assertEquals(string, gettext(u.getBarrier_message()));
	}

	@Given("user is on the STI form home page")
	public void user_is_on_the_sti_form_home_page() {
		navigateToUrl("https://staging.brook.mindwave.site/hometest");
	}

	@When("user should choose the theme and understand the details")
	public void user_should_choose_the_theme_and_understand_the_details() {
		above_25_age_barrier u = new above_25_age_barrier();
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

	@When("user should enters the {string} & {string}")
	public void user_should_enters_the(String string, String string2) {
		above_25_age_barrier u = new above_25_age_barrier();
		sendKeys(u.getPostcode_entry(), string);
		Click(u.getNext_button());
		dropdownSelectByValue(u.getAge_dropdown(), string2);
		Click(u.getNext_button());
	}

	@Then("user should verify age barrier for manchester with {string}")
	public void user_should_verify_age_barrier_for_manchester_with(String string) {
		above_25_age_barrier u = new above_25_age_barrier();
		System.out.println(gettext(u.getBarrier_message()));
		assertEquals(string, gettext(u.getBarrier_message()));
	}

}
