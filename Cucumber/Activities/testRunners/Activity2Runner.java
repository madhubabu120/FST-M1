package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/Features",
        glue = {"stepDefinations"},
        tags = "@activity2"
)


public class Activity2Runner {
}
