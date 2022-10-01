package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nopCommercePages.P07_categories;
import nopCommercePages.P09_wishList;
import org.testng.Assert;

import java.time.Duration;

import static TestCasesDefinitions.Hooks.driver;


public class D10_wishList {
    P07_categories categories = new P07_categories();
    P09_wishList wishList = new P09_wishList();

    @And("user clicks on add to wishlist button for 2nd product.")
    public void user_clicks_on_add_to_wishlist_button_for_2nd_product() throws InterruptedException {
        categories.digitalStormVanquish3_wishListButton().click();
        Thread.sleep(1000);
    }

    @And("product has been added to wishlist message displayed.")
    public void product_has_been_added_to_wishlist_message_displayed() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualMessageDisplayed = categories.barNotification().getText();
        String expectedMessageDisplayed = "The product has been added to your wishlist";
        Assert.assertTrue(actualMessageDisplayed.contains(expectedMessageDisplayed));
        System.out.println("\n--- TS #14 (Wishlist) | Confirmation Message Displayed Comparison: ---");
        System.out.println("** Actual Message Displayed = " + actualMessageDisplayed);
        System.out.println("** Expected Message Displayed = " + expectedMessageDisplayed);

        // Closes the product added message displayed:
        categories.barNotification_closeButton().click();
        Thread.sleep(1000);
    }

    @And("user clicks on add to wishlist button for 3rd product.")
    public void user_clicks_on_add_to_wishlist_button_for_3rd_product() {
        categories.lenovoIdeaCentre600_wishListButton().click();

    }

    @Then("user press on wishlist in webpage header.")
    public void user_press_on_wishlist_in_header() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        categories.wishList_headerLabel().click();
        Thread.sleep(2000);
    }

    @And("webpage redirects to wishlist.")
    public void webpage_redirects_to_wishlist() {
        String actualRedirectedURL = driver.getCurrentUrl();
        String expectedRedirectedURL = wishList.wishListURL();
        Assert.assertTrue(actualRedirectedURL.contains(expectedRedirectedURL));
        System.out.println("\n--- TS #14 (Wishlist) | Redirected Website after clicking on Wishlist Button Comparison: ---");
        System.out.println("** Actual Website redirected to = " + actualRedirectedURL);
        System.out.println("** Expected Website redirected to = " + expectedRedirectedURL);
    }

    @And("2nd product is displayed.")
    public void second_product_is_Displayed() {
        String actualResult = wishList.digitalStormVanquish3_productTxtLabel().getText();
        String expectedResult = "Digital Storm VANQUISH 3 Custom Performance PC";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #14 (Wishlist) | 2nd Item Displayed Comparison: ---");
        System.out.println("** Actual Item Displayed Result = " + actualResult);
        System.out.println("** Expected Item Displayed Result = " + expectedResult);
    }

    @And("3rd product is displayed.")
    public void third_product_is_Displayed() {
        String actualResult = wishList.lenovoIdeaCentre600_productTxtLabel().getText();
        String expectedResult = "Lenovo IdeaCentre 600 All-in-One PC";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #14 (Wishlist) | 3rd Item Displayed Comparison: ---");
        System.out.println("** Actual Item Displayed Result = " + actualResult);
        System.out.println("** Expected Item Displayed Result = " + expectedResult);
    }


    @Then("user removes 2nd product from wishlist.")
    public void user_removes_2nd_product_from_wishlist() throws InterruptedException {
        wishList.digitalStormVanquish3_wishListRemoveButton().click();
        Thread.sleep(2000);
        }


    @And("2nd product is removed from wishlist.")
    public boolean second_product_is_removed_from_wishlist() {
        // Checking if Digital Storm Vanquish 3 element is not found in webpage.
        try {
            wishList.digitalStormVanquish3_productTxtLabel();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
