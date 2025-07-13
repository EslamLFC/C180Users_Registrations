package Login_Subscribe_Tests;

import Pages.CheckoutPage;
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

public class TC4_Learner_Login {
    WebDriver driver;
    Homepage HomePageD;
    LoginForm LoginD;
    CheckoutPage CheckoutD;
    JavascriptExecutor js;
    SoftAssert softAssert;

    @BeforeClass
    public void SetUp() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        HomePageD = new Homepage(driver);
        LoginD = new LoginForm(driver);
        CheckoutD = new CheckoutPage(driver);
        js = (JavascriptExecutor) driver;
        softAssert = new SoftAssert();
    }

    @Test(priority = 0)
    public void LoginForm() throws InterruptedException {
        driver.navigate().to(HomePageURL);
        Thread.sleep(1000);
        HomePageD.Sing_in_Button().click();
        LoginD.Email_Field().sendKeys(Login_Email);
        LoginD.Password_Field().sendKeys(Password);
        LoginD.Login_Button().click();
        Thread.sleep(4000);
        softAssert.assertTrue(HomePageD.Notifications_Bell_Icon().isDisplayed(), "Login Failed");
    }

    @Test(priority = 1)
    public void Subscribe() throws InterruptedException {
        js.executeScript("window.scrollBy(0,2500)");
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

    @AfterClass
    public void TearDown() throws InterruptedException {
        Thread.sleep(5000);
//        driver.quit();
        softAssert.assertAll();
    }
}
