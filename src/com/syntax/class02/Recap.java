package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Recap {
    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/geckodriver");
//        WebDriver driver=new FirefoxDriver();
//        how to use firefox


//      Launch Chrome:
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
//      Create WebDriver object
        WebDriver driver=new ChromeDriver();
//      go to a webpage
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
//      the actual title is located in the tab
        String actualTitle= driver.getTitle();
        String expectedTitle="Facebook - log in or sign up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not Correct");

        }

        driver.quit();

    }
}
