package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Header;
import objects.LoginPage;
import resources.Constants;

public class TestHeader {
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

	@Test
	public void testHomePage() {
		driver.navigate().to(Constants.URL_LOGIN);
		LoginPage.login(driver, wait);
		
		SoftAssert sa = new SoftAssert();
		
		Header.clickHeaderDash(driver);
		wait.until(ExpectedConditions.titleIs(Constants.DASH_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.DASH_TITLE);
		
		Header.clickHeaderSchedule(driver);
		wait.until(ExpectedConditions.titleIs(Constants.SCHEDULE_TITLE));
		sa.assertEquals(driver.getTitle(),	Constants.SCHEDULE_TITLE);
		
		Header.clickHeaderTimeclock(driver);
		wait.until(ExpectedConditions.titleIs(Constants.TIMECLOCK_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.TIMECLOCK_TITLE);
		
		Header.clickHeaderRequests(driver);
		wait.until(ExpectedConditions.titleIs(Constants.LEAVE_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.LEAVE_TITLE);

		Header.clickHeaderTraining(driver);
		wait.until(ExpectedConditions.titleIs(Constants.TRAINING_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.TRAINING_TITLE);
		
		Header.clickHeaderStaff(driver);
		wait.until(ExpectedConditions.titleIs(Constants.STAFF_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.STAFF_TITLE);
		
		Header.clickHeaderPayroll(driver);
		wait.until(ExpectedConditions.titleIs(Constants.PAYROLL_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.PAYROLL_TITLE);
		
		Header.clickHeaderReports(driver);
		wait.until(ExpectedConditions.titleIs(Constants.REPORTS_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.REPORTS_TITLE);
		
		Header.clickHeaderSettings(driver);
		wait.until(ExpectedConditions.titleIs(Constants.SETTINGS_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.SETTINGS_TITLE);
		
		Header.clickHeaderUserSettings(driver);
		wait.until(ExpectedConditions.titleIs(Constants.USER_SETTINGS_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.USER_SETTINGS_TITLE);
		
		Header.clickHeaderUserProfile(driver);
		wait.until(ExpectedConditions.titleIs(Constants.USER_PROFILE_TITLE));
		sa.assertEquals(driver.getTitle(), Constants.USER_PROFILE_TITLE);
		
		Header.clickHeaderAvailability(driver);
		sa.assertEquals(driver.getTitle(), Constants.AVAILABILITY_TITLE);
		
		sa.assertAll();
	}
	
	@AfterClass
	public void closeAll() {
		driver.quit();
	}

}