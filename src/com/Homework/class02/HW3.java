package com.Homework.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        //   Task
        //   Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        //   Login
        //   Get title and verify
        //   logout
        //   close the browser
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
        Thread.sleep(1500);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String title = driver.getTitle();
        System.out.println(title);
        String expectedTitle="Web Orders";
        if(title.equals(expectedTitle)){
            System.out.println("The title is the same as expected");
        }else{
            System.out.println("The title is not the same as expected");
        }
        Thread.sleep(1500);
        driver.findElement(By.linkText("Logout")).click();

    }
}
