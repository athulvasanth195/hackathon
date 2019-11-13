package runnerFiles;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/main/resources/featureList",tags= {"@applitools"}, glue = { "" },plugin = {
        "pretty", "json:target/cucumber-reports/Cucumber.json"})


public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}