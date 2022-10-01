package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import nopCommercePages.P07_categories;
import nopCommercePages.P01_homePage;
import org.testng.Assert;

import java.time.Duration;

import static TestCasesDefinitions.Hooks.driver;


public class D07_filterWithColour {
    P01_homePage home = new P01_homePage();
    P07_categories categories = new P07_categories();
    @And ("user press on Apparel from homepage.")
    public void user_press_on_Apparel_from_homepage() {
        home.apparelCategory().click();
    }

    @And("user press on Shoes subcategory.")
    public void user_press_on_shoes_subcategory() {
        categories.shoesSubCategory().click();
    }

    @And("user press on red checkbox.")
    public void user_press_on_red_checkbox() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        categories.shoesRedCheckBox().click();
    }

    @Then("user gets Shoes options with red colour.")
    public void userGetsShoesOptionsWithRedColour() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = categories.adidasConsortiumCampus80sProduct().getText();

       // A shoes having red colour as an option:
       String expectedResult = "adidas Consortium Campus 80s Running Shoes";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #11 (Filter With Colour) | Shoes with red colour as an option Comparison: ---");
        System.out.println("** Actual Shoes Name Result = " + actualResult);
        System.out.println("** Expected Shoes Name Result = " + expectedResult);
    }
}
