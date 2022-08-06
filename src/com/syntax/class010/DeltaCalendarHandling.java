package com.syntax.class010;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeltaCalendarHandling {
    public static String url = "http://www.delta.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement calendar = driver.findElement(By.id("calDepartLabelCont"));
        calendar.click();

        WebElement nextMonthButton = driver.findElement(By.xpath("//span[text()='Next']"));
        WebElement dMonth = driver.findElement(By.className("dl-datepicker-month-0"));


        String dMonthText= dMonth.getText();
        // we want to pick October as departure month
       while(!dMonthText.equals("October")) { // while because we don't know how many times we're going to have to click next
            // we only want to click next until month is not equal to Oct
           nextMonthButton.click();
           dMonthText= dMonth.getText(); // we have to reassign the monthText every time we click because it changes every time

       }

        // now we choose departure day (30)
        // now we take all the days and store them in a list to loop over
        List<WebElement> dDates = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement dDate : dDates) {
            if(dDate.getText().equals("30")){
                dDate.click();
                break;
            }
        }

        // now we pick the return month (December)
        WebElement returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']"));
            String returnMonthText = returnMonth.getText();
            while(!returnMonthText.equals("December")){
                 nextMonthButton.click();
                 returnMonthText = returnMonth.getText();
            }

        // now we pick the date in December (20)
            List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for (WebElement returnDate : returnDates) {
         String returnDateText = returnDate.getText();
         if(returnDateText.equals("20")){
             returnDate.click();
             break;
         }
        }
        WebElement doneButton = driver.findElement(By.xpath("//button[@class='donebutton']"));
        doneButton.click();
    }
}
