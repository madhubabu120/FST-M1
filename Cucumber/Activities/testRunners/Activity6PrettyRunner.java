package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/Features",
        glue = {"stepDefinations"},
        tags = "@SimpleAlert",
        plugin = {"pretty"},
        monochrome = true
)
public class Activity6PrettyRunner {
}
