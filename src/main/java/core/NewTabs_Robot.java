package core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class NewTabs_Robot {
	static String browser = "Chrome"; // "HtmlUnit" "Firefox" "Chrome" "Safari"
										// "IE" "Edge"
	static WebDriver driver;
	static String parent = null;
	static String next = null;

	private static void switch_next() {
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
	}

	private static void switch_parent() {
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		String url = "http://alex.academy/exercises/links/";
		Browsers.setWebDriver(browser);
		driver = Browsers.driver;
		WebDriverWait wait = new WebDriverWait(driver, 10); // Waits 10 seconds
															// [max]
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		driver.get(url);

		Robot r = new Robot();

		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if (osName.contains("windows")) {
			r.keyPress(KeyEvent.VK_CONTROL); // open TAB#1
			r.keyPress(KeyEvent.VK_T);
			// wait.until(ExpectedConditions.refreshed());
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#2
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#3
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#4
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#5
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#6
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#7
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#8
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#9
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);

			System.out.println(osName);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);// open TAB#10
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
		} else {
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_META);
			r.keyRelease(KeyEvent.VK_T);
		} // for macOS

		System.out.println("----------------------------------------------------------");
		System.out.println("All Handles: " + driver.getWindowHandles());
		driver.quit();
	}
}