package com.orangehrm.automation.pages;

import org.openqa.selenium.By;

import com.orangehrm.automation.base.BasePage;

public class LoginPage extends BasePage{
    private final By usernameInput = By.xpath("//div[@id='app']//input[@name='username']");
    private final By passwordInput = By.xpath("//div[@id='app']//input[@name='password']");

    private final By loginButton = By.xpath("//div[@id='app']//button[@type='submit']");


    public void setUsername(String username) {
        set(usernameInput, username);
    }

    public void setPassword(String password) {
        set(passwordInput, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
