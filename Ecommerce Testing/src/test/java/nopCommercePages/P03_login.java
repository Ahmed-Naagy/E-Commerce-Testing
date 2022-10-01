package nopCommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static TestCasesDefinitions.Hooks.driver;


public class P03_login {

    public String loginPageURL() {
        return "https://demo.nopcommerce.com/login?returnUrl=%2F";
    }

    public WebElement loginEmailTxtFld() {
        By loginEmailTxtFld = By.cssSelector("input[class=\"email\"]");
        return driver.findElement(loginEmailTxtFld);
    }

    public String invalidLoginEmail() {
        return "Automationrandomcheck765@udacity.com";
    }

    public WebElement passwordEmailTxtFld() {
        By passwordEmailTxtFld = By.cssSelector("input[class=\"password\"]");
        return driver.findElement(passwordEmailTxtFld);
    }

    public String invalidLoginPassword() {
        return "InvalidCheck675";
    }

    public WebElement loginButton() {
        By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
        return driver.findElement(loginButton);
    }

    public WebElement loginSuccessTxtFld() {
        By loginSuccessTxtFld = By.cssSelector("a[class=\"ico-logout\"]");
        return driver.findElement(loginSuccessTxtFld);
    }

    public WebElement loginUnSuccessTxtFld() {
        By loginUnSuccessTxtFld = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        return driver.findElement(loginUnSuccessTxtFld);
    }


}
