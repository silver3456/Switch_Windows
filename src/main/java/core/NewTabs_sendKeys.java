package core;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTabs_sendKeys {
	  static String browser = "Chrome"; // "HtmlUnit" "Firefox" "Chrome"  "Safari"  "IE"  "Edge"
	  static WebDriver driver;
	  static String parent = null;
	  static String next = null;
	
private static void switch_next(){
	  driver.switchTo().window((String)driver.getWindowHandles().toArray()[1]);}
private static void switch_parent() {
	  driver.switchTo().window((String)driver.getWindowHandles().toArray()[0]);}
	
public static void main(String[] args) throws InterruptedException, IOException {
      String url = "http://alex.academy/exercises/links/";
	  Browsers.setWebDriver(browser);
	  driver = Browsers.driver;
	  WebDriverWait wait = new WebDriverWait(driver,10); //Waits 10 seconds [max] 
	  driver.get(url);



String osName = System.getProperty("os.name").toLowerCase();
System.out.println(osName);
if (osName.contains("windows")) {
	   driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");   // open TAB#1
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#2
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#3
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#4
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#5
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#6
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#7
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#8
       Thread.sleep(1000);
       System.out.println(osName);
       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");// open TAB#9
       Thread.sleep(1000);
       System.out.println(osName);} 
else {driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");} // for macOS


             System.out.println("----------------------------------------------------------");
             System.out.println("All Handles: " + driver.getWindowHandles());
driver.quit(); }}