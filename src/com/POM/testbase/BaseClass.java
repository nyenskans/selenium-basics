package com.POM.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
// we moved WebDriver from method open() to the class to make it an instance variable,
// so we could use it in all methods of this class - has to be static because the methods are static

    // When we create methods in baseClass/common methods, we should write a comment/javadoc with an explanation of what it does:
    /**
     *     This method will navigate to a website by the given url -->  this type of comment is called javadoc
     *      @param url
     *      -> we can only have them outside of a method
     */

    public static void openWithSpecificUrl(String url){
        // we declare this method static so we can access it in test class without extending/creating object just by calling it by name
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void tearDown(){
        // in case something happens between execution of these two methods, and driver equals null:
        if (driver!=null){
        driver.quit();
        }
    }

}
