package com.Homework.utils;

import org.openqa.selenium.WebDriver;

public class CommonMethods {
    public static void openBrowser(WebDriver driver, String url){
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void closeBrowser(WebDriver driver){
        driver.quit();
    }
}
