package com.Homework.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2HW3 {
    public static void main(String[] args) {
        //   Task
        //   Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        //   Login
        //   Get title and verify
        //   logout
        //   close the browser
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

    }
}
