package dashboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPage {
	/**
	 * Author: Naresh Kumar 05/08/2014
	 */

	public static WebDriver driver = null;
	public static Properties OR = null;
	public static Properties CONFIG = null;

	public void initialize() throws IOException {

		/***
		 * Loading CONFIG property File
		 */

		CONFIG = new Properties();
		FileInputStream fn = new FileInputStream(System.getProperty("user.dir")
				+ "/src/main/resources/utils/CONFIG.properties");
		CONFIG.load(fn);

		/**
		 * Loading OR Property File
		 */

		OR = new Properties();
		fn = new FileInputStream(System.getProperty("user.dir")
				+ "/src/main/resources/utilsOR.properties");
		OR.load(fn);

		/**
		 * Initialising WebDriver
		 */

		if (CONFIG.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (CONFIG.getProperty("browser").equalsIgnoreCase("chrome"))
			System.setProperty("webdriver.chrome.driver",
					"C:\\SubVersion\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void tearUp() {
		driver.get(CONFIG.getProperty("testURL"));
		driver.manage().window().maximize();

	}

	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
