package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static PageResources.Resources.*;

public class LearnerForm {
    // Constructor
    WebDriver driver;

    public LearnerForm(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By FirstNameField = By.id("first_name");
    By LastNameField = By.id("last_name");
    By GenderField = By.id("gender");
    By PhoneNumberField = By.id("phone_number");
    By GovernorateField = By.id("governorate_id");
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

    public void Select_Gender() {
        Select Gender = new Select(driver.findElement(GenderField));
        Gender.selectByIndex(generateRandomGenderIndex());
    }

    public void Select_Governorate() {
        Select Governorate = new Select(driver.findElement(GovernorateField));
        Governorate.selectByIndex(1);
    }

}
