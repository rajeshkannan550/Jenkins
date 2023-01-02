package com.step_definition;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base_class.baseClass;
import com.object_repository.Age_18_object_repository;
import com.object_repository.To_verify_all_the_postcodes_POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class To_veify_all_the_postcodes_step extends baseClass {

	@Given("user1 is on the STI Order test Kit home page")
	public void user1_is_on_the_sti_order_test_kit_home_page() {
		getDriver("https://staging.brook.mindwave.site/hometest");
	}

	@When("user1 should choose the theme , know the details")
	public void user1_should_choose_the_theme_know_the_details() {
		To_verify_all_the_postcodes_POM u = new To_verify_all_the_postcodes_POM();
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

	@When("user1 should get the post codes from the {string} and {string} and verify the page is navigated")
	public void user1_should_get_the_post_codes_from_the_and_and_verify_the_page_is_navigated(String string,
			String string2) throws IOException {
		To_verify_all_the_postcodes_POM s = new To_verify_all_the_postcodes_POM();
		int last_Row_Num = last_Row_Num(string, string2);

		for (int i = 0; i < last_Row_Num; i++) {
			String getdata = getdata(string, string2, i, 0);
			System.out.println(getdata);
			s.getEnter_postcode().sendKeys(getdata);
			s.getPost_code_next().click();
			WebDriverWait w = webDriverWait();
			w.until(ExpectedConditions.or(ExpectedConditions.textToBePresentInElement(s.getGetText(), "Age"),
					ExpectedConditions.textToBePresentInElement(s.getGetText(),"doesn't")));
			String text = s.getGetText().getText();
			if (text.equals("Age")) {
				System.out.println("It accepted the code sucessfully, navigated to " + s.getGetText().getText());
				s.getBack_btn().click();
				clear(s.getEnter_postcode());
			} else {
				System.out.println(s.getGetText().getText());
				s.getBack_btn().click();
				excelcreate("C:\\Users\\mediwave53\\eclipse-workspace\\Brook\\data\\failed Codes.xlsx", "Sheet1", i, 0,
						getdata);
				clear(s.getEnter_postcode());
			}
		}

	}

}
