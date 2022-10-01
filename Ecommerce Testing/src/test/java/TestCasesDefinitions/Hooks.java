package TestCasesDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
    public static WebDriver driver;

    @BeforeAll
    public static void user_opens_browser() {
        WebDriverManager.chromedriver().setup();
     // Creating new driver from ChromeDriver & maximize window.
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Sleep for 1 sec & Quits Chrome Browser.
    @AfterAll
    public static void chrome_browser_quits() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
