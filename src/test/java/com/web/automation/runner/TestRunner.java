package com.web.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions( features="FeatureFile/search.feature",
					monochrome=true,
					glue="com.web.automation.stepdefenition",
					plugin = { "html:target/cucumber-report"}
				)


	public class TestRunner {
	
}
	

	

	

