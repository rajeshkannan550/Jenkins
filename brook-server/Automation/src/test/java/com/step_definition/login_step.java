package com.step_definition;

import java.io.IOException;

import com.base_class.baseClass;
import com.mongodb.gridfs.CLI;
import com.object_repository.login_POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_step extends baseClass {

	@Given("user is on the admin login page")
	public void user_is_on_the_admin_login_page() {
		getDriver("https://staging.brook.mindwave.site/user/login");
	}

	@When("user should login with valid {string}  {string}")
	public void user_should_login_with_valid(String string, String string2) throws InterruptedException, IOException {
		login_POM v = new login_POM();
		sendKeys(v.getEmail(), string);
		sendKeys(v.getPassword(), string2);
		Click(v.getLogin_button());
		Thread.sleep(4000);
		getScreenshot("C:\\Users\\mediwave53\\eclipse-workspace\\Brook_Automation\\login_page.png");
	}

	@When("user should click the logout button")
	public void user_should_click_the_logout_button() {
		login_POM v = new login_POM();
		Click(v.getLogout_button());
	}

	@Then("user should log out")
	public void user_should_log_out() throws InterruptedException {
		login_POM v = new login_POM();
		Thread.sleep(2000);
		Click(v.getLogout_confirmation());
		driver.close();
	}

}
