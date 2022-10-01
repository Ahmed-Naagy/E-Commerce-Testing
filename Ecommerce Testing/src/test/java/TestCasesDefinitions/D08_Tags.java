package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nopCommercePages.P07_categories;
import org.testng.Assert;


public class D08_Tags {
    P07_categories categories = new P07_categories();


    @And("user press on awesome tag option.")
    public void user_press_on_awesome_tag_option() {
        categories.awesomeTag().click();
    }

    @Then("webpage redirect to products tagged with awesome.")
    public void webpage_redirect_to_products_tagged_with_awesome() {
        String actualRedirectedURL = Hooks.driver.getCurrentUrl();
        String expectedRedirectedURL = categories.awesomeTagURL();
        Assert.assertTrue(actualRedirectedURL.contains(expectedRedirectedURL));
        System.out.println("\n--- TS #12 (Tags) | (Awesome Tag) URL Comparison: ---");
        System.out.println("** Actual Redirected URL = " + actualRedirectedURL);
        System.out.println("** Expected Redirected URL = " + expectedRedirectedURL);
    }

    @And("text field containing products tagged with awesome shown.")
    public void text_field_containing_products_tagged_with_awesome_shown() {
        String actualTextDisplayed = categories.tagsPageTitle().getText();
        String expectedTextDisplayed = "awesome";
        Assert.assertTrue(actualTextDisplayed.contains(expectedTextDisplayed));
        System.out.println("\n--- TS #12 (Tags) | (Awesome Tag) Page Title Text Field Shown Comparison: ---");
        System.out.println("** Actual Text Displayed = " + actualTextDisplayed);
        System.out.println("** Expected Text Displayed contains = " + expectedTextDisplayed);
    }

    @Then("user press on cool tag option.")
    public void user_press_on_cool_tag_option() {
        categories.coolTag().click();
    }


    @And("webpage redirect to products tagged with cool.")
    public void webpage_redirect_to_products_tagged_with_cool() {
        String actualRedirectedURL = Hooks.driver.getCurrentUrl();
        String expectedRedirectedURL = categories.coolTagURL();
        Assert.assertTrue(actualRedirectedURL.contains(expectedRedirectedURL));
        System.out.println("\n--- TS #12 (Tags) | (Cool Tag) URL Comparison: ---");
        System.out.println("** Actual Redirected URL = " + actualRedirectedURL);
        System.out.println("** Expected Redirected URL = " + expectedRedirectedURL);
    }


    @And("text field containing products tagged with cool shown.")
    public void text_field_containing_products_tagged_with_cool_shown() {
        String actualTextDisplayed = categories.tagsPageTitle().getText();
        String expectedTextDisplayed = "cool";
        Assert.assertTrue(actualTextDisplayed.contains(expectedTextDisplayed));
        System.out.println("\n--- TS #12 (Tags) | (Cool Tag) Page Title Text Field Shown Comparison: ---");
        System.out.println("** Actual Text Displayed = " + actualTextDisplayed);
        System.out.println("** Expected Text Displayed contains = " + expectedTextDisplayed);
    }
}
