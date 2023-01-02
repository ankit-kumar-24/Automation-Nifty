package niftytestrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/project.feature",
		glue = "stepdefinition",
		dryRun = false,
		monochrome = true,
		tags = "@Smoke",
		plugin = {"pretty","html:test-output","json:json_output/cucmber.json","junit:junit_xml_output/cucumber.xml"}
		)
public class niftyrun {
	
}