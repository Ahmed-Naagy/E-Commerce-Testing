package nopCommercePages;

// This class defines Shopping Cart Webpage Elements.


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static TestCasesDefinitions.Hooks.driver;

public class P08_shoppingCart {

    // Defines Shopping Cart URL.
    public String shoppingCartURL() {
        return "https://demo.nopcommerce.com/cart";
    }

    // Defines First Product Text Label.
    public WebElement firstProductLabel() {
        By firstProductLabel = By.cssSelector("tr:nth-child(1) > td.product > a");
        return driver.findElement(firstProductLabel);
    }

    // Defines First Product remove from Cart Button.
    public WebElement firstProduct_RemoveButton() {
        By firstProduct_RemoveButton = By.cssSelector("tbody > tr:nth-child(1) > td.remove-from-cart > button");
        return driver.findElement(firstProduct_RemoveButton);
    }

    // Defines Second Product Text Label.
    public WebElement secondProductLabel() {
        By secondProductLabel = By.cssSelector("tr:nth-child(2) > td.product > a");
        return driver.findElement(secondProductLabel);
    }

    // Defines First Product Quantity Text Box.
    public WebElement firstProductQuantity() {
       By firstProductQuantity = By.cssSelector("td[class=\"quantity\"] > input:nth-child(2)");
       return driver.findElement(firstProductQuantity);
    }

    // Defines Update Cart Button.
    public WebElement updateCartButton() {
        By updateCartButton = By.cssSelector("#updatecart");
        return driver.findElement(updateCartButton);
    }

    // Defines Cart First Product Subtotal.
    public WebElement firstProduct_SubTotalLabel() {
        By firstProduct_SubTotalLabel = By.cssSelector(".product-subtotal");
        return driver.findElement(firstProduct_SubTotalLabel);
    }

    // Defines Cart Total Text Label.
    public WebElement cartTotalLabel() {
        By cartTotalLabel = By.cssSelector("span > strong");
        return driver.findElement(cartTotalLabel);
    }

    // Defines Agree with terms of service checkbox.
    public WebElement termsOfService_checkbox() {
        By termsOfService_checkbox = By.cssSelector("input[id=\"termsofservice\"]");
        return driver.findElement(termsOfService_checkbox);
    }

    // Defines Checkout button.
    public WebElement checkout_Button() {
        By checkout_Button = By.cssSelector("button[id=\"checkout\"]");
        return driver.findElement(checkout_Button);
    }



}
