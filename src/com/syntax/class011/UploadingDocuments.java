package com.syntax.class011;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadingDocuments {
    public static void main(String[] args) {

        String url = "https://the-internet.herokuapp.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        // this element has tag <input> even though it's a button --> it means we have to input something
        // so we use .sendKeys() method
        chooseFile.sendKeys("/Users/katarinasusic/Desktop/DemoExelFileCreate.xlsx");
        // in .sendKeys() we pass the path of the file we want to upload

        WebElement submitButton = driver.findElement(By.id("file-submit"));
        submitButton.click();



    }
}