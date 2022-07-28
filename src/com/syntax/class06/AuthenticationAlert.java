package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    // These types of alerts show up as soon as the page loads--> pops up and gives us a field to enter password/username
    // to be able to access the website:
    // handled by inserting password and username in the url right after // in the following format:
    // username:password@

    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

    //username: admin
    // password: admin
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
