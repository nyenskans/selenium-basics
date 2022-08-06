package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTablesWithPagination {
    public static String url="https://syntaxprojects.com/table-pagination-demo.php";
    public static void main(String[] args) {

         // tables with page numbers/ scrollable to the side
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //  Task: print the data from row 8:

        // 1. Locate the table: we have to locate the rows because we only need row 8:
        // we store them in a list
        List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='myTable']/tr"));

        // 2. locate the next button: (next page of table)
        WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));

        // 3. now let's loop through all the rows of the table and print their text:

        for (WebElement row : rows) {
            String rowText = row.getText();
            System.out.println(rowText);
            // Output are only the rows on the first page because they are not displayed
        }

        // Since tables with data are usually constantly changing, we need to keep out code dynamic
        // --> meaning we don't know where in the table a certain piece of data is going to end up, so we don't know how many times
        // we're going to have to click on next, which row it's going to be in, etc. :


        // Next we want to print out text from row 8
        // 4. create another variable and another loop
        boolean studentNotFound= true;
        while(studentNotFound){
          for(WebElement row:rows) {         // total 13 rows, only 5 visible on 1st page
              String rowText = row.getText();
              if (rowText.contains("Archy J")) { // we are looking for a specific name
                   studentNotFound = false; // we have to set condition as false so that the loop wouldn't be infinite
                  System.out.println(rowText);
                  break;   // to leave the loop once condition is met
              }
          }
                            // once IF is true, condition=false--> we break, we go to line 55 --> condition false,
                            // we don't go to line 56, instead we go back to the beginning of while loop ()
           if(studentNotFound){       // if true-> we click, if false we don't
                                // once all rows are checked for the condition and it is not met, we get out of the for loop:
              nextButton.click();   // click on the next button, so we go to the next page of the table to look further
           }
        }


        // Best loop to use with pages/tables is while loop because we don't know when we're going to stop



    }
}
