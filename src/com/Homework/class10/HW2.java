package com.Homework.class10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
     Go to aa.com/homePage.do
     select depart date
     select return date
     select destination
     click on search
     quit the browser
     */
    public static String url = "aa.com/homePage.com";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
