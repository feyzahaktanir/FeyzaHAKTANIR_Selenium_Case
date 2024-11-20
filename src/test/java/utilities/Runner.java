package utilities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin = "io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features="src/test/resources/features",
        glue="stepdefinitions",
        //tags="@US004",
        dryRun=true
)

public class Runner {}