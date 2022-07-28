package com.review.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        // go to website
        driver.get("http://facebook.com");
        // select the dropdown
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
         Thread.sleep(2000);
        //select the birthday
       WebElement dayDD= driver.findElement(By.xpath("//select[@id='day']"));
       // create object of select class, pass dayDD as parameter
       Select dropdown=new Select(dayDD);
       // get all available options:
        List<WebElement> availableDays=dropdown.getOptions();
//        for(WebElement availableDay:availableDays){
//            System.out.println(availableDay);
//        }

       // select all options one by one every 2 seconds

 /*     for(int i=0; i<availableDays.size();i++) {
            System.out.println(availableDays.get(i).getText());
            dropdown.selectByIndex(i);
            Thread.sleep(2000);
        }
*/
        // select day 3 by index
        dropdown.selectByIndex(2);
        Thread.sleep(2000);
        // select by value:
        dropdown.selectByValue("24");

        // select day 7 by visible text
        dropdown.selectByVisibleText("7");
    }
}
