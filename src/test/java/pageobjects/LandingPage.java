package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;
    By search = By.xpath("//input[@type='search']");
    By resultProd = By.cssSelector("h4[class='product-name']");
    By cartIcon = By.xpath("//img[@alt='Cart']");
    By ProceedToCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");

    By topDeailsPageLink = By.linkText("Top Deals");
    By incrementbtn = By.xpath("//a[@class='increment']");

    By addToCart = By.xpath("//div[@class='product-action']  //button[@type='button']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkOutProduct() {
        driver.findElement(cartIcon).click();
        driver.findElement(ProceedToCheckout).click();

    }

    public void icrementQty(int quantity){
        for(int i=0;i<quantity;i++){
            driver.findElement(incrementbtn).click();
        }
    }

    public void addProductToCart(){
        driver.findElement(addToCart).click();
    }

    public void searchProduct(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public String getSearchResult() {
        return driver.findElement(resultProd).getText();
    }

    public void navigateToTopDealsPag(){
        driver.findElement(topDeailsPageLink).click();
    }
}
