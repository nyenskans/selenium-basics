package com.syntax.class011;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClassDemo {
    public static String url = "https://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // click on Accounts and lists button
        WebElement accountsAndLists = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        // this button doesn't need to be clicked, we just need to hover over it so we use Actions class
        Actions action = new Actions(driver);
        // .moveToElement() method actually moves the cursor to the desired WebElement
        action.moveToElement(accountsAndLists).perform();

        Thread.sleep(2000);


    }
}
