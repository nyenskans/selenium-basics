package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle(); // get window handle for the main page
        // dataType is String because the id is alphanumeric
        System.out.println(mainPageHandle); //  the output is that alphanumeric id for the main page tab

        // click on help button which will open a new tab, and now we have 2 tabs open
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        // we store all the handles inside the set (set doesn't allow any duplicates)
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());    // check how many tabs open

        Iterator<String> iterator = allWindowHandles.iterator(); // we use an iterator in order to iterate through all the handles in the set
        // we are not going to use a loop, but instead go forward manually

        mainPageHandle = iterator.next(); // we're taking our first step (first tab) and assigning the main page handle to a ref variable
        String childHandle = iterator.next(); // taking the second step and assigning a child handle to a ref var
        System.out.println(childHandle);
        Thread.sleep(2000);
        // until now we weren't changing focus of Selenium, we were just manually moving through the set

        //  WHEN WE CLICKED ON HELP BUTTON, A NEW TAB OPENED
        // BUT OUR FOCUS IS STILL ON THE PARENT TAB
        // THE FOCUS ONLY SWITCHES WHEN WE USE THE switchTo().window() method
        // That means that Selenium's focus is currently on Main Tab

        // now we navigate to child tab:
        driver.switchTo().window(childHandle);
        driver.close(); // now we close just the child tab

        // if we want to  click on help link again, we have to take the focus back on main tab
        // meaning, closing one tab does not bring the focus back on the previous on, we still have to do it manually to perform other actions

        driver.switchTo().window(mainPageHandle);
        helpLink.click(); // open another tab

        driver.quit(); // .quit() closes all the tabs- entire browser
    }
}
