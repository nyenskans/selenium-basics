package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.tools.OptionChecker;
import java.util.List;

public class CheckboxDemo {
   static String url="https://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

       List<WebElement> optionCheckboxes= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        // we are trying to find a group of elements to store in a list- because we have multiple checkboxes
        // so, we need to find a location which is not unique but common for all 4 of them

        int size = optionCheckboxes.size();
        System.out.println(size);

        for(WebElement option: optionCheckboxes) {
            String checkBoxValue = option.getAttribute("value"); // we need to get the attribute which value makes
            // an element unique to be able to select that specific one
            if (checkBoxValue.equals("Option-2")) { //iterates through all checkboxes until it gets to Option 2
                option.click();
                break;
            }
        }
/*
            This loop would show how to check multiple boxes
            for(WebElement option: optionCheckboxes){
                String checkBoxValue=option.getAttribute("value"); // we need to get the attribute which value makes
                // an element unique to be able to select that specific one
                if(checkBoxValue.equals("Option-2")||checkBoxValue.equals("Option-3") { //iterates through all checkboxes until it gets to Option 2 or option3
                    option.click();
                }

 */
        }
    }

