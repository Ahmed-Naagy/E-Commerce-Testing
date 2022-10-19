import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage
{
    //Wrong stip
    //WebDriver driver=null;
    public WebElement usernamePom( WebDriver driver)
    {
        By username= By.id("username");
        WebElement userelm=driver.findElement(username);
        return userelm;
    }

    public WebElement passwordPom( WebDriver driver)
    {
        By password= By.name("password");
        WebElement passwordEle=driver.findElement(password);
        return passwordEle;
    }
    public void LoginSteps(WebDriver driver, String username,String password)
    {
        //Loin
        usernamePom(driver).clear();
        usernamePom(driver).sendKeys(username);
        passwordPom(driver).sendKeys(password);
        passwordPom(driver).sendKeys(Keys.ENTER);
    }
}

