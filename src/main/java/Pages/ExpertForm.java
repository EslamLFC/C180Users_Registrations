package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExpertForm {
    // Constructor
    WebDriver driver;

    public ExpertForm(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By FirstNameField = By.id("first_name");
    By LastNameField = By.id("last_name");
    By JobTitleField = By.id("job_title");
    By PhoneNumberField = By.id("phone_number");
    By CareerInterestField = By.id("career_id");
    By LinkedInFiled = By.id("linkedin");
    By EmailField = By.id("email");
    By PasswordField = By.id("password");
    By RegisterBtn = By.cssSelector("button[class='flex justify-center w-full px-4 py-2 text-sm font-medium text-white transition-colors duration-200 border border-transparent rounded-md shadow-sm bg-primary-600 hover:bg-primary-700 focus:outline-none focus:ring-2 focus:ring-primary-500 focus:ring-offset-2 dark:focus:ring-offset-gray-900 disabled:opacity-50 disabled:cursor-not-allowed']");

    // Actions
    public WebElement First_Name() {
        return driver.findElement(FirstNameField);
    }

    public WebElement Last_Name() {
        return driver.findElement(LastNameField);
    }

    public WebElement Phone_Number() {
        return driver.findElement(PhoneNumberField);
    }

    public WebElement Email() {
        return driver.findElement(EmailField);
    }

    public WebElement Password() {
        return driver.findElement(PasswordField);
    }

    public WebElement RegisterButton() {
        return driver.findElement(RegisterBtn);
    }

    public WebElement Job_Title() {
        return driver.findElement(JobTitleField);
    }

    public WebElement LinkedIn_Account() {
        return driver.findElement(LinkedInFiled);
    }

    public void Select_Career_Interest() {
        Select Career_interest = new Select(driver.findElement(CareerInterestField));
        Career_interest.selectByIndex(4);
    }
}
