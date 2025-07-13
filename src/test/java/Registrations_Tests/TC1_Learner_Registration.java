package Registrations_Tests;

import Pages.Homepage;
import Pages.LearnerForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static PageResources.Resources.*;

public class TC1_Learner_Registration {
    WebDriver driver;
    Homepage HomePageD;
    LearnerForm LearnerD;

    @BeforeClass
    public void SetUp() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        HomePageD = new Homepage(driver);
        LearnerD = new LearnerForm(driver);
    }

    @Test(priority = 0)
    public void Open_Registration_Form() throws InterruptedException {
        driver.navigate().to(HomePageURL);
        Thread.sleep(2000);
        HomePageD.Sing_in_Button().click();
        HomePageD.Create_an_Account_Button().click();
        HomePageD.Join_as_Learner().click();
        Thread.sleep(1500);
    }

    @Test(priority = 1)
    public void Fill_The_Form() throws InterruptedException {
        LearnerD.First_Name().sendKeys(First_name);
        LearnerD.Last_Name().sendKeys(Last_name);
        LearnerD.Select_Gender();
        LearnerD.Phone_Number().sendKeys(Learner_PhoneNumber);
        LearnerD.Select_Governorate();
        LearnerD.Email().sendKeys(Learner_Email);
        LearnerD.Password().sendKeys(Password);
        Thread.sleep(1000);
        LearnerD.RegisterButton().click();
    }

    @AfterClass
    public void TearDown() throws InterruptedException {
        Thread.sleep(2000);
//        driver.quit();
        System.out.println(Learner_Email + "\n" + Password);

    }
}
