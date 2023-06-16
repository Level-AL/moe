package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucmber-report.html","json:target/cucumber.json"},
		features = "src/test/resources/features/searchFunctionality.feature",
		glue = "stepDefinition",
		dryRun = false,
		tags="@queryTest"
		)

public class CukesRunner {

	
	
	
	
	
	
	
	
	
}
