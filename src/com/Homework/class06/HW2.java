package com.Homework.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    // navigate to https://syntaxprojects.com/java-script-alert-box-demo.php
    // click first Click me button
    // handle the js alert
    // click second Click me button
    // handle the Confirm alert
    // click third Click for prompt alert button
    //  handle the prompt alert
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick = 'myAlertFunction()']"));
        button1.click();
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        WebElement button2 = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
        button2.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        WebElement promptButton = driver.findElement(By.xpath("//button[text()= 'Click for Prompt Box']"));
        promptButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        String name="Katarina";
        promptAlert.sendKeys(name);
        promptAlert.accept();

        String message = driver.findElement(By.id("prompt-demo")).getText();
        System.out.println(message);
    }
}
