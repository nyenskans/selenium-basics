package com.review.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        // go to gmail
        driver.get(url);

        // open privacy, help & term tabs
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();
        // focus is still on main page even though we opened new tabs
        // get main page handle and print it
        String mainPageHandle = driver.getWindowHandle();
        String mainPageTitle =driver.getTitle();

        // MAJOR TASK:
        // Go to privacy tab and get title, print it on the screen:
        // 1. we have to get all window handles, store them in a set
        Set<String> allWindowHandles = driver.getWindowHandles();
        // 2. create iterator
        Iterator<String> iterator = allWindowHandles.iterator();
        // 3. while loop
        while(iterator.hasNext()){
        // 4. get the first handle of the set
        String handle = iterator.next();
        // 5.switch to the current handle
        driver.switchTo().window(handle); //Switch the focus of future commands for this driver to the window with the given name/handle.
                                         //Params: name Or Handle – The name of the window or the handle as returned by getWindowHandle()
        String title = driver.getTitle();
        // 6. make sure the title is the one we want-privacy:
        if(title.contains("Privacy Policy")){
            System.out.println(title);
        // 7. exit loop when the correct one is found
            break;
        }
        }

    }
}
