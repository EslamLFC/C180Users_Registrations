package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursesPage {
    JavascriptExecutor js;
    WebDriver driver;

    // Constructor
    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By ViewCourseBtn = By.cssSelector("a[target='_self'][aria-label='View details']");
    By ReadMoreBtn = By.cssSelector("div[class='prose text-gray-600 max-w-none break-words read-more-initialized'] button[class='read-more-btn text-sm font-medium']");
    By EnrollNowBtn = By.cssSelector("a[class='inline-flex items-center px-8 py-3 text-base font-medium text-white transition-colors duration-200 border border-transparent rounded-md bg-primary-600 hover:bg-primary-700']");
    //Actions
    public WebElement View_Course(){
        return driver.findElements(ViewCourseBtn).get(2);
    }
    public WebElement Read_More(){
        return driver.findElements(ReadMoreBtn).getFirst();
    }
    public void Scroll_To_Enroll_Button(){
        js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(EnrollNowBtn);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public WebElement Enroll_Now(){
        return driver.findElement(EnrollNowBtn);
    }
}
