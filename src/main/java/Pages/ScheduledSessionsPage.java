package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScheduledSessionsPage {
    JavascriptExecutor js;
    WebDriver driver;
    // Constructor
    public ScheduledSessionsPage(WebDriver driver){
        this.driver = driver;
    }
    // Locators
    By ScheduledSessionBookBtn = By.cssSelector("div[class='pt-4 mt-auto'] a");
    By BookYourSeatBtn = By.cssSelector("div[class='flex gap-3'] button");
    // Actions
    public WebElement Book_Session_Button(){
        return driver.findElements(ScheduledSessionBookBtn).get(5);
    }
    public void Scroll_To_Book_Button(){
        js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(ScheduledSessionBookBtn);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public WebElement Book_Your_Seat(){
        return driver.findElement(BookYourSeatBtn);
    }
}
