package com.Homework.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4HW2 {

     //   TC 1: Amazon link count:
    //Open chrome browser
    //Go to "https://www.amazon.com/"
    //Get all links
    //Get number of links that has text
    //Print to console only the links that has text
    //

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");

    }
}
