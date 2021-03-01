package Testrunner;


	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:\\Users\\schittireddy\\eclipse-workspace\\LabCorp\\src\\main\\java\\Features\\LabcorpCodingRound.feature",
			glue="Steps",
			monochrome=true,
			//tags= {"@sanity"},
			plugin= {"pretty","html:test-output"}
			//strict=true,
			//dryRun=false
			)
	public class TestRunner {

	}

