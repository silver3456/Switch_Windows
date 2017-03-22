package core;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotSwitchWindows_LinkedHashSet {
	static String browser = "Chrome"; // "HtmlUnit" "Firefox" "Chrome" "Safari"
										// "IE" "Edge"
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		String url = "http://alex.academy/exercises/links/";
		Browsers.setWebDriver(browser);
		driver = Browsers.driver;
		WebDriverWait wait = new WebDriverWait(driver, 10); // Waits 10 seconds
															// [max]
		driver.get(url);

		System.out.println("getWindowHandles().getClass(): " + driver.getWindowHandles().getClass());
		System.out.println("----------------------------------------------------------");

		System.out.println("Title: " + driver.getTitle() + ";\t URL: " + driver.getCurrentUrl() + ";\t Handle: "
				+ driver.getWindowHandle());
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_link_top"))); // explicit
																					// wait
																					// for
																					// "element
																					// To
																					// Be
																					// Clickable"
		driver.findElement(By.id("id_link_top")).click();

		System.out.println("Title: " + driver.getTitle() + ";\t\t URL: " + driver.getCurrentUrl() + ";\t\t\t Handle: "
				+ driver.getWindowHandle());
		driver.navigate().back();

		driver.findElement(By.id("id_link_blank")).click();
		System.out.println("Title: " + driver.getTitle() + ";\t URL: " + driver.getCurrentUrl() + ";\t Handle: "
				+ driver.getWindowHandle());

		System.out.println("----------------------------------------------------------");
		System.out.println("All Handles: " + driver.getWindowHandles());
		driver.quit();
	}
}