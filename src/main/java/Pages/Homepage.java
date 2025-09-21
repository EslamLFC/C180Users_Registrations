package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static PageResources.Resources.*;

public class Homepage {
    // Constructor
    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By Register_Now_Btn = By.cssSelector("div[class='hidden md:block lg:block'] a[href='https://staging-career-180.com/en/auth/register/user']");
    By Sing_inBtn = By.cssSelector("body > header:nth-child(1) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(1) > button:nth-child(4) > span:nth-child(1)");
    By Create_AccountBtn = By.cssSelector("a[href='https://staging-career-180.com/en/auth/register/user?redirectUrl=https://staging-career-180.com/en/home']");
    // Learner Form Button
    By JoinLearner = By.cssSelector("a[href='https://staging-career-180.com/en/auth/register/user?redirectUrl=https://staging-career-180.com/en/home']");
    // Corporate Form Button
    By JoinCorporate = By.cssSelector("a[href='https://staging-career-180.com/en/auth/register/corporate']");
    // Expert Form Button
    By JoinExpert = By.cssSelector("a[href='https://staging-career-180.com/en/auth/register/expert']");
    By NotificationBellIcon = By.cssSelector("body > header:nth-child(1) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1) > i:nth-child(1)");
    By SubscriptionPlansBtns = By.cssSelector("a[href][class='block px-6 py-3 w-full text-sm font-medium text-center text-white rounded-md rounded-t-none transition-colors duration-200 bg-primary-600 hover:bg-primary-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-primary-500 dark:focus:ring-offset-gray-900']");
    By QualifyingMenu = By.cssSelector("button[id='hs-navbar-example-dropdown']");
    By RecordedCoursesTab = By.cssSelector("div[class='hs-dropdown [--strategy:static] sm:[--strategy:fixed] [--adaptive:none] open'] a:nth-child(1)");
    By VacanciesAndInternshipsMenu = By.cssSelector("button[id='hs-navbar-example-dropdown']");
    By ExploreVacanciesTab = By.cssSelector("div[class='hs-dropdown [--strategy:static] sm:[--strategy:fixed] [--adaptive:none] open'] a:nth-child(1)");
    By ScheduledSessionsTab = By.cssSelector("body > header:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(3)");
    // Actions
    public WebElement Sing_in_Button() {
        return driver.findElement(Sing_inBtn);
    }

    public WebElement Register_Now_Button() {
        return driver.findElement(Register_Now_Btn);
    }

    public WebElement Create_an_Account_Button() {
        return driver.findElement(Create_AccountBtn);
    }

    public WebElement Join_as_Learner() {
        return driver.findElement(JoinLearner);
    }

    public WebElement Join_as_Corporate() {
        return driver.findElement(JoinCorporate);
    }

    public WebElement Join_as_Expert() {
        return driver.findElement(JoinExpert);
    }
    public WebElement Notifications_Bell_Icon(){
        return driver.findElement(NotificationBellIcon);
    }
    public WebElement Subscription_Plans(){
        return driver.findElements(SubscriptionPlansBtns).get(generateRandomSubscribeIndex());
    }
    public WebElement Qualifying_Menu(){
        return driver.findElements(QualifyingMenu).getFirst();
    }
    public WebElement Recorded_Course(){
        return driver.findElement(RecordedCoursesTab);
    }
    public WebElement Vacancies_Menu(){
        return driver.findElements(VacanciesAndInternshipsMenu).get(1);
    }
    public WebElement Explore_Vacancies(){
        return driver.findElement(ExploreVacanciesTab);
    }
    public WebElement Scheduled_Sessions_Tab(){
        return driver.findElement(ScheduledSessionsTab);
    }
}
