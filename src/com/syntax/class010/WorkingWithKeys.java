package com.syntax.class010;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester", Keys.TAB); // keyboard command --> tab button
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test",Keys.ENTER); // keyboard command --> Enter button
        // now we don't have to use the Login button click
        // the disadvantage is that by performing a click on the button, we are also testing its functionality (clickability)
        // there might be an issue with the button, and we won't know if we hit enter

    }
}