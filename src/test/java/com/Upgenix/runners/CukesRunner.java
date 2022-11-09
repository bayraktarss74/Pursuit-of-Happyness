package com.Upgenix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",

    },
        features = "src/test/resources/features",
        glue = "com/Upgenix/stepDefinitions",
        dryRun = false,
        tags = "",
        publish = true

)
public class CukesRunner {
}


