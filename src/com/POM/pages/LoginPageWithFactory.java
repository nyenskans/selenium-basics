package com.POM.pages;

import com.POM.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class LoginPageWithFactory extends CommonMethods {

    // 1. declare elements with Selenium annotation @FindBy:
    @FindBy(id = "txtUsername")
    public WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy (css = "input#btnLogin")
    public WebElement loginButton;

    // 2. create a constructor to initialize variables/objects/elements (all with just one line of code)
    public LoginPageWithFactory(){
        PageFactory.initElements(driver, this);
        // PageFactory class.initialize elements (driver initializes elements, keyword this because the elements are stored in this page)
    }




}
