package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {
    WebDriver driver;

    // Constructor
    public LoginForm(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By EmailField = By.id("email");
    By PasswordField = By.id("password");
    By LoginBtn = By.cssSelector("button[type='submit'] span[class='overflow-hidden absolute inset-0 rounded-lg']");

    // Actions
    public WebElement Email_Field() {
        return driver.findElement(EmailField);
    }

    public WebElement Password_Field() {
        return driver.findElement(PasswordField);
    }

    public WebElement Login_Button() {
        return driver.findElement(LoginBtn);
    }
}