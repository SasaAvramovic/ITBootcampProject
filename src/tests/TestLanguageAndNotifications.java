package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Header;
import objects.LoginPage;
import objects.Settings;
import resources.Constants;

public class TestLanguageAndNotifications {
	
	private static WebDriver driver = null;
	private static WebDriverWait wait = null;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void testChangeLanguage() {
		driver.navigate().to(Constants.URL_LOGIN);
		SoftAssert sa = new SoftAssert();
		// login
		LoginPage.login(driver, wait);

		Header.clickHeaderSettings(driver);
		// change language to Serbian
		Settings.selectLanguage(driver, "Serbian (machine)");
		Settings.clickSaveSettings(driver);
		driver.navigate().refresh();
		Select select = new Select(driver.findElement(Constants.SETTINGS_LANGUAGE));
		sa.assertEquals(select.getFirstSelectedOption().getText(), "Serbian (machine)");

		// revert language to English
		Settings.selectLanguage(driver, "American English");
		Settings.clickSaveSettings(driver);
		driver.navigate().refresh();
		select = new Select(driver.findElement(Constants.SETTINGS_LANGUAGE));
		sa.assertEquals(select.getFirstSelectedOption().getText(), "American English");

		sa.assertAll();
	}

	@Test(priority = 2)
	public void uncheckNotifications() {
		Settings.notificationsOff(driver);
		SoftAssert sa = new SoftAssert();
		driver.navigate().refresh();
		sa.assertTrue(!driver.findElement(Constants.SETTINGS_NOTIFICATIONS_EMAIL).isSelected());
		sa.assertTrue(!driver.findElement(Constants.SETTINGS_NOTIFICATIONS_SMS).isSelected());
		sa.assertTrue(!driver.findElement(Constants.SETTINGS_NOTIFICATIONS_PUSH).isSelected());

		sa.assertAll();
	}

	@AfterClass
	public void closeAll() {
		Settings.notificationsOn(driver);
		driver.quit();
	}

}


