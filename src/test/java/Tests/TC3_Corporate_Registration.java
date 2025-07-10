package Tests;

import Pages.CorporateForm;
import Pages.Homepage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static PageResources.Resources.*;

public class TC3_Corporate_Registration {
    WebDriver driver;
    Homepage HomePageD;
    CorporateForm CorporateD;
    JavascriptExecutor js;

    @BeforeClass
    public void SetUp() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        HomePageD = new Homepage(driver);
        CorporateD = new CorporateForm(driver);
        js = (JavascriptExecutor) driver;
    }

    @Test(priority = 0)
    public void Open_Registration_Form() throws InterruptedException {
        driver.navigate().to(HomePageURL);
        Thread.sleep(2000);
        HomePageD.Sing_in_Button().click();
        HomePageD.Create_an_Account_Button().click();
        HomePageD.Join_as_Corporate().click();
        Thread.sleep(1500);
    }

    @Test(priority = 1)
    public void Fill_The_Form() throws InterruptedException {
        CorporateD.First_Name().sendKeys(First_name);
        CorporateD.Last_Name().sendKeys(Last_name);
        CorporateD.CorporateName().sendKeys(CorporateName);
        CorporateD.Corporate_Job_Title().sendKeys(JobTitle);
        CorporateD.Phone_Number().sendKeys(Corporate_PhoneNumber);
        CorporateD.Email().sendKeys(Corporate_Email);
        CorporateD.Password().sendKeys(Password);
        CorporateD.Corporate_Logo().sendKeys(SelectCorporateLogo());
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        CorporateD.RegisterButton().click();
    }

    @AfterClass
    public void TearDown() throws InterruptedException {
        Thread.sleep(2000);
//        driver.quit();
        System.out.println(Corporate_Email + "\n" + Password);

    }
}
