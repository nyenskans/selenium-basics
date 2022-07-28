package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

         WebElement username = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
            // identify an element
            // store it in the WebElement type variable
        username.sendKeys("Tester");

        WebElement password=driver.findElement(By.xpath("//input[contains(@type,'password')]"));
        password.sendKeys("test");

       WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
       loginButton.click();
    }
}
