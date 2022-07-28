package com.syntax.class05;

import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenuDemo {
    public static String url="https://syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        // first we need to make sure it has select tag --> to be able to use select class
        // then we identify dropdown as an element (this one we can identify by id)
        WebElement daysDD= driver.findElement(By.id("select-demo"));

        // now we create an object of Select class
        Select select =  new Select(daysDD); // we need to pass the WebElement as parameter in Select constructor

        // every time we interact with a different dropDown we need to create another object of Select class

        select.selectByIndex(3); // the selected element is Tuesday because at index 0 is 'Please select'
                                // it's ok to use index for dropdowns because it is a built in method
        Thread.sleep(3000);

        select.selectByVisibleText("Thursday"); // this command overrides Tuesday selection
        Thread.sleep(3000);

        select.selectByValue("Friday"); // we can only use this command if the element has value attribute

    }
}
