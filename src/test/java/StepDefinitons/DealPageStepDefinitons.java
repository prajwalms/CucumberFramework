package StepDefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageobjects.DealsPage;
import pageobjects.LandingPage;
import utils.TextContext;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class DealPageStepDefinitons {
    public String offerPageProdName;
    TextContext context;

    public DealPageStepDefinitons(TextContext context) {
        this.context = context;
    }

    @Then("^User search with three letters (.+) on top deals page same home page search results should be displayed$")
    public void user_search_with_three_letters_on_top_deals_page_same_home_page_search_results_should_be_displayed(String shortName) throws InterruptedException {
        switchToOfferPage();
        DealsPage dealsPage = context.pageObjectFactory.initializeDealsPageObject();
        dealsPage.searchProduct(shortName);
        //context.driver.findElement(By.id("search-field")).sendKeys(shortName);
        Thread.sleep(2000);
        offerPageProdName = dealsPage.getSearchResult();


    }


    public void switchToOfferPage() {
        LandingPage landingPage = context.pageObjectFactory.initializeLandingPageObject();;
        landingPage.navigateToTopDealsPag();
        //context.driver.findElement(By.linkText("Top Deals")).click();
        context.genericUtils.switchToChildWindow();
    }

    @Then("Validate both search product names")
    public void Validate_both_search_product_names() throws IOException {


        Assert.assertEquals(offerPageProdName, context.landingPageProdName);


    }

}
