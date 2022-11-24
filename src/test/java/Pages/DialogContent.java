package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Laptops")
    private WebElement laptops;

    @FindBy(linkText = "Sony vaio i5")
    private WebElement sony;

    @FindBy(linkText = "Add to cart")
    private WebElement addToCart;

    @FindBy(linkText = "Dell i7 8gb")
    private WebElement dell;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        switch (strElement) {
            //case "searchInput": myElement = searchInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "laptops": myElement = laptops; break;
            case "sony" : myElement = sony; break;
            case "addToCart" : myElement = addToCart; break;
            case "dell" : myElement = dell; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            //case "productName" : myElement =productName; break;
        }

        verifyContainsText(myElement, text);
    }

    public String  findAndGetText(String strElement) {
        switch (strElement) {
            //case "productName" : myElement =productName; break;
        }

        return verifyContainsText(myElement);
    }

    public void findAndClear(String strElement) {
        switch (strElement) {
            //case "searchInput": myElement = searchInput; break;
        }

        clear(myElement);
    }


}
