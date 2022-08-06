package com.syntax.class011;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Drag the draggable square to droppable square:

        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();

        // Bring the draggable into initial position:
/*
        driver.switchTo().defaultContent();
        driver.navigate().refresh();
*/
        // or this way: click and hold then move back and then release
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        // .build() combines multiple actions into one
        // then .perform()

        Thread.sleep(2000);
        driver.close();



    }
}
