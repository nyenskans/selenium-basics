package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");

        // if we send selenium to test an element of a webpage it is going to see the back not the frontpage
        // so we need to give it the locator
        // in this case we're giving it id:
//           driver.findElement(By.id("email"));
        // in order for us to type some text into the text box we use method sendKeys:
        driver.findElement(By.id("email")).sendKeys("Syntax@abcd.com");
        driver.findElement(By.id("pass")).sendKeys("katarina");
        // to click login button
        driver.findElement(By.name("login")).click();
        // there is no pause between these executions so we can add sleep method

        Thread.sleep(20000);

// forgot password is a link because is has an </a> tag (anchor tag); it takes us to a different page
// when we inspect it it only has class name with numbers and a href(url)
        // the locator will be LinkText

        driver.findElement(By.linkText("Forgot password?")).click();



        driver.findElement(By.partialLinkText("Forgot")).click(); //we use partial LinkText if the phrase is too long
    }
}
