package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import static com.syntax.class07.SimpleWindowHandling.url;

public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
        driver.get(url);
    String mainPageHandle = driver.getWindowHandle();

    // we open multiple new pages/tabs
    WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
    WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
    WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
    // as we know, all these tabs open but the focus is still on the main page
        igButton.click();
        fbButton.click();
        igAndFbButton.click();

    //  we store all the tab IDs (window handles) in a Set:
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());

        Iterator<String> iterator = allWindowHandles.iterator();
    // this time we use a while loop to iterate through all the Window Handles

       while(iterator.hasNext()){  // start iterating through the handles (tabs)
           // this is how we get each windowHandle from the Set of all Window Handles
           String windowHandle = iterator.next(); // cannot be duplicate
           if(!mainPageHandle.equals(windowHandle)){ // condition that the mainPageHandle is not = to windowHandle,
               // then we switch the focus to the next tab
               // first we have to switch the focus to the desired tab (window handle):
               driver.switchTo().window(windowHandle);
               driver.manage().window().maximize(); // maximizing each tab
               // only after that we can get the title of that tab (window handle):
               String title = driver.getTitle(); // can be duplicate
               System.out.println(title); // it won't print mainPageHandle
               driver.close(); // it will only close child tabs
           }
       }
       driver.switchTo().window(mainPageHandle); // we have to switch the focus back to main
       driver.quit(); // close the browser
    }
}

