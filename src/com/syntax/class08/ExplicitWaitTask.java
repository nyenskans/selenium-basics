package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTask {
    /*
     *  navigate http://syntaxprojects.com/dynamic-elements-loading.php
     *  click on start button
     *  get the text
     *  print out in console
     */
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();
        // creating object of WebDriverWait class
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // using .until() method with ExpectedConditions class to wait for the element to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(), 'Welcome')]")));
        // create webElement of the message
        WebElement message = driver.findElement(By.xpath("//h4[contains(text(), 'Welcome')]"));
        // use method .getText() to get the text of that WebElement and print it
        System.out.println(message.getText());

        // in real life <h> tags change frequently; when we have a changing environment we can use this in xpath to
        // identify any tag in the dom:
        // we can use the * instead of the tag:
       // WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));


    }
}
