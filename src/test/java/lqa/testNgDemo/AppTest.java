package lqa.testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	String driverPath;
	String baseUrl;
	String expectedTitle;

	@BeforeClass
	public void prepareData() {
		driverPath = "C:/Users/LY/Downloads/" + "chromedriver.exe";
		baseUrl = "http://demo.guru99.com/test/newtours/";
		expectedTitle = "Welcome: Mercury Tours";
	}

	@Test
	public void verifyTrue() {

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		driver.close();
		Assert.assertTrue(actualTitle.contentEquals(expectedTitle));

	}
}
