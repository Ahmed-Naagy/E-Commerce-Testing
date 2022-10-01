package TestCasesDefinitions;

// This class defines Successful order test scenarios definitions.

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nopCommercePages.P08_shoppingCart;
import nopCommercePages.P11_checkoutPage;
import org.testng.Assert;
import java.time.Duration;

import static TestCasesDefinitions.Hooks.driver;


public class D12_successfulOrder {
    P08_shoppingCart shoppingCart = new P08_shoppingCart();
    P11_checkoutPage checkout = new P11_checkoutPage();

    @And("user press on agree with the terms of service checkbox.")
    public void user_press_on_agree_with_the_terms_of_service_checkbox() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        shoppingCart.termsOfService_checkbox().click();
    }

    @And("user press on checkout button.")
    public void user_press_on_checkout_button() throws InterruptedException {
        shoppingCart.checkout_Button().click();
        Thread.sleep(2000);
    }

    @Then("user is redirected to checkout webpage.")
    public void user_is_redirected_to_checkout_webpage()  {
        String actualRedirectedURL = driver.getCurrentUrl();
        String expectedRedirectedURL = checkout.checkoutPageURL();
        Assert.assertTrue(actualRedirectedURL.contains(expectedRedirectedURL));
        System.out.println("\n--- TS #16 (Successful Order) | Redirected Website after clicking on Checkout Button Comparison: ---");
        System.out.println("** Actual Website redirected to = " + actualRedirectedURL);
        System.out.println("** Expected Website redirected to = " + expectedRedirectedURL);
    }

    @And("user selects Country as Egypt.")
    public void user_selects_Country_as_Egypt() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        checkout.countryList().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        // Selecting Egypt as country:
        checkout.country_Egypt().click();
    }


    @And("user enters Cairo as City.")
    public void user_enters_Cairo_as_City() {
        checkout.city_textBox().sendKeys("Cairo");
    }

    @And("user enters his or her address.")
    public void user_enters_his_her_address() {
        checkout.address1_textBox().sendKeys("14,Udacity Test,Cairo");
    }

    @And("user enters zip or postal code.")
    public void user_enters_zip_or_postal_code() {
        checkout.zipOrPostal_textBox().sendKeys("11865");
    }


    @And("user enters his or her phone number.")
    public void user_enters_his_or_her_phone_number() {
        checkout.phoneNumber_textBox().sendKeys("+2010000000");
    }

    @And("user press on shipping address continue button.")
    public void user_press_on_shipping_address_continue_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        checkout.shippingAddress_continueButton().click();

    }


    @And("user press on shipping method continue button.")
    public void user_press_on_shipping_method_continue_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        checkout.shippingMethod_continueButton().click();
    }

    @And("user press on payment method continue button.")
    public void user_press_on_payment_method_continue_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        checkout.paymentMethod_continueButton().click();
    }

    @And("user press on payment information continue button.")
    public void user_press_on_payment_information_continue_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        checkout.paymentInfo_continueButton().click();
    }


    @And("user press on confirm button to confirm the order.")
    public void user_press_on_confirm_button_to_confirm_the_order() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        checkout.confirmOrder_Button().click();
        Thread.sleep(2000);
    }

    @Then("user is redirected to checkout completed webpage.")
    public void user_is_redirected_to_checkout_completed_webpage() {
        String actualRedirectedURL = driver.getCurrentUrl();
        String expectedRedirectedURL = checkout.checkoutCompletedURL();
        Assert.assertTrue(actualRedirectedURL.contains(expectedRedirectedURL));
        System.out.println("\n--- TS #16 (Successful Order) | Redirected Website after clicking on Confirm Button Comparison: ---");
        System.out.println("** Actual Website redirected to = " + actualRedirectedURL);
        System.out.println("** Expected Website redirected to = " + expectedRedirectedURL);
    }


    @And("order proceeded successfully message appears.")
    public void order_proceeded_successfully_message_appears() {
        String actualResult= checkout.orderProceededSuccess_title().getText();
        String expectedResult = "Your order has been successfully processed!";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #16 (Successful Order) | Text Displayed after Checkout redirected Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }
}
