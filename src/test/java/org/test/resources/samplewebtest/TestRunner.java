package samplewebtest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true,
	             features = "src\\test\\resources\\datatable.feature",
	             plugin = {"pretty","html:target/Destination", "json: cucumber-html-reports/cucumber.json" },
	              glue = {"org.test.samplewebtest"})
public class TestRunner {

	}
