package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingDynamicTables {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        // This table doesn't have a <thead>, just a <tbody> (header is stored inside the body)

        // Task: get all the text from table to print out
        // get all the rows and store them in a list:

      List<WebElement> rows =  driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr")); // 9 elements (rows)

        // We don't want the header text, only the body data, so i=1:
        for(int i=1; i< rows.size(); i++){  // this starts from
         String rowText = rows.get(i).getText();
            System.out.println(rowText);
            if(rowText.contains("Bob Feather")){
        //  List <WebElement> checkboxes = driver.findElements(By.id("checkbox"));
        // this xpath gives us the first column in the table (all the checkboxes):
         List <WebElement> checkboxes = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
           checkboxes.get(i-1).click(); // it will click on the i checkbox (i of Bob Feather)
           // when we start from i=1, the checkbox is one step ahead, so we need to do i-1 here, because checkboxes don't start from the header
           //--> checkbox at index 0 corresponds to name at index 1
            }
        }


        List<WebElement> rows1 =  driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr")); // 9 elements (rows)
        for(int i=1; i< rows1.size(); i++){ //
            String rowText = rows1.get(i).getText();
            System.out.println(rowText);
            if(rowText.contains("FamilyAlbum")){ // will click all 3 corresponding checkboxes
                //  List <WebElement> checkboxes = driver.findElements(By.id("checkbox"));
                // this xpath gives us the first column in the table (all the checkboxes):
                List <WebElement> checkboxes = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                checkboxes.get(i-1).click();
            }
        }


    }
}
