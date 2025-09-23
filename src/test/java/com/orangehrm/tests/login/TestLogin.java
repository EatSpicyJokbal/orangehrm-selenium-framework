package com.orangehrm.tests.login;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.orangehrm.tests.BaseTest;

public class TestLogin extends BaseTest {

    @Test
    public void testValidLogin() {
        String username = "Admin";
        String password = "admin123";

        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        String actualOutput = loginPage.getDashboardTitle();
        String expectedOutput = "Dashboard";

        assertEquals(expectedOutput, actualOutput, "Expected and Actual Title doesn't match");
    }

    @Test
    public void testInvalidLogin() {
        String username = "invalidUser";
        String password = "invalidPass";

        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        String actualOutput = loginPage.getInvalidCredentials();
        String expectedOutput = "Invalid credentials";

        assertEquals(expectedOutput, actualOutput, "Expected and Actual Title doesn't match");

    }

}
