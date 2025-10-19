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
    By CountryCodeField = By.cssSelector("select[class='block mt-1 w-full rounded-md border-gray-300 shadow-sm focus:border-primary-500 focus:ring-primary-500 dark:border-gray-600 dark:bg-gray-700 dark:text-white sm:text-sm max-w-36']");
    By CountryCodeMenu = By.cssSelector("button[aria-expanded='false']");
    By CountryCodeOptions = By.cssSelector("button[class='w-full px-2 py-1.5 text-sm flex flex-row items-center gap-x-3 rounded-lg focus:outline-none focus:bg-gray-100 dark:focus:bg-neutral-700 transition-colors duration-100 text-gray-800 dark:text-neutral-300 hover:bg-gray-100 dark:hover:bg-neutral-700']");
    By GovernorateField = By.id("governorate_id");
    By EmailField = By.id("email");
    By PasswordField = By.id("password");
    By RegisterBtn = By.cssSelector("button[class='flex justify-center px-4 py-2 w-full text-sm font-medium text-white rounded-md border border-transparent shadow-sm transition-colors duration-200 bg-primary-600 hover:bg-primary-700 focus:outline-none focus:ring-2 focus:ring-primary-500 focus:ring-offset-2 dark:focus:ring-offset-gray-900 disabled:opacity-50 disabled:cursor-not-allowed']");

    // Actions
    public WebElement First_Name() {
        return driver.findElement(FirstNameField);
    }

    public WebElement Last_Name() {
        return driver.findElement(LastNameField);
    }

    public WebElement CountryCode_Filed() {
        return driver.findElement(CountryCodeField);
    }
    public WebElement Country_Code_Menu (){
        return driver.findElement(CountryCodeMenu);
    }
    public WebElement Country_Code_Option(){
        return driver.findElements(CountryCodeOptions).get(3);
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
