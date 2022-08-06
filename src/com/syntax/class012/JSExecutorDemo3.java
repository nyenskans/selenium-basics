package com.syntax.class012;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo3 {
    public static void main(String[] args) {
        String url ="https://www.google.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        // open a new blank tab
        javascriptExecutor.executeScript("window.open()");

        // open a specific website in a new tab:
        javascriptExecutor.executeScript("window.open('https://www.amazon.com')");

        // The focus is still on the first page- google.com

        // want to search for something on google
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("sdsfedffgrgbnhnh");

        // visually we will be on amazon.com but the search above will be performed on google.com
        // if we want to switch to amazon.com to interact with it, we have to switchTo().window()



    }
}
