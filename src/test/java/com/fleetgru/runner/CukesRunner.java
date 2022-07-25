package com.fleetgru.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/fleetgru/step_definitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
