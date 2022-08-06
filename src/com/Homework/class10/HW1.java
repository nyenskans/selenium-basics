package com.Homework.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
       Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
       click on leave
       click on leave list
       choose from "From calendar"
       choose from "To calendar"
       click only on cancelled and rejected checkboxes
       uncheck Pending Approval
       select IT support from DD
       click search
       quit the browser
    */
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input [@ id ='btnLogin']")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        // From calendar
        driver.findElement(By.id("calFromDate")).click();
        // Dropdown for month:
        WebElement monthDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Sep");
        // table for month September to choose day:
        List<WebElement> daysFrom = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']"));
        for (WebElement dayFrom : daysFrom) {
            if (dayFrom.getText().equals("4")) {
                dayFrom.click();
                break;
            }
        }
        // To calendar:
        driver.findElement(By.id("calToDate")).click();
        // Dropdown for month:
        WebElement monthDDTo = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select3 = new Select(monthDDTo);
        select3.selectByVisibleText("Oct");
        // table for month October to choose day:
        List<WebElement> daysTo = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a[@class='ui-state-default']"));
        for (WebElement dayTo : daysTo) {
            if (dayTo.getText().equals("1")) {
                dayTo.click();
                break;
            }
        }


        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

    
        for (WebElement checkbox : checkboxes) {
            String value = checkbox.getAttribute("value");
            if (value.equals("-1") || value.equals("0")||checkbox.isSelected()) {
                checkbox.click();
            }

        }



        WebElement subUnitDD = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select select2 = new Select(subUnitDD);
        select2.selectByVisibleText("IT Support");
        driver.findElement(By.xpath("//input[@id='btnSearch']")).click();


    }
}