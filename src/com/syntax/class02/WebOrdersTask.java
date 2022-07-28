package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {
//    **
//            * Task
// * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
//            * Login
// * Get title and verify
// * logout
// close the browser
// */
public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
   WebDriver driver=new ChromeDriver();
   driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

   driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

   WebElement username= driver.findElement(By.id("ctl00_MainContent_username")); // we can store this element in a variable
   // if we interact with the same element again in the future, it's easier to store it in the memory of the code and reuse it later
   // than go back every time and inspect the element
   // and then use the variable to send keys
   username.sendKeys();

   driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

   WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
   password.sendKeys();
   driver.findElement(By.className("button")).click();


   String actualTitle= driver.getTitle();
   String expectedTitle="Web Orders";

   if(actualTitle.equals(expectedTitle)){
      System.out.println("Title is correct");
   }else{
      System.out.println("Title is not correct");
   }

   driver.findElement(By.linkText("Logout")).click();
   driver.quit();





}



}
