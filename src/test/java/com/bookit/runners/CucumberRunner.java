package com.bookit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/bookit/step_definitions",
        plugin = {
                "json:target/cucumber.json"
        },
        tags = " @verify_number_of_rooms",
        dryRun = false
)
public class CucumberRunner {
}
