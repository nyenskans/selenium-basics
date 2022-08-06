package com.Homework.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.rmi.server.ExportException;

public class HW1 {
    //go to https://the-internet.herokuapp.com/dynamic_controls
    //click on checkbox and click on remove
    //verify the text
    //click on enable verify the textBox is enabled
    //enter text and click disable
    //verify the textBox is disabled
    //
    public static String url= "https://the-internet.herokuapp.com/dynamic_controls";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        String message = driver.findElement(By.xpath("//p[@id='message']")).getText();
        System.out.println(message);

        driver.findElement(By.xpath("//button[contains(text(), 'Enable')]")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Disable')]")));
        WebElement enableButton = driver.findElement(By.xpath("//button[contains(text(), 'Disable')]"));
        System.out.println("The button is enabled "+enableButton.isEnabled());
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Some text!");
        driver.findElement(By.xpath("//button[contains(text(), 'Disable')]")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.visibilityOf(enableButton));
        System.out.println("The button is enabled "+enableButton.isEnabled());


        }
}
