package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Header;
import objects.Homepage;
import objects.LoginPage;
import resources.Constants;


public class TempTests {
	
	private static WebDriver driver = null;
	private static WebDriverWait wait = null;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 3);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testHomePage() {
		driver.navigate().to(Constants.URL_HOME);
		Homepage.closePopup(wait);
		Homepage.clickLoginLink(driver);

		driver.navigate().to(Constants.URL_LOGIN);
		LoginPage.enterUsername(driver,  "lucy@the.sky");
		LoginPage.enterPassword(driver, "PurpleHaze");
		LoginPage.clickLoginBtn(driver, wait);
		
		SoftAssert sa = new SoftAssert();
		
		Header.clickHeaderDash(driver);
		sa.assertEquals(driver.getTitle(), "Dashboard - Dashboard - Humanity");
	}
	
	@AfterClass
	public void closeAll() {
		driver.quit();
	}

}
