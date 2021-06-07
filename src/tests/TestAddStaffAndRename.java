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
import objects.Staff;
import resources.Constants;

public class TestAddStaffAndRename {
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
	public void testAddStaffAndRename() {
		driver.navigate().to(Constants.URL_LOGIN);
		//login
		LoginPage.login(driver, wait);
		
		Header.clickHeaderStaff(driver);
		wait.until(ExpectedConditions.elementToBeClickable(Constants.STAFF_ADD)).click();
		
		//data entry from constants
		driver.findElement(Constants.STAFF_LIST_FNAME).sendKeys(Constants.STAFF_FIRST_NAME);
		driver.findElement(Constants.STAFF_LIST_LNAME).sendKeys(Constants.STAFF_LAST_NAME);
		driver.findElement(Constants.STAFF_LIST_EMAIL).sendKeys(Constants.STAFF_EMAIL);
		
		Staff.clickSave(driver);
		
		//wait for pop-up to appear and disappear
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Constants.STATUS)));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(Constants.STATUS)));
		
		SoftAssert sa = new SoftAssert();
		
		//check if staff member was added
		driver.navigate().to(Constants.STAFF_URL);
		try {	//website is so weird, it requires wait every few clicks
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sa.assertTrue(driver.getPageSource().contains(Constants.STAFF_FIRST_NAME));
		
		//change staff name and add photo
		Staff.rename(driver, wait, Constants.PATH + "staff_photo.jpg");
		
		//verify new name
		driver.navigate().to(Constants.STAFF_URL);
		sa.assertTrue(driver.getPageSource().contains(Constants.STAFF_RENAME));
		
		sa.assertAll();
	}
	
	@AfterClass
	public void closeAll() {
		Staff.deleteAllStaff(driver);
		driver.quit();
	}

}