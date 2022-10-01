package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nopCommercePages.P07_categories;
import nopCommercePages.P08_shoppingCart;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.time.Duration;

import static TestCasesDefinitions.Hooks.driver;


public class D09_shoppingCart {
    P07_categories categories = new P07_categories();
    P08_shoppingCart shoppingCart = new P08_shoppingCart();

    @And("user press add to cart on 2nd product choice twice.")
    public void user_press_add_to_cart_on_2nd_product_choice_twice() throws InterruptedException {
        categories.digitalStormVanquish3_addToCartButton().click();
        Thread.sleep(1000);
        // Adding 2nd item choice again to cart:
        categories.digitalStormVanquish3_addToCartButton().click();
        Thread.sleep(1000);
    }

    @Then("product has been added to cart message displayed.")
    public void product_has_been_added_to_cart_message_displayed() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualMessageDisplayed = categories.barNotification().getText();
        String expectedMessageDisplayed = "The product has been added to your shopping cart";
        Assert.assertTrue(actualMessageDisplayed.contains(expectedMessageDisplayed));
        System.out.println("\n--- TS #13 (Shopping Cart) | Confirmation Message Displayed Comparison: ---");
        System.out.println("** Actual Message Displayed = " + actualMessageDisplayed);
        System.out.println("** Expected Message Displayed = " + expectedMessageDisplayed);

        // Closes the product added message displayed:
        categories.barNotification_closeButton().click();
        Thread.sleep(1000);
    }

    @And("user press add to cart on the 3rd product choice.")
    public void user_press_add_to_cart_on_the_3rd_product_choice() {
        categories.lenovoIdeaCentre600_addToCartButton().click();
    }

    @And("user press on shopping cart in header.")
    public void user_press_on_shopping_cart_in_header() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        categories.shoppingCart_header().click();
        Thread.sleep(1000);
    }

    @Then("webpage redirect to shopping cart.")
    public void webpage_redirect_to_shopping_cart() {
        String actualRedirectedURL = driver.getCurrentUrl();
        String expectedRedirectedURL = shoppingCart.shoppingCartURL();
        Assert.assertTrue(actualRedirectedURL.contains(expectedRedirectedURL));
        System.out.println("\n--- TS #13 (Shopping Cart) | Redirected Website after clicking on Shopping Cart Button Comparison: ---");
        System.out.println("** Actual Website Returned to = " + actualRedirectedURL);
        System.out.println("** Expected Website Returned to = " + expectedRedirectedURL);
    }

    @And("2nd product choice is displayed.")
    public void second_item_choice_is_displayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = shoppingCart.firstProductLabel().getText();
        String expectedResult = "Digital Storm VANQUISH 3 Custom Performance PC";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #13 (Shopping Cart) | 2nd Item Displayed Comparison: ---");
        System.out.println("** Actual Item Displayed Result = " + actualResult);
        System.out.println("** Expected Item Displayed Result = " + expectedResult);
    }

    @And("3rd product choice is displayed.")
    public void third_item_choice_is_displayed() {
        String actualResult = shoppingCart.secondProductLabel().getText();
        String expectedResult = "Lenovo IdeaCentre 600 All-in-One PC";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #13 (Shopping Cart) | 3rd Item Displayed Comparison: ---");
        System.out.println("** Actual Item Displayed Result = " + actualResult);
        System.out.println("** Expected Item Displayed Result = " + expectedResult);
    }

    @Then("user changes quantity of the 2nd product to 5 pieces.")
    public void user_changes_quantity_of_the_2nd_item() {
        shoppingCart.firstProductQuantity().sendKeys(Keys.BACK_SPACE, "5");
    }

    @And("user press on update shopping cart button.")
    public void user_press_on_update_shopping_cart_button() throws InterruptedException {
        shoppingCart.updateCartButton().click();
        Thread.sleep(2000);
    }

    @Then("product subtotal changes.")
    public void item_subtotal_changes() {
        String oldCartSubTotal = "$2,518.00";
        String newCartSubTotal = shoppingCart.firstProduct_SubTotalLabel().getText();

        // Asserting not same to make sure that the subtotal item price changed after editing quantity:
        Assert.assertNotSame(oldCartSubTotal, newCartSubTotal);
        System.out.println("\n--- TS #13 (Shopping Cart) | 2nd Item Subtotal Comparison: ---");
        System.out.println("** Subtotal before editing = " + oldCartSubTotal);
        System.out.println("** Subtotal after editing = " + newCartSubTotal);
    }

    @Then("user press on remove button of 2nd product.")
    public void user_press_on_remove_button_of_2nd_item() {
        shoppingCart.firstProduct_RemoveButton().click();
    }

    @And("cart total changes after removal of 2nd product.")
    public void cart_total_changes_after_removal_of_2nd_item() {
        String actualCartTotal = shoppingCart.cartTotalLabel().getText();
        String expectedCartTotal = "$500.00";
        Assert.assertTrue(actualCartTotal.contains(expectedCartTotal));
        System.out.println("\n--- TS #13 (Shopping Cart) | Cart Total after removing 2nd item Comparison: ---");
        System.out.println("** Actual Cart Total after editing = " + actualCartTotal);
        System.out.println("** Expected Cart Total after editing = " + expectedCartTotal);

    }


}
