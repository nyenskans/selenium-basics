package com.Homework.class08;

import com.Homework.utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

        //create a package and name it as utils
        //create a class and name as CommonMethods
        //create functions (methods) to open and quit the browsers
        //open method has to accept  url as a parameter

    public static String url="http://google.com";

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            CommonMethods.openBrowser(driver, url);
            CommonMethods.closeBrowser(driver);

    }
}
