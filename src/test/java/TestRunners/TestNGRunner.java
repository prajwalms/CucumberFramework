package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features", glue = "StepDefinitons", monochrome = true,
        plugin = {"html:target/Cucumber.html", "json:target/Cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_testcases.txt"},
        tags="@Checkout or @Search")
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
