package com.Homework.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2HW1 {
    public static void main(String[] args) throws InterruptedException {
        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser

        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Loki");
        driver.findElement(By.id("customer.lastName")).sendKeys("Pecikoza");
        driver.findElement(By.name("customer.address.street")).sendKeys("Ulica malih pasa");
        driver.findElement(By.id("customer.address.city")).sendKeys("Grad Cuckili");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("334011");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.name("customer.username")).sendKeys("lokikoki");
        driver.findElement(By.name("customer.password")).sendKeys("smoki");
        driver.findElement(By.name("repeatedPassword")).sendKeys("smoki");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();

        driver.quit();


    }
}
