import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.io.File;

public class FacebookIcon
{
    WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException
    {
        String Chromepath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", Chromepath);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("facebook")).click();
        Thread.sleep(5000L);
        driver.close();


    }
}
