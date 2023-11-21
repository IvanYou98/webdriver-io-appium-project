import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "classpath:steps",
        tags = "@drag-and-drop"
)
public class RunnerClass extends AbstractTestNGCucumberTests {

}
