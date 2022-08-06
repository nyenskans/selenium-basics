package com.syntax.class012;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo2 {
    public static void main(String[] args) {
        String url ="https://www.amazon.com";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        // scrolling on the page:
        javascriptExecutor.executeScript("window.scrollBy(0,500)");

        // to go back up:
        javascriptExecutor.executeScript("window.scrollBy(0, -500)");

        // when we want to scroll to a specific element
        WebElement backToTopButton = driver.findElement(By.className("navFooterBackToTopText"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", backToTopButton);


    }
}
