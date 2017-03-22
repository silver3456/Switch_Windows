package core;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SwitchWindows {

       static String browser = "Chrome";        // "HtmlUnit"

       public static void main(String[] args) throws InterruptedException {

              String url = "http://alex.academy/exercises/links/";

              Logger logger = Logger.getLogger("");logger.setLevel(Level.OFF);

              WebDriver driver;                                    

             if (browser.equalsIgnoreCase("chrome"))

             {System.setProperty("webdriver.chrome.driver","/Users/alexander/Documents/workspace/SW/src/main/resources/webdrivers/mac/chromedriver");

              System.setProperty("webdriver.chrome.silentOutput", "true");

              ChromeOptions option = new ChromeOptions();

              option.addArguments("-start-fullscreen");

              driver = new ChromeDriver(option);

              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}

             else{driver = new HtmlUnitDriver();((HtmlUnitDriver) driver).setJavascriptEnabled(true);}

             

              driver.get(url);

System.out.println("Title: " + driver.getTitle() + ";\t URL: " + driver.getCurrentUrl() + ";\t Handle: " + driver.getWindowHandle());


              driver.findElement(By.id("id_link_top")).click();

System.out.println("Title: " + driver.getTitle() + ";\t URL: " + driver.getCurrentUrl() + ";\t Handle: " + driver.getWindowHandle());

 
              driver.navigate().back();


              driver.findElement(By.id("id_link_blank")).click();

//            String parent = null;
//            String next = null;
//            Iterator<String> it = driver.getWindowHandles().iterator();
//            while (it.hasNext()) {parent = it.next(); next = it.next();}
//            driver.switchTo().window(next);
//           driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);

System.out.println("Title: " + driver.getTitle() + ";\t URL: " + driver.getCurrentUrl() + ";\t Handle: " + driver.getWindowHandle());

 //            driver.switchTo().window(parent);
//           driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);

             System.out.println("----------------------------------------------------------");

             System.out.println("All Handles: " + driver.getWindowHandles());

              driver.quit(); }}