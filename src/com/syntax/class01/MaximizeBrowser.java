package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.amazon.com");
        //we want to maximize the browser window
        driver.manage().window().maximize();
        // driver.manage().window().fullScreen();



    }
}
