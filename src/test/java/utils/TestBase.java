package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;

    public WebDriver WebDriverManger() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//Global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("URL");
        String default_browser = prop.getProperty("browser");
        String custom_browser = System.getProperty("browser");

        String browser = custom_browser != null ? custom_browser : default_browser;

        if (driver == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("firefox")) {
                //firefox browser
                driver = new FirefoxDriver();
            }
        }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }
}
