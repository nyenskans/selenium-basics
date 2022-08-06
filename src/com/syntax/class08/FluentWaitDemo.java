package com.syntax.class08;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<>(driver); // argument is the object that communicates with the browser
        // since it's a global wait, we have to provide conditions right away:
    /*    .withTimeout(Duration.ofSeconds(20)); // time until exception
        .pollingEvery(Duration.ofSeconds(2)); // look for an element every 2 seconds
        .ignoring(NoSuchElementException.class);
*/

    }


}
