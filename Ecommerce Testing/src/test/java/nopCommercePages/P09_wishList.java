package nopCommercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static TestCasesDefinitions.Hooks.driver;

public class P09_wishList {

    // Defines Wish List URL:
    public String wishListURL() {
        return "https://demo.nopcommerce.com/wishlist";
    }


    // Digital Storm Vanquish 3 product text label.
    public WebElement digitalStormVanquish3_productTxtLabel() {
        By digitalStormVanquish3_wishList_productTxtLabel = By.cssSelector("td[class=\"product\"] > a[href=\"/digital-storm-vanquish-3-custom-performance-pc\"]");
        return driver.findElement(digitalStormVanquish3_wishList_productTxtLabel);
    }

    // Lenovo Idea Centre 600 product text label.
    public WebElement lenovoIdeaCentre600_productTxtLabel() {
        By lenovoIdeaCentre600_productTxtLabel = By.cssSelector("td[class=\"product\"] > a[href=\"/lenovo-ideacentre-600-all-in-one-pc\"]");
        return driver.findElement(lenovoIdeaCentre600_productTxtLabel);
    }

    // Digital Storm Vanquish 3 "Wishlist Remove Button".
    public WebElement digitalStormVanquish3_wishListRemoveButton() {
        By digitalStormVanquish3_wishListRemoveButton = By.cssSelector("tr:nth-child(1) > td.remove-from-cart > button");
        return driver.findElement(digitalStormVanquish3_wishListRemoveButton);
    }

}
