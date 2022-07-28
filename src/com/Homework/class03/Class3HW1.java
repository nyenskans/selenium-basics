package com.Homework.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3HW1 {
    //	HW
    //Navigate to http://syntaxprojects.com
    //Click on start practicing
    //click on simple form demo
    //enter any text on first text box
    //click on show message
    //quit the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.findElement(By.id("btn_basic_example")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a")).click();
        Thread.sleep(3000);
        WebElement firstTextBox= driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        firstTextBox.sendKeys("Loki je moja biba");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        String yourText= driver.findElement(By.xpath("//span[@id='display']")).getText();
        System.out.println(yourText);
        Thread.sleep(4000);

        driver.quit();

    }
}