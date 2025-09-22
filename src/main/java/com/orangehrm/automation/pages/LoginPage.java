package com.orangehrm.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.automation.base.BasePage;
import static com.orangehrm.automation.utils.WaitUtility.fluentWaitUntilVisible;

public class LoginPage extends BasePage{
    private final By usernameInput = By.xpath("//div[@id='app']//input[@name='username']");
    private final By passwordInput = By.xpath("//div[@id='app']//input[@name='password']");

    private final By loginButton = By.xpath("//div[@id='app']//button[@type='submit']");

    // ✅ Constructor passes driver up to BasePage
    public LoginPage(WebDriver driver) {
        super();
    }

    public void setUsername(String username) {
        fluentWaitUntilVisible(usernameInput, 10);
        set(usernameInput, username);
    }

    public void setPassword(String password) {
        set(passwordInput, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
