package com.syntax.class010;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakingScreenshots {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        // we can't create an object of an Interface so we will downCast it to driver in order to interact with web page
        TakesScreenshot screenshot = (TakesScreenshot) driver;      // screenshot is taken

        // we use File class to be able to get the screenshot as a file output
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE); // we have to specify the output type in ()

        // now we use commons io jar
        // we have to specify what file we want to copy and where we want to store that file:
        try { // we choose the option surround w try and catch for .copyFile() method
            // so we are now copying the file that we got on line 26
            // we have to say which file we are copying --> first parameter
            // second parameter: we create a new File (path of the folder where we want to store it.extension of the file)
            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/adminPage.png"));
        } catch (IOException e) { // input output exception
            e.printStackTrace(); // we want to see what we would get if we didn't handle this exception
        }

        // this has automatically created a folder screenshots in our current project where it stored the png file




    }
}
