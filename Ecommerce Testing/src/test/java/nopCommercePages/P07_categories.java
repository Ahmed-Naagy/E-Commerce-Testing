package nopCommercePages;

// This class defines Categories webpage elements.

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static TestCasesDefinitions.Hooks.driver;

public class P07_categories {

    /*
    Categories Page Elements
     */

    // Desktops Sub Category URL:
    public String desktopsSubCategoryURL() {
        return "https://demo.nopcommerce.com/desktops";
    }

    // Digital Storm PC product title:
    public WebElement digitalStormPCProductTitle() {
        By digitalStormPCProductTitle = By.cssSelector("h2[class=\"product-title\"] > a[href=\"/digital-storm-vanquish-3-custom-performance-pc\"]");
        return driver.findElement(digitalStormPCProductTitle);
    }

    // Shoes SubCategory in LIST BOX:
    public WebElement shoesSubCategory() {
        By shoesSubCategory = By.cssSelector("li[class=\"inactive\"] > a[href=\"/shoes\"]");
        return driver.findElement(shoesSubCategory);
    }

    // Shoes SubCategory Red Color Checkbox.
    public WebElement shoesRedCheckBox() {
        By shoesRedCheckbox = By.cssSelector("li[class=\"item color-item\"] > input[id=\"attribute-option-15\"]");
        return driver.findElement(shoesRedCheckbox);
    }

    // Adidas Consortium Campus 80s Product Title.
    public WebElement adidasConsortiumCampus80sProduct() {
        By adidasConsortiumCampus80sProduct = By.cssSelector("h2[class=\"product-title\"] > [href=\"/adidas-consortium-campus-80s-running-shoes\"]");
        return driver.findElement(adidasConsortiumCampus80sProduct);

    }


    /*
    TAGS >>>
     */

    // Awesome Tag located in Popular Tags.
    public WebElement awesomeTag() {
        By awesomeTag = By.cssSelector("a[href=\"/awesome\"]");
        return driver.findElement(awesomeTag);
    }

    // Awesome Tag URL once clicked.
    public String awesomeTagURL() {
        return "https://demo.nopcommerce.com/awesome";
    }

    // Tag URL > page title element.
    public WebElement tagsPageTitle() {
        By tagsPageTitle = By.cssSelector("div[class=\"page-title\"]:first-child");
        return driver.findElement(tagsPageTitle);
    }

    // Cool Tag located in Popular Tags.
    public WebElement coolTag() {
        By coolTag = By.cssSelector("a[href=\"/cool\"]");
        return driver.findElement(coolTag);
    }

    // Cool Tag URL once clicked.
    public String coolTagURL() {
        return "https://demo.nopcommerce.com/cool";
    }



    /*
    Shopping Cart elements in Categories Page.
     */

    // Digital Storm Vanquish 3 add to cart button.
    public WebElement digitalStormVanquish3_addToCartButton() {
        By digitalStormVanquish3_addToCartButton = By.cssSelector("div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button");
        return driver.findElement(digitalStormVanquish3_addToCartButton);
    }

    // Bar Notification Element.
    public WebElement barNotification() {
        By barNotification = By.cssSelector("#bar-notification > div > p");
        return driver.findElement(barNotification);
    }

    // Bar Message Notification close button.
    public WebElement barNotification_closeButton() {
        By productAddedToCartMsg_closeButton = By.cssSelector("#bar-notification > div > span");
        return driver.findElement(productAddedToCartMsg_closeButton);
    }

    // Lenovo Idea Centre 600 add to cart button.
    public WebElement lenovoIdeaCentre600_addToCartButton() {
        By lenovoIdeaCentre600_addToCartButton = By.cssSelector("div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button");
        return driver.findElement(lenovoIdeaCentre600_addToCartButton);
    }

    // Shopping Cart button located in header.
    public WebElement shoppingCart_header() {
      By shoppingCart_header =  By.cssSelector("a[href=\"/cart\"] > span[class=\"cart-label\"]");
      return driver.findElement(shoppingCart_header);
    }


    /*
    Wishlist elements in Categories Page.
     */

    // Digital Storm Vanquish 3 Wishlist Button element.
    public WebElement digitalStormVanquish3_wishListButton() {
        By digitalStormVanquish3_WishListButton = By.cssSelector("div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");
        return driver.findElement(digitalStormVanquish3_WishListButton);
    }

    // Lenovo Idea Centre 600 Wishlist Button element.
    public WebElement lenovoIdeaCentre600_wishListButton() {
        By lenovoIdeaCentre600_wishListButton = By.cssSelector("div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");
        return driver.findElement(lenovoIdeaCentre600_wishListButton);
    }

    // Wishlist button label located in header.
    public WebElement wishList_headerLabel() {
        By wishList_headerLabel = By.cssSelector("span[class=\"wishlist-label\"]");
        return driver.findElement(wishList_headerLabel);
    }


    /*
     Compare list elements in Categories Page.
     */

    // Digital Storm Vanquish 3 add to compare list button.
    public WebElement digitalStormVanquish3_compareListButton() {
        By digitalStormVanquish3_compareListButton = By.cssSelector("div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-compare-list-button");
        return driver.findElement(digitalStormVanquish3_compareListButton);
    }

    // Lenovo Idea Centre 600 add to compare list button.
    public WebElement lenovoIdeaCentre600_compareListButton() {
        By lenovoIdeaCentre600_compareListButton = By.cssSelector("div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-compare-list-button");
        return driver.findElement(lenovoIdeaCentre600_compareListButton);
    }

    // Product comparison clickable text link in bar notification.
    public WebElement productComparison_barNotification() {
        By productComparison_barNotification = By.cssSelector("#bar-notification > div > p > a");
        return driver.findElement(productComparison_barNotification);
    }



}
