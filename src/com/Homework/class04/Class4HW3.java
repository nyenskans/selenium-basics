package com.Homework.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4HW3 {
    public static void main(String[] args) {
        //HRMS Application Negative Login:
        //Open chrome browser
        //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        //Enter valid username
        //Leave password field empty
        //Click on login button
        //Verify error message with text "Password cannot be empty" is displayed.
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");

    }
}
