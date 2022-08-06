package com.syntax.class011;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        // We want to click on login button by using JavascriptExecutor

        // we are creating an object of the interface so we have to downcast it to the driver
        JavascriptExecutor javaScript = (JavascriptExecutor) driver;

        // it can use some built in scripts that help us perform some actions:
        // here we want to highlight username field:
        javaScript.executeScript("arguments[0].style.backgroundColor='yellow'", username);

        // we can write our own scripts in console in the DOM

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        javaScript.executeScript("arguments[0].click()", loginButton);



    }
}
