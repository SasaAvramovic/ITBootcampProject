package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Homepage;
import objects.LoginPage;
import resources.Constants;
import utils.SShot;
import java.io.File;

public class TestAboutUsAndLogin {
	
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
	
	@Test (priority = 1)		//check "about" page and take screenshot
	public void testAboutUs() {
		driver.navigate().to(Constants.URL_HOME);
		Homepage.closePopup(wait);
		Homepage.clickAboutUs(driver);
		SShot.screenShot(driver, "aboutUs.jpg");
		File tempfile = new File ("aboutUs.jpg");
		Assert.assertTrue(tempfile.exists());
	}

	@Test (priority = 2)		//check login with valid credentials
	public void testHomePage() {
		driver.navigate().to(Constants.URL_LOGIN);
		LoginPage.enterUsername(driver);
		LoginPage.enterPassword(driver);
		LoginPage.clickLoginBtn(driver, wait);

		Assert.assertEquals(driver.getCurrentUrl(), Constants.URL_DASH);
	}
	
	@AfterClass
	public void closeAll() {
		driver.quit();
	}

}
