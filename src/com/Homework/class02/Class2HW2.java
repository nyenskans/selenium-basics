package com.Homework.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2HW2 {
    public static void main(String[] args) throws InterruptedException {
        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //click on sign up button
        //close the pop up
        //close the browser
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Loki");
        driver.findElement(By.name("lastname")).sendKeys("Pecikoza");

        driver.findElement(By.name("reg_email__")).sendKeys("123456789");
        driver.findElement(By.id("password_step_input")).sendKeys("lokismoki");
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.xpath("img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")).click();
        Thread.sleep(3000);

        driver.quit();


    }
}
