package com.syntax.class011;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightClickAndDoubleClickActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);
        action.contextClick(rightClickMe).perform();
        // menu that pops up is not a dropdown

        Thread.sleep(3000);

        // click on edit Option:
        WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
        edit.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        WebElement doubleClickMe = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        action.doubleClick(doubleClickMe).perform();

        System.out.println(alert.getText());
        alert.accept();



    }
}
