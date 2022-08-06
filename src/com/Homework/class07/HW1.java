package com.Homework.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HW1 {
    //Go to https://demoqa.com/browser-windows
    //click on New Tab and print the text from new tab in the console
    //click on New Window and print the text from new window in the console
    //click on New Window Message and print the text from new window in the console
    //Verify (compare) the titles for each page
    //Print out the title of the all pages
    public static String url ="https://demoqa.com/browser-windows";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(driver.getTitle());
     /*
       WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if(!mainPageHandle.equals(handle)){
                driver.switchTo().window(handle);
                driver.manage().window().maximize();
                System.out.println(driver.getTitle()+" This title doesn't work for whatever reason");
                System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            }
        }
        */

        WebElement newWindowButton = driver.findElement(By.id("messageWindowButton"));
        newWindowButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();

        Iterator<String> iterator = allWindowHandles.iterator();
        mainPageHandle=iterator.next();
        String newWindow = iterator.next();
        driver.switchTo().window(newWindow);
        String newWindowTitle = driver.getTitle();
        System.out.println(newWindowTitle);


        WebElement messageWindowButton = driver.findElement(By.id("messageWindowButton"));
        messageWindowButton.click();


    }
}
