package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
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

    @When("Navigate to Laptop")
    public void navigateTo() {

        dc.findAndClick("laptops");
        dc.findAndClick("sony");
        dc.findAndClick("addToCart");

        Parent.waitUntilAlert();
        GWD.getDriver().switchTo().alert().accept();

    }

    @Then("Sony vaio i5 and click on Add to cart")
    public void andClickOnAddToCart() {

        GWD.getDriver().navigate().back();
        GWD.getDriver().navigate().back();

        dc.findAndClick("laptops");
        dc.findAndClick("dell");
        dc.findAndClick("addToCart");

        Parent.waitUntilAlert();
        GWD.getDriver().switchTo().alert().accept();

    }

    @And("Accept pop up confirmation")
    public void acceptPopUpConfirmation() {
    }

    @When("Navigate to Cart")
    public void navigateToCart() {
    }

    @Then("Dell i7 8gb and click on Add to cart")
    public void dellIGbAndClickOnAddToCart() {
    }

    @Then("Delete Dell i7 8gb from cart")
    public void deleteFromCart() {
    }

    @And("Click on Place order")
    public void clickOn() {
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
