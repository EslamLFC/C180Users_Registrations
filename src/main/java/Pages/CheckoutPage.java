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
    By ApplyDiscountBtn = By.cssSelector("button[class='px-4 py-2 text-sm font-medium text-white transition-colors duration-200 rounded-md bg-primary-600 hover:bg-primary-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-primary-500 dark:focus:ring-offset-gray-900']");
    By GetForFreeBtn = By.cssSelector("button[class='w-full px-6 py-3 text-base font-medium text-white transition-colors duration-200 bg-green-600 rounded-md shadow-sm hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-green-500 disabled:opacity-50 disabled:cursor-not-allowed dark:focus:ring-offset-gray-900']");
    By SuccessPage = By.cssSelector("img[class='h-24 w-auto']");

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
