package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public LandingPage landingPage;
    public DealsPage dealsPage;
    public CheckoutPage checkoutPage;

    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }


    public LandingPage initializeLandingPageObject(){
       return landingPage = new LandingPage(driver);
    }

    public DealsPage initializeDealsPageObject(){
        return dealsPage = new DealsPage(driver);
    }

    public CheckoutPage initializeCheckoutPageObject(){
        return checkoutPage = new CheckoutPage(driver);
    }

}
