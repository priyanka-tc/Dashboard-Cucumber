package dashboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
	/**
	 * Author: Naresh Kumar 05/08/2014
	 */

	public static WebDriver driver=null;
	public static Properties OR = null;
	public static Properties CONFIG = null;
	public static boolean isLogged = false;
	static boolean Presense;
	

	public void initialize() throws IOException {

		/***
		 * Loading CONFIG property File
		 */

		if (driver == null) {
			CONFIG = new Properties();
			FileInputStream fn = new FileInputStream(
					System.getProperty("user.dir")
							+ "/src/main/resources/utils/CONFIG.properties");
			CONFIG.load(fn);

			/**
			 * Loading OR Property File
			 */

			OR = new Properties();
			fn = new FileInputStream(System.getProperty("user.dir")
					+ "/src/main/resources/utils/OR.properties");
			OR.load(fn);

			/**
			 * Initialising WebDriver
			 */

			if (CONFIG.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (CONFIG.getProperty("browser").equalsIgnoreCase("chrome"))
				System.setProperty("webdriver.chrome.driver",
						"C:/SubVersion/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	public void lanchBrowser() {
		driver.get(CONFIG.getProperty("testSiteURL"));
		driver.manage().window().maximize();
		String str="hello, poneill!";
		String splitchar=str.substring(7, 13);
		System.out.println("splited char is  "+ splitchar);

	}
<<<<<<< HEAD

=======
>>>>>>> fcaa3c9b95f387919ef921cfccca0b549f729492
	public void closeBrowser() {

		driver.close();
		driver.quit();

	}

	public static WebElement getObject(String Element) {
		String Xpath = Element;
		String linkText = Element;
		try {

			if (Element == Xpath) {
				WebElement myDynamicElement = (new WebDriverWait(driver, 10))
						.until(ExpectedConditions.presenceOfElementLocated(By
								.xpath(Xpath)));
				Presense = myDynamicElement.isDisplayed();
				return driver.findElement(By.xpath(Xpath));
			}

			else if (Element == linkText) {
				WebElement myDynamicElement1 = (new WebDriverWait(driver, 2))
						.until(ExpectedConditions.presenceOfElementLocated(By
								.linkText(linkText)));
				Presense = myDynamicElement1.isDisplayed();
				return driver.findElement(By.linkText(linkText));
			}
		} catch (Throwable t) {
			// t.printStackTrace();
			return null;
		}
		return null;

	}
	
	
	
}
