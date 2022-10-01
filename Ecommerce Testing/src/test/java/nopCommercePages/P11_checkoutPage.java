package nopCommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static TestCasesDefinitions.Hooks.driver;

public class P11_checkoutPage {

    // Defines Checkout Page URL.
    public String checkoutPageURL() {
        return "https://demo.nopcommerce.com/onepagecheckout#opc-billing";
    }

    // Defines Country List element.
    public WebElement countryList() {
        By countryList = By.cssSelector("select[data-trigger=\"country-select\"]");
        return driver.findElement(countryList);
    }

    // Defines Egypt located in Country List element.
    public WebElement country_Egypt() {
        By country_Egypt = By.cssSelector("option[value=\"123\"]");
        return driver.findElement(country_Egypt);
    }

    // Defines City text Box.
    public WebElement city_textBox() {
        By city_TextBox = By.cssSelector("#BillingNewAddress_City");
        return driver.findElement(city_TextBox);
    }

    // Defines Address1 text Box.
    public WebElement address1_textBox() {
        By address1_TextBox = By.cssSelector("#BillingNewAddress_Address1");
        return driver.findElement(address1_TextBox);
    }

    // Defines Zip/Postal code text box.
    public WebElement zipOrPostal_textBox() {
        By zipOrPostal_TextBox = By.cssSelector("#BillingNewAddress_ZipPostalCode");
        return driver.findElement(zipOrPostal_TextBox);
    }

    // Defines Phone number text box.
    public WebElement phoneNumber_textBox() {
        By phoneNumber_textBox = By.cssSelector("#BillingNewAddress_PhoneNumber");
        return driver.findElement(phoneNumber_textBox);
    }

    // Defines Shipping Address continue button.
    public WebElement shippingAddress_continueButton() {
        By shippingAddress_continueButton = By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button");
        return driver.findElement(shippingAddress_continueButton);
    }

    // Defines Shipping Method continue button.
    public WebElement shippingMethod_continueButton() {
        By shippingMethod_continueButton = By.cssSelector("#shipping-method-buttons-container > button");
        return driver.findElement(shippingMethod_continueButton);
    }

    // Defines Payment Method continue button.
    public WebElement paymentMethod_continueButton() {
        By paymentMethod_continueButton = By.cssSelector("#payment-method-buttons-container > button");
        return driver.findElement(paymentMethod_continueButton);
    }

    // Defines Payment Information continue button.
    public WebElement paymentInfo_continueButton() {
        By paymentInfo_continueButton = By.cssSelector("#payment-info-buttons-container > button");
        return driver.findElement(paymentInfo_continueButton);
    }

    // Defines Confirm order button.
    public WebElement confirmOrder_Button() {
        By confirmOrder_Button = By.cssSelector("#confirm-order-buttons-container > button");
        return driver.findElement(confirmOrder_Button);
    }

    // Defines Checkout Completed webpage URL.
    public String checkoutCompletedURL() {
        return "https://demo.nopcommerce.com/checkout/completed";
    }

    // Defines Order Proceeded Successfully Title text label.
    public WebElement orderProceededSuccess_title() {
        By orderProceededSuccess_title = By.cssSelector("div.page-body.checkout-data > div > div.title > strong");
        return driver.findElement(orderProceededSuccess_title);
    }
}
