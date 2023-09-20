package StepDefinitons;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.TextContext;

import java.io.File;
import java.io.IOException;

public class Hooks {
    TextContext context;
  public Hooks(TextContext context){
      this.context = context;
  }

    @After
    public void tearDown() throws IOException {
        context.testBase.WebDriverManger().quit();
    }

    @AfterStep
    public void takeScreenShot(Scenario scenario) throws IOException {
        WebDriver driver = context.testBase.WebDriverManger();
        if (scenario.isFailed()){
            File srcPath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileCoverted=FileUtils.readFileToByteArray(srcPath);
            scenario.attach(fileCoverted,"image/png","image");

    }
    }
}
