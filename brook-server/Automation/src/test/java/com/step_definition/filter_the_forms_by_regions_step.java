package com.step_definition;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.baseClass;
import com.object_repository.filter_the_forms_by_using_regions_POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filter_the_forms_by_regions_step extends baseClass {

	@Given("User is on admin login page")
	public void user_is_on_admin_login_page() {
		getDriver("https://staging.brook.mindwave.site/user/login");
	}

	@When("user should login by valid {string}  {string}")
	public void user_should_login_by_valid(String string, String string2) {
		filter_the_forms_by_using_regions_POM u = new filter_the_forms_by_using_regions_POM();
		sendKeys(u.getEmail(), string);
		sendKeys(u.getPassword(), string2);
		Click(u.getLogin_button());
	}

	@When("User should filter the region")
	public void user_should_filter_the_region() throws InterruptedException, IOException {
		filter_the_forms_by_using_regions_POM u = new filter_the_forms_by_using_regions_POM();
		Thread.sleep(4000);
		Click(u.getSelect_locations());
		Thread.sleep(2000);
		Click(u.getDudley_region());
		Thread.sleep(5000);
		screenshotFp("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation.zip\\Brook_Automation\\region.jpeg");
		Click(u.getSelect_locations());
		Thread.sleep(2000);
		Click(u.getTrafford_region());
		Thread.sleep(5000);
		Click(u.getSelect_locations());
		Thread.sleep(2000);
		Click(u.getStockport_region());
		Thread.sleep(5000);
		Click(u.getSelect_locations());
		Thread.sleep(2000);
		Click(u.getTameside_region());
		Thread.sleep(5000);
		Click(u.getSelect_locations());
		Thread.sleep(2000);
		Click(u.getManchester_region());

	}

	@Then("user should verify the forms based on the filters")
	public void user_should_verify_the_forms_based_on_the_filters() throws IOException {
		getScreenshot("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\link.png");
	}

}
