package com.review.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static String url= "https://chercher.tech/practice/frames";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //Task: print the topic on the screen:
        // 1. switch to frame[0]
        driver.switchTo().frame(0);
        // 2. find the desired element topic
        WebElement topic = driver.findElement(By.xpath("//b[@id='topic']"));
        // 3. get the text
        System.out.println(topic.getText());

        // Task: go to the dropDown animals and select big Baby cat

        // 1. change focus to default
        driver.switchTo().defaultContent();
        // 2. switch to frame[1]
        driver.switchTo().frame(1);
        // 3. select from dropdown:
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']")); // locate the dropdown
        // 4. create select object
        Select select=new Select(dropDown);
        // 5. select option 3 from DD
        select.selectByIndex(2);

        // Task: click the checkBox
        // 1. switch focus to default
        driver.switchTo().defaultContent();
        // 2. switch to iframe 1 using WebElement method--> locator of the iframe
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        // 3. switch to frame1
        driver.switchTo().frame(frame1);
        // 4. switch to frame 3 by name/id
        driver.switchTo().frame("frame3");
        // 5. locate checkbox element
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
        // 6. click
        checkbox.click();

    }
}
