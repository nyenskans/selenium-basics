package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // we are switching the focus to the frame by index:
        driver.switchTo().frame(0); // first frame, index 0 on webpage
        // we are locating the WebElement in that frame:
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 13 Forever!!!");

        // We are done with the previous frame, so we switch back to main page
        driver.switchTo().defaultContent();

        // Now we deal with an alert on the main page (outside of any frame)
        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // after we're done dealing with an alert we gain the focus on main page automatically

        // we are switching the focus to the frame by attribute name or ID:
        driver.switchTo().frame("iframe_a");
        // we don't have to find the element again because we stored it in variable textbox:
        textbox.clear();
        textbox.sendKeys("we are back in the frame");

        driver.switchTo().defaultContent();
        // after we're done dealing with a frame we don't gain the focus on main page automatically, we have to do it manually

        // we are switching the focus to the frame by WebElement
        // meaning the frame is a WebElement in a webpage, so we locate it just like any other WebElement
        // we store the frame in a reference variable of type WebElement
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));

        // now we use the frame reference variable to switch to that frame:
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("Hold your Horses!!!");
    }
}
