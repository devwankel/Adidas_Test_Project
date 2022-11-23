package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_AdidasTest {

    DialogContent dc = new DialogContent();

    @Given("Nagivgate to blaze.com")
    public void nagivgateToBlazeCom() {

        GWD.getDriver().get("https://www.demoblaze.com/index.html");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Navigate to {string}")
    public void navigateTo(String arg0) {

        dc.findAndClick("laptops");
        dc.findAndClick("sony");
        dc.findAndClick("addToCart");

    }

    @Then("{string} and click on Add to cart")
    public void andClickOnAddToCart(String arg0) {
    }

    @And("Accept pop up confirmation")
    public void acceptPopUpConfirmation() {
    }

    @When("Navigate to Cart")
    public void navigateToCart() {
    }

    @Then("Delete {string} from cart")
    public void deleteFromCart(String arg0) {
    }

    @And("Click on {string}")
    public void clickOn(String arg0) {
    }

    @Then("Fill in all web form fields")
    public void fillInAllWebFormFields() {
    }

    @And("Click on Purchase")
    public void clickOnPurchase() {
    }

    @Then("Capture and log purchase Id and Amount")
    public void captureAndLogPurchaseIdAndAmount() {
    }

    @And("Assert purchase amount equals expected")
    public void assertPurchaseAmountEqualsExpected() {
    }

    @And("Click on Ok")
    public void clickOnOk() {
    }
}
