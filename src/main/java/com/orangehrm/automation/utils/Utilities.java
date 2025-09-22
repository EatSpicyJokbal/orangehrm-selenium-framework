package com.orangehrm.automation.utils;

import org.openqa.selenium.WebDriver;

import com.orangehrm.automation.base.BasePage;

public class Utilities {
    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }
}
