package Tests;

import Pages.ExpertForm;
import Pages.Homepage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static PageResources.Resources.*;

public class TC2_Expert_Registration {
    WebDriver driver;
    Homepage HomePageD;
    ExpertForm ExpertD;
    JavascriptExecutor js;

    @BeforeClass
    public void SetUp() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        HomePageD = new Homepage(driver);
        ExpertD = new ExpertForm(driver);
        js = (JavascriptExecutor) driver;
    }

    @Test(priority = 0)
    public void Open_Registration_Form() throws InterruptedException {
        driver.navigate().to(HomePageURL);
        Thread.sleep(2000);
        HomePageD.Sing_in_Button().click();
        HomePageD.Create_an_Account_Button().click();
        HomePageD.Join_as_Expert().click();
        Thread.sleep(1500);
    }

    @Test(priority = 1)
    public void Fill_The_Form() throws InterruptedException {
        ExpertD.First_Name().sendKeys(First_name);
        ExpertD.Last_Name().sendKeys(Last_name);
        ExpertD.Phone_Number().sendKeys(Expert_PhoneNumber);
        ExpertD.Job_Title().sendKeys(JobTitle);
        ExpertD.Select_Career_Interest();
        ExpertD.LinkedIn_Account().sendKeys(LinkedInAccount);
        ExpertD.Email().sendKeys(Expert_Email);
        ExpertD.Password().sendKeys(Password);
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        ExpertD.RegisterButton().click();
    }

    @AfterClass
    public void TearDown() throws InterruptedException {
        Thread.sleep(2000);
//        driver.quit();
        System.out.println(Expert_Email + "\n" + Password);
    }
}
