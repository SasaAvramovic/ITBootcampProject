package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.Constants;

public class ProfileSettings {
	
	private static WebDriver driver = null;
	private static WebDriverWait wait = null;
	private static Actions actions = null;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_DRIVERS + "chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		actions = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void editSettings() {
		driver.navigate().to(Constants.URL_LOGIN);
		LoginPage.login(driver, wait);
		driver.findElement(Constants.HEADER_USER_MENU).click();
		driver.findElement(Constants.USER_SETTINGS).click();
		
		//change nickname
		driver.findElement(Constants.PROFILE_NICKNAME).clear();
		driver.findElement(Constants.PROFILE_NICKNAME).sendKeys(Constants.NEW_NICKNAME);
		
		//change weekly overtime
		Select dropdown = new Select(driver.findElement(Constants.PROFILE_WEEKLY_OVERTIME));
		dropdown.selectByVisibleText("15");
		
		//privacy settings
		actions.moveToElement(driver.findElement(Constants.PROFILE_PRIVACY_EMAIL)).click();
		actions.moveToElement(driver.findElement(Constants.PROFILE_PRIVACY_PHONE)).click();
	
		//change wage
		driver.findElement(Constants.PROFILE_WAGE).clear();
		driver.findElement(Constants.PROFILE_WAGE).sendKeys(Constants.NEW_WAGE);
		
		//save changes
		actions.moveToElement(driver.findElement(Constants.SETTINGS_SAVE)).click();
	}
	
	@AfterClass
	public void closeAll() {
		driver.quit();
	}

}
