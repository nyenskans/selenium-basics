package com.review.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        WebElement textBox= driver.findElement(By.id("user-message"));
        textBox.sendKeys("abracadabra");


    }
}
