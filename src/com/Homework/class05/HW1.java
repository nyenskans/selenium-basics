package com.Homework.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {

//        Facebook dropdown verification:
//        Open chrome browser
//        Go to "https://www.facebook.com"
//        click on create new account
//        Verify:
//        month dd has 12 month options
//        day dd has 31 day options
//        year dd has 115 year options
//        Select your date of birth
//        Quit browser
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        //Verify that month dd has 12 options:

        WebElement monthDD = driver.findElement(By.xpath("//select[@id = 'month']"));
        Select selectMonth = new Select(monthDD);;
        List<WebElement> monthOptions = selectMonth.getOptions();
        System.out.println("Month dropdown has "+monthOptions.size()+" options");

        //Verify that day dd has 31 options:
        WebElement dayDD = driver.findElement(By.xpath("//select[@id = 'day']"));
                Select selectDay = new Select(dayDD);
         List <WebElement> dayOptions = selectDay.getOptions();
        System.out.println("Day Dropdown has "+dayOptions.size()+" options");

        //Verify that year dd has 115 options:
        WebElement yearDD = driver.findElement(By.xpath("//select[@id = 'year']"));
                Select selectYear = new Select(yearDD);
        List<WebElement> yearOptions = selectYear.getOptions();
        System.out.println("Year dropdown has "+yearOptions.size()+" options");




    }
}
