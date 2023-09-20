package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage {
    public WebDriver driver;
    By search = By.id("search-field");
    By resultProd = By.xpath("//table/tbody/tr/td[1]");


    public DealsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void searchProduct(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public String getSearchResult() {
        return driver.findElement(resultProd).getText();
    }
}
