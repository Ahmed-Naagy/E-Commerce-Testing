
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenFacebook {
    WebDriver driver = null;
    Loginpage login;

    public OpenFacebook() {
    }

    public static void main(String[] args) throws InterruptedException {
        String Chromepath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", Chromepath);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).click();
        driver.findElement(By.id("login-username")).sendKeys(new CharSequence[]{"AhmedNagy@yahoo.com"});
        driver.findElement(By.id("login-signin")).click();
        Thread.sleep(5000L);
        driver.close();
    }

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String Chromepath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", Chromepath);
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        Thread.sleep(3000L);
        this.login = new Loginpage();
    }

    @Test
    public void validdata() {
        this.driver.navigate().to("https://www.facebook.com");
        this.login.LoginSteps(this.driver, "tomsmith", "SuperSecertPassword!");
        String ExpectedResult = "You Logged into Sucure Area";
        String ActualResult = this.driver.findElement(By.id("flash")).getText();
        System.out.println("Print First Assetion");
        Assert.assertFalse(ActualResult.contains(ExpectedResult));
        Assert.assertFalse(ActualResult.contains(ExpectedResult));
        System.out.println("Print Third Assetion");
        System.out.println(this.driver.getCurrentUrl());
        Assert.assertEquals(this.driver.getCurrentUrl(), "https://www.facebook.com");
    }

    @Test
    public void invaliddata() {
        this.driver.navigate().to("https://www.facebook.com);
        this.login.LoginSteps(this.driver, "Invalid", "Super");
        String ActualResult = this.driver.findElement(By.id("flash")).getText();
        System.out.println("actual" + ActualResult);
        String ExpectedResult = "Your username is valid";
        Assert.assertFalse(ActualResult.contains(ExpectedResult), "Error Messagge : Text is wrong");
    }

    @AfterTest
    public void CloseDriver() {
        this.driver.close();
    }
}

