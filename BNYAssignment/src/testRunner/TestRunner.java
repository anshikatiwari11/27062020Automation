package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)                
@CucumberOptions(features=".//FeatureFiles/Search.feature",glue="stepDefinition",dryRun=false,plugin={"pretty","html:test-output"},monochrome=true)


public class TestRunner {
	
		}


