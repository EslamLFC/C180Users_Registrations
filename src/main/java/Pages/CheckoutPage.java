package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By PromoCodeField = By.cssSelector("input[placeholder='Promo Code']");
    By ApplyDiscountBtn = By.cssSelector("div[class='pt-2'] button");
    By GetForFreeBtn = By.cssSelector("div[class='p-6 bg-white border border-gray-200 rounded-lg dark:bg-gray-800 dark:border-gray-700'] button");
    By SuccessPage = By.cssSelector("img[class='h-24 w-auto mb-3']");

    // Actions
    public WebElement Promo_Code() {
        return driver.findElement(PromoCodeField);
    }

    public WebElement Apply_discount() {
        return driver.findElement(ApplyDiscountBtn);
    }

    public WebElement Get_For_Free() {
        return driver.findElement(GetForFreeBtn);
    }
    public WebElement Success_Page_Icon(){
        return driver.findElement(SuccessPage);
    }
}
