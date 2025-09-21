package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourseWatchingPage {
    JavascriptExecutor js;
    WebDriver driver;

    // Constructor
    public CourseWatchingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By PlayBtn = By.cssSelector("button[class='plyr__controls__item plyr__control'][data-plyr='play']");
    By Skip10 = By.cssSelector("img[alt='Skip forward']");

    // Actions
    public WebElement Play_Button(){
        return driver.findElement(PlayBtn);
    }
    public WebElement Skip_10Sec(){
        return driver.findElement(Skip10);
    }
}
