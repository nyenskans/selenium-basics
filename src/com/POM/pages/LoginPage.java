package com.POM.pages;

import com.POM.testbase.BaseClass;
import com.POM.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {
    // we store all the elements of LoginPage in this class:

    // we initialize the webDriver here by extending to BaseClass
    public WebElement username = driver.findElement(By.id("txtUsername"));
    public WebElement password = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));

}
