package com.Homework.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {
    // Navigate to https://syntaxproject.com/bootstrap-iframe.php
    // verify the header text "Sorry we couldn't find anything for asksn" is displayed
    // verify the button enroll today is enabled
public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='FrameOne']"));
        driver.switchTo().frame(frame1);
        WebElement message = driver.findElement(By.className("heading-13"));
        String messageText = message.getText();
        String expectedMessage = "Sorry, We Couldn't Find Anything For “Asksn”";
        System.out.println(message.isDisplayed());
        if(messageText.equals(expectedMessage)){
            System.out.println("The message displayed matches the expected message: "+ expectedMessage);
        }else{
            System.out.println("The message displayed does not match the expected message: "+ expectedMessage);
        }

       driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
        driver.switchTo().frame(frame2);
        WebElement enrollButton = driver.findElement(By.xpath("//p[@class='paragraph']//following-sibling::a"));
        System.out.println(enrollButton.isEnabled());
    }
}
