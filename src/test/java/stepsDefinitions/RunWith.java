package stepsDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(   dryRun = false ,
                    strict = false ,
                    features = ".",
                    tags = "@test22",
                    format = {"html:target/site/cucumber-pretty","json:target/cucumber.json"})
@org.junit.runner.RunWith(Cucumber.class)
public class RunWith {

}
