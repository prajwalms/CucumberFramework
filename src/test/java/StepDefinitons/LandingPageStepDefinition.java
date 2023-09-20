package StepDefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageobjects.LandingPage;
import utils.TextContext;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class LandingPageStepDefinition {

    public WebDriver driver;
    public String landingPageProdName;
    LandingPage landinPage;

    TextContext context;

    public LandingPageStepDefinition(TextContext context) {
        this.context = context;
        landinPage = context.pageObjectFactory.initializeLandingPageObject();
    }

    @Given("user is on GreenKart landing page")
    public void user_is_on_green_kart_landing_page() throws IOException {

       // context.testBase.WebDriverManger();
    }

    @When("^user search with three letters (.+) and search results should be displayed for the matching product$")
    public void user_search_with_three_letters_and_search_results_should_be_displayed_for_the_matching_product(String shortProdName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        landinPage = context.pageObjectFactory.initializeLandingPageObject();
        landinPage.searchProduct(shortProdName);
        //context.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortProdName);
        Thread.sleep(2000);
        context.landingPageProdName = landinPage.getSearchResult().split("-")[0].trim();

    }

    @When("Add {string} quantity of searched product to cart and proceed to checkout")
    public void add_quantity_of_searched_product_to_cart_and_proceed_to_checkout(String quantity) {
        // Write code here that turns the phrase above into concrete actions

        landinPage.icrementQty(Integer.parseInt(quantity));
        landinPage.addProductToCart();
        landinPage.checkOutProduct();

    }

}
