package com.step_definition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.baseClass;
import com.object_repository.Report_and_feedback_POM;
import com.object_repository.postcode_barrier;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class report_and_feedback_step extends baseClass {

	@Given("User is on the Admin panel login page")
	public void user_is_on_the_admin_panel_login_page() {
		getDriver("https://staging.brook.mindwave.site/user/login");
	}


	@When("user should login with {string} & {string}")
	public void user_should_login_with(String string, String string2) {
		Report_and_feedback_POM u = new Report_and_feedback_POM();
		sendKeys(u.getEmail(), string);
		sendKeys(u.getPassword(), string2);
		Click(u.getLogin());
	}

	@When("user should be navigated to feedback page")
	public void user_should_be_navigated_to_feedback_page() {
		Report_and_feedback_POM u = new Report_and_feedback_POM();
		Click(u.getFeed_back_page());
	}

	@When("user should enter the {string}")
	public void user_should_enter_the(String string) {
		Report_and_feedback_POM u = new Report_and_feedback_POM();
		sendKeys(u.getType_feedback(), string);
	}

	@Then("user should submit the feedback")
	public void user_should_submit_the_feedback() throws InterruptedException {
		Report_and_feedback_POM u = new Report_and_feedback_POM();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000)");
		Thread.sleep(2000);
		Click(u.getFeedback_submit());
		System.out.println(gettext(u.getFeedback_submit_thankyou()));
		System.out.println(gettext(u.getFeedback_success_message()));
		Click(u.getFeedback_close());
	}

	@When("user should navigate to the report problem page")
	public void user_should_navigate_to_the_report_problem_page() {
		Report_and_feedback_POM u = new Report_and_feedback_POM();
		Click(u.getReport_problem_button());
	}

	@When("user should enter the {string} & {string}")
	public void user_should_enter_the(String string, String string2) {
		Report_and_feedback_POM u = new Report_and_feedback_POM();
		sendKeys(u.getType_report_problem(), string);
		sendKeys(u.getContact_number(), string2);
	}

	@Then("user should submit the report")
	public void user_should_submit_the_report() throws InterruptedException {
		Report_and_feedback_POM u = new Report_and_feedback_POM();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000)");
		Thread.sleep(2000);
		Click(u.getReport_problem_submit());
		System.out.println(gettext(u.getProblem_submit_thankyou()));
		System.out.println(gettext(u.getProblem_reported_message()));
		Click(u.getReport_close());
		driver.close();
	}

}
