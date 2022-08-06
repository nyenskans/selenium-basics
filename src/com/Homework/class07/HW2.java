package com.Homework.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    //navigate to http://www.uitestpractice.com/Students/Contact
    //click on the link
    //get text
    //print out in the console
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Contact");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.xpath("//a[@data-ajax='true']"));
        link.click();
        WebElement message = driver.findElement(By.xpath("//p[contains(text(), 'Selenium is a portable software testing framework')]"));
        System.out.println(message.getText());




    }
}