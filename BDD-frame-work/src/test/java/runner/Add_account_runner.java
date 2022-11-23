package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\Alain Mickey\\Desktop\\New eclipse 2021-06\\BDD_scenario_outline\\src\\test\\java\\features\\Add_account_scenario_outline.feature",
glue="",
tags ="@outline",
monochrome=true,
dryRun=false,
plugin= {
"pretty",
"html:target/cucumber",
"json:target/cucumber.json"
}
)

public class Add_account_runner {

}

