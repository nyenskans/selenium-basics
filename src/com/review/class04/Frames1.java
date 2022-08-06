package com.review.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Frames1 {
    public static String url= "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        // Task: print the topic on the screen:

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//b[@id='topic']"));
        System.out.println(topic.getText());

        // Task: go to the dropDown animals and select big Baby cat:

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement animalsDD = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(animalsDD);
        select.selectByIndex(2);

        // Task: click the checkBox:

        driver.switchTo().defaultContent();
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
