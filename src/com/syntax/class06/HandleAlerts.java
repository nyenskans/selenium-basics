package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        // 1. Simple alert example:
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        // interface Alert (from Selenium); switchTo().alert() returns an alert object
        Alert simpleAlert = driver.switchTo().alert(); // switch focus to alert that popped up
        simpleAlert.accept(); // .accept() method to choose OK

        // 2. Confirmation alert example:
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        // Store the message of the Alert:
        String confirmAlertText = confirmAlert.getText();
        System.out.println(confirmAlertText);
        confirmAlert.dismiss(); // .dismiss() method to choose cancel

        // 3. Prompt alert example:
        WebElement promptAlertButton = driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        // Send text to the promptAlert text box:
        promptAlert.sendKeys("Don't replace my Chromedriver!!!");
        promptAlert.accept();
    }
}
