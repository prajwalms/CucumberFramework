package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.CheckoutPage;
import pageobjects.PageObjectManager;

import java.io.IOException;

public class TextContext {


    public WebDriver driver;

    public String landingPageProdName;
    public PageObjectManager pageObjectFactory;
    public TestBase testBase;
    public  GenericUtils genericUtils;

    public TextContext() throws IOException {
        testBase= new TestBase();
        pageObjectFactory=new PageObjectManager(testBase.WebDriverManger());
        genericUtils = new GenericUtils(testBase.WebDriverManger());
    }
}
