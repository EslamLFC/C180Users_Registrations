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
    By ScheduledSessionBookBtn = By.cssSelector("a[href='https://staging-career-180.com/en/qualifying/scheduled_sessions/data-driven-decision-making-using-analytics-in-education'][class='hover:text-primary-700 dark:hover:text-primary-300 transition-colors']");
    By BookYourSeatBtn = By.cssSelector("button[class='inline-flex items-center px-4 py-2 text-sm font-medium text-white transition-colors border border-transparent rounded-md bg-primary-600 hover:bg-primary-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-primary-500 disabled:opacity-50 disabled:cursor-not-allowed']");
    // Actions
    public WebElement Book_Session_Button(){
        return driver.findElement(ScheduledSessionBookBtn);
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
