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

public class SwitchWindows_LinkedHashSet {
	static String browser = "Firefox"; // "HtmlUnit" "Firefox" "Chrome" "Safari"
										// "IE" "Edge"
	static WebDriver driver;
	static String parent = null;
	static String next = null;

	private static void switch_next() {
		Iterator<String> it = driver.getWindowHandles().iterator();
		while (it.hasNext()) {
			parent = it.next();
			next = it.next();
		}
		driver.switchTo().window(next);
		// driver.switchTo().window((String)driver.getWindowHandles().toArray()[1]);
	}

	private static void switch_parent() {
		driver.switchTo().window(parent);
		// driver.switchTo().window((String)driver.getWindowHandles().toArray()[0]);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		String url = "http://alex.academy/exercises/links/";
		Browsers.setWebDriver(browser);
		driver = Browsers.driver;
		WebDriverWait wait = new WebDriverWait(driver, 10); // Waits 10 seconds
															// [max]
		driver.get(url);

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
		driver.navigate().back();// return to parent window

		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_link_blank"))); // explicit
																						// wait
																						// for
																						// "element
																						// To
																						// Be
																						// Clickable"
		driver.findElement(By.id("id_link_blank")).click();
		switch_next();

		Thread.sleep(1000);
		System.out.println("Title: " + driver.getTitle() + ";\t\t URL: " + driver.getCurrentUrl() + ";\t\t Handle: "
				+ driver.getWindowHandle());
		switch_parent();
		System.out.println("----------------------------------------------------------");
		System.out.println("All Handles: " + driver.getWindowHandles());
		driver.quit();
	}
}
