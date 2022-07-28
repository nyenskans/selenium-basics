package com.review.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        // go to website
        driver.get("https://demoqa.com/select-menu");

        // we can switch to a frame by frame name/id
    //    driver.switchTo().frame();

        // we can switch to a frame by WebElement
    //    driver.switchTo().frame();

        // we can switch to a frame by frame number
    //    driver.switchTo().frame();


        //switch the focus back to main page from a fram
    //    driver.switchTo().defaultContent();

    }
}
