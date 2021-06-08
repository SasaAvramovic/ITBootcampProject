package tests;

import java.io.File;
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
import utils.ExcelUtil;

public class TestAddStaffList {
	
	private static WebDriver driver = null;
	private static WebDriverWait wait = null;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_DRIVERS + "chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testAddStaffList() {
		driver.navigate().to(Constants.URL_LOGIN);
		//login
		LoginPage.login(driver, wait);
		File staff = new File(Constants.PATH_FILES + "staff.xlsx");
		Header.clickHeaderStaff(driver);
		wait.until(ExpectedConditions.elementToBeClickable(Constants.STAFF_ADD)).click();
		
		//data entry from excel table
		ExcelUtil.inputStaffList(driver, staff);
		
		
		Staff.clickSave(driver);
		
		//wait for pop-up to appear and disappear
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Constants.STATUS)));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(Constants.STATUS)));
		
		driver.navigate().refresh();
		
		SoftAssert sa = new SoftAssert();
		
		//check if all members of staff were added
		for (int i = 0; i <= ExcelUtil.listLength(driver, staff); i++) {
			sa.assertTrue(driver.getPageSource().contains(ExcelUtil.checkEntries(driver, staff, i)));
		}
		
		sa.assertAll();
	}
	
	
	
	@AfterClass
	public void closeAll() {
		Staff.deleteAllStaff(driver);
		driver.quit();
	}

}
