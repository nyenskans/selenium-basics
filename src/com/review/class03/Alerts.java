package com.review.class03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        // go to website
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.phphttps://demoqa.com/select-menu");
        // locate the  alert
        WebElement alert1=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        // click on alert
        alert1.click();
        // switch to alert and store it in a variable of class Alert
        Alert alert2=driver.switchTo().alert();
        Thread.sleep(1000);
        alert2.sendKeys("Katarina");
        alert2.accept(); // alert2.dismiss();

    }
}
