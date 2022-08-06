package com.syntax.class010;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalendarHandling {

    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        // 1. select the month:
        // The dropdown has a <select> tag, so we use Select class

        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month")); // we are interacting with a dropdown here
        Select select = new Select(monthDD);
        select.selectByVisibleText("Sep");

        // 2. select a day
        // store all days in a list
        // use 4 loop to iterate through all the cells and get their text
        // then compare the current value with the desired one and click if correct
                                                                                // now we are interacting with a table:
      List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement fromDate : fromDates) { //iterate through all days
            String dateText = fromDate.getText();
            if(dateText.equals("4")){
                fromDate.click();
                break;
            }
        }


        // in this type of calendar we can also just send keys and not actually click on the desired mm/dd/yyyy
    }
}
