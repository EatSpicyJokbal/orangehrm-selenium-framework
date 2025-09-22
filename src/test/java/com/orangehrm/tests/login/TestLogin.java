package com.orangehrm.tests.login;

import org.testng.annotations.Test;

import com.orangehrm.tests.BaseTest;

public class TestLogin extends BaseTest {

    @Test
    public void testLogin() {
        String username = "Admin";
        String password = "admin123";
        
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
    }

}
