package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    public WebDriver driver;


    By productName = By.xpath("//p[@class='product-name']");

    By promoApplybtn = By.xpath("//button[@class='promoBtn']");

    By placeOrderbtn = By.xpath("//button[text()='Place Order']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }



    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public Boolean applybtnDisplay() {
        return driver.findElement(promoApplybtn).isDisplayed();
    }

    public Boolean placeOrderbtnDisplay() {
       return driver.findElement(placeOrderbtn).isDisplayed();
    }


}
