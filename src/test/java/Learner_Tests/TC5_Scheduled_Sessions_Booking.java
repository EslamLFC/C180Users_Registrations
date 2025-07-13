package Learner_Tests;

import Pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static PageResources.Resources.*;

public class TC5_Scheduled_Sessions_Booking {
    WebDriver driver;
    Homepage HomePageD;
    LoginForm LoginD;
    ScheduledSessionsPage ScheduledSessionD;
    JavascriptExecutor js;
    SoftAssert softAssert;

    @BeforeClass
    public void SetUp() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        HomePageD = new Homepage(driver);
        LoginD = new LoginForm(driver);
        ScheduledSessionD = new ScheduledSessionsPage(driver);
        js = (JavascriptExecutor) driver;
        softAssert = new SoftAssert();
    }

    @Test(priority = 0)
    public void Login() throws InterruptedException {
        driver.navigate().to(HomePageURL);
        Thread.sleep(1000);
        HomePageD.Sing_in_Button().click();
        LoginD.Email_Field().sendKeys(Login_Email);
        LoginD.Password_Field().sendKeys(Password);
        LoginD.Login_Button().click();
        Thread.sleep(4000);
        softAssert.assertTrue(HomePageD.Notifications_Bell_Icon().isDisplayed(), "Login Failed");
    }

    @Test (priority = 1)
    public void Book_Sessions() throws InterruptedException{
        HomePageD.Scheduled_Sessions_Tab().click();
        Thread.sleep(2000);
        ScheduledSessionD.Scroll_To_Book_Button();
        Thread.sleep(1000);
        ScheduledSessionD.Book_Session_Button().click();
        Thread.sleep(2000);
        ScheduledSessionD.Book_Your_Seat().click();
    }


    @AfterClass
    public void TearDown() throws InterruptedException {
        Thread.sleep(5000);
//        driver.quit();
        softAssert.assertAll();
    }

}
