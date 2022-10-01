package nopCommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static TestCasesDefinitions.Hooks.driver;

public class P02_registration {

    public String registerPageURL() {
        return "https://demo.nopcommerce.com/register?returnUrl=%2F";
    }

    public String registerPageResultURL() {
        return "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
    }

    public WebElement maleCheckBox() {
        By maleCheckBox = By.id("gender-male");
        return driver.findElement(maleCheckBox);
    }

    public WebElement firstNameTxtFld() {
        By firstNameTxtFld = By.id("FirstName");
        return driver.findElement(firstNameTxtFld);
    }

    public WebElement lastNameTxtFld() {
        By lastNameTxtFld = By.id("LastName");
        return driver.findElement(lastNameTxtFld);
    }

    public WebElement birthDayScrlPn() {
        By birthDayScrlPn = By.name("DateOfBirthDay");
        return driver.findElement(birthDayScrlPn);
    }

    public WebElement day19() {
        By day19 = By.cssSelector("select[name=\"DateOfBirthDay\"] > option[value=\"7\"]");
        return driver.findElement(day19);
    }

    public WebElement birthMonthScrlPn() {
        By birthMonthScrlPn = By.name("DateOfBirthMonth");
        return driver.findElement(birthMonthScrlPn);
    }

    public WebElement month7() {
        By month7 = By.cssSelector("select[name=\"DateOfBirthMonth\"] > option[value=\"7\"]");
        return driver.findElement(month7);
    }

    public WebElement birthYearScrlPn() {
        By birthYearScrlPn = By.name("DateOfBirthYear");
        return driver.findElement(birthYearScrlPn);
    }

    public WebElement year1995() {
        By year1995 = By.cssSelector("option[value=\"1995\"]");
        return driver.findElement(year1995);
    }

    public WebElement emailAddressTxtFld() {
        By emailAddressTxtFld = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTxtFld);
    }

    public String registerEmail() {
        return "fortestingpurpose@udacity.com";
    }

    public WebElement passwordTxtFld() {
        By passwordTxtFld = By.id("Password");
        return driver.findElement(passwordTxtFld);
    }

    public String registerPassword() {
        return "Ahmed@1";
    }

    public WebElement confirmPassTxtFld() {
        By confirmPassTxtFld = By.id("ConfirmPassword");
        return driver.findElement(confirmPassTxtFld);
    }

    public WebElement registerButton() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement registrationCompletedMsg() {
        By registrationCompletedMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(registrationCompletedMsg);
    }

    public WebElement passwordErrorMsg() {
        By passwordErrorMsg = By.id("Password-error");
        return driver.findElement(passwordErrorMsg);
    }


}
