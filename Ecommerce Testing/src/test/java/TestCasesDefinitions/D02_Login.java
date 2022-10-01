package TestCasesDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopCommercePages.P01_homePage;
import nopCommercePages.P03_login;
import nopCommercePages.P02_registration;
import org.testng.Assert;

import java.time.Duration;

import static TestCasesDefinitions.Hooks.driver;


public class D02_Login {
    // Defining pages containing elements methods.
    P02_registration register = new P02_registration();
    P03_login login = new P03_login();
    P01_homePage home = new P01_homePage();


    @And("navigates to login page.")
    public void navigates_to_login_page() throws InterruptedException {
        driver.navigate().to(login.loginPageURL());
        Thread.sleep(2000);
    }


    @When("user enters valid login email.")
    public void user_enters_valid_login_email() {
        login.loginEmailTxtFld().sendKeys(register.registerEmail());

    }

    @When("user enters invalid login email.")
    public void user_enters_invalid_login_email() {
        login.loginEmailTxtFld().sendKeys(login.invalidLoginEmail());
    }


    @And("user enters valid login password.")
    public void user_enters_valid_login_password() {
        login.passwordEmailTxtFld().sendKeys(register.registerPassword());
    }

    @And("user enters invalid login password.")
    public void user_enters_invalid_login_password() {
        login.passwordEmailTxtFld().sendKeys(login.invalidLoginPassword());
    }


    @And("user press on login button.")
    public void user_press_on_login_button() {
        login.loginButton().click();
    }


    @Then("user could login successfully.")
    public void user_could_login_successfully() {
        String actualResult = login.loginSuccessTxtFld().getText();
        String expectedResult = "Log out";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TC #3 (Login) | User logged in (logout button text displayed) Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }


    @And("returned to home page of the website.")
    public void returned_to_home_page_of_the_website() throws InterruptedException {
       Thread.sleep(2000);
       String actualResult = driver.getCurrentUrl();
       String expectedResult = home.homepageURL();
       System.out.println("\n--- TC #3 (Login) | Redirected to home page Comparison: ---");
       System.out.println("** Actual Result = " + actualResult);
       System.out.println("** Expected Result = " + expectedResult);

    }


    @Then("user could not login successfully.")
    public void user_could_not_login_successfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = login.loginUnSuccessTxtFld().getText();
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TC #4 (Login) | User failed to login Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);

    }
}
