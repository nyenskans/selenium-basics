package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.navigate().to("http://google.com");
        driver.navigate().back(); // we're going back to facebook
        driver.navigate().forward();
        Thread.sleep(2000); // pause execution for a certain number of milliseconds before the page gets refreshed
        // we get an error, so we have to get an exception to method

        driver.navigate().refresh(); // refresh page

         //   driver.close(); // close the single current tab
        driver.quit(); // will quit the whole browser


    }
}
