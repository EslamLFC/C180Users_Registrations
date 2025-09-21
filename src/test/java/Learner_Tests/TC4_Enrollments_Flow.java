package Learner_Tests;

import Pages.CheckoutPage;
import Pages.CoursesPage;
import Pages.Homepage;
import Pages.LoginForm;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


import java.time.Duration;

import static PageResources.Resources.*;

public class TC4_Enrollments_Flow {
    WebDriver driver;
    Homepage HomePageD;
    LoginForm LoginD;
    CheckoutPage CheckoutD;
    JavascriptExecutor js;
    SoftAssert softAssert;
    CoursesPage CourseD;

    @BeforeClass
    public void SetUp() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        HomePageD = new Homepage(driver);
        LoginD = new LoginForm(driver);
        CheckoutD = new CheckoutPage(driver);
        CourseD = new CoursesPage(driver);
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

    @Test(priority = 1/*, enabled = false*/)
    public void Subscribe() throws InterruptedException {
        js.executeScript("window.scrollBy(0,3500)");
        Thread.sleep(1000);
        try {
            HomePageD.Subscription_Plans().click();
            Thread.sleep(1500);
            CheckoutD.Promo_Code().sendKeys(PromoCode);
            CheckoutD.Apply_discount().click();
            Thread.sleep(1000);
            CheckoutD.Get_For_Free().click();
            Thread.sleep(4000);
            Assert.assertTrue(CheckoutD.Success_Page_Icon().isDisplayed(), "Successfully Subscribed page wasn't opened");
        } catch (Exception e) {
            System.out.println(e + "\n" + "User Already Subscribed");
        }
    }

    @Test(priority = 2)
    public void Course_Enrollment() throws InterruptedException {
        HomePageD.Qualifying_Menu().click();
        Thread.sleep(500);
        HomePageD.Recorded_Course().click();
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(2000);
        CourseD.View_Course().click();
        Thread.sleep(2000);
        try {
            CourseD.Read_More().click();
        } catch (Exception e) {
            System.out.println("Description isn't long" + "\n" + e);
        }
        Thread.sleep(1000);
        CourseD.Scroll_To_Enroll_Button();
        CourseD.Enroll_Now().click();
        Thread.sleep(3000);
//        driver.navigate().back();
    }

    @AfterClass
    public void TearDown() throws InterruptedException {
        Thread.sleep(5000);
//        driver.quit();
        softAssert.assertAll();
    }
}
