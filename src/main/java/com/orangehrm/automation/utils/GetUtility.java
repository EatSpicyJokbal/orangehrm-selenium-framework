package com.orangehrm.automation.utils;

import org.openqa.selenium.By;

public class GetUtility extends Utilities {

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

}
