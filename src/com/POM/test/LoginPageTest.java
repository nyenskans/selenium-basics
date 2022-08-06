package com.POM.test;

import com.POM.pages.LoginPage;
import com.POM.testbase.BaseClass;

public class LoginPageTest extends LoginPage {
    public static void main(String[] args) {
        // just for practice purposes we use main method, but one we finish testng we will be using only @Test

        // first step in test is to set property and initialize driver, we do that by calling method open() from BaseClass
        // it is a static method so we can just call it by writing class name.method name:
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // we are able to this above regardless of extending the class

        // to access WebElements from LoginPage class, we have to create an object of that class
        // just extending the class wouldn't help because the variables are not static
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();


        // to close browser, we call method from BaseClass:
        BaseClass.tearDown();
    }
}
