package com.review.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {

        // set property
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");

        //create an object of WebDriver type
        WebDriver driver=new ChromeDriver();

        // go to google.com
        driver.get("https://syntaxprojects.com/");

        // another option is:
        // driver.navigate().to("https://syntaxprojects.com/")

        // navigate has forward, backward, history
        // but, it doesn't wait for the page to fully load before executing the next command

       // <div> is a tag used to divide the page into parts (better visibility)

     WebElement button1 = driver.findElement(By.linkText("Start Practising"));
        // it is of type WebElement because the element of the webpage that we are finding and are returned is WebElement

        button1.click();

            Thread.sleep(2000);
            // to wait for the page to load after clicking 'Start practicing'
        // we had to insert .sleep to be able to find the following element
        // if the time is still too long, there will be some wait method
        driver.wait();
        driver.findElement(By.partialLinkText("Proceed")).click();
    }
}
