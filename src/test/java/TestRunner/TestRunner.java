package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Admin\\Documents\\GitHub Automation\\GameTest\\src\\test\\java\\features",
        plugin = {"pretty", "html:test-output"},
        glue = {"TestPages"}
)
public class TestRunner {
}
