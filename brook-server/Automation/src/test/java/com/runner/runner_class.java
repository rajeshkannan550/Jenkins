package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature_file",

		glue = "com.step_definition", dryRun = false, tags = "@under_16_STI_form_Submission")
public class runner_class {

}