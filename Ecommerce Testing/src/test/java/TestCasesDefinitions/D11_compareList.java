package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nopCommercePages.P07_categories;
import nopCommercePages.P10_compareList;
import org.testng.Assert;

import java.time.Duration;

import static TestCasesDefinitions.Hooks.driver;

public class D11_compareList {

    P07_categories categories = new P07_categories();
    P10_compareList compareProducts = new P10_compareList();

    @And("user press on 2nd product add to compare list button.")
    public void user_press_on_2nd_product_add_to_compare_list_button() {
        categories.digitalStormVanquish3_compareListButton().click();

    }

    @Then("product has been added to compare list message displayed.")
    public void product_has_been_added_to_compare_list_message_displayed() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualMessageDisplayed = categories.barNotification().getText();
        String expectedMessageDisplayed = "The product has been added to your product comparison";
        Assert.assertTrue(actualMessageDisplayed.contains(expectedMessageDisplayed));
        System.out.println("\n--- TS #15 (Compare List) | Product Confirmation Message Displayed Comparison: ---");
        System.out.println("** Actual Message Displayed = " + actualMessageDisplayed);
        System.out.println("** Expected Message Displayed = " + expectedMessageDisplayed);
        Thread.sleep(1000);

    }

    @And("user press on 3rd product add to compare list button.")
    public void user_press_on_3rd_product_add_to_compare_list_button() {
        categories.lenovoIdeaCentre600_compareListButton().click();

    }


    @And("user press on product comparison in bar notification message.")
    public void user_press_on_product_comparison_in_bar_notification_message() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        categories.productComparison_barNotification().click();
        Thread.sleep(1000);
    }

    @Then("user is redirected to compare products webpage.")
    public void user_is_redirected_to_compare_products_webpage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = compareProducts.compareProductsURL();
        Assert.assertTrue(actualURL.contains(expectedURL));
        System.out.println("\n--- TS #15 (Compare List) | Redirected URL Comparison: ---");
        System.out.println("** Actual URL = " + actualURL);
        System.out.println("** Expected URL = " + expectedURL);

    }

    @And("2nd product is displayed in compare list.")
    public void second_product_is_displayed_in_compare_list() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String actualDisplayedOption = compareProducts.digitalStormVanquish3_textLabel().getText();
        String expectedDisplayedOption = "Digital Storm VANQUISH 3 Custom Performance PC";
        Assert.assertTrue(actualDisplayedOption.contains(expectedDisplayedOption));
        System.out.println("\n--- TS #15 (Compare List) | 2nd Product is Displayed Comparison: ---");
        System.out.println("** Actual Displayed Option = " + actualDisplayedOption);
        System.out.println("** Expected Displayed Option = " + expectedDisplayedOption);
    }

    @And("3rd product is displayed in compare list.")
    public void third_product_is_displayed_in_compare_list() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String actualDisplayedOption = compareProducts.lenovoIdeaCentre600_textLabel().getText();
        String expectedDisplayedOption = "Lenovo IdeaCentre 600 All-in-One PC";
        Assert.assertTrue(actualDisplayedOption.contains(expectedDisplayedOption));
        System.out.println("\n--- TS #15 (Compare List) | 3rd Product is Displayed Comparison: ---");
        System.out.println("** Actual Displayed Option = " + actualDisplayedOption);
        System.out.println("** Expected Displayed Option = " + expectedDisplayedOption);
    }
}
