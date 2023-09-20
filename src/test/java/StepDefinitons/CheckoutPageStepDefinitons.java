package StepDefinitons;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageobjects.CheckoutPage;
import pageobjects.DealsPage;
import pageobjects.LandingPage;
import utils.TextContext;

import java.io.IOException;

public class CheckoutPageStepDefinitons {
    public String offerPageProdName;
    public CheckoutPage checkoutPage;
    TextContext context;

    public CheckoutPageStepDefinitons(TextContext context) {

        this.context = context;
        checkoutPage= context.pageObjectFactory.initializeCheckoutPageObject();
    }


    @Then("verify added product in checkout page")
    public void verify_added_product_in_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        String checkoutPageProdName=checkoutPage.getProductName().split("-")[0].trim();
        Assert.assertEquals(checkoutPageProdName, context.landingPageProdName);


    }
    @Then("verify Promo code and Place order buttons are displayed")
    public void verify_promo_code_and_place_order_buttons_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(checkoutPage.applybtnDisplay());
        Assert.assertTrue(checkoutPage.placeOrderbtnDisplay());

    }
}
