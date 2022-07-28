package com.review.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        //whenever we have multiple checkboxes it's good practice to get them all and then select one
        // select purple color

        //First  get all checkboxes:
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkbox:checkboxes){
            String color=checkbox.getAttribute("value");
            if(color.equalsIgnoreCase("purple")){
                checkbox.click();
            }
        }
    }
}