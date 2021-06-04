package objects;

import org.openqa.selenium.WebDriver;

import resources.Constants;

public class Header {
	
	public static void clickHeaderDash(WebDriver driver) {
		driver.findElement(Constants.HEADER_DASH).click();
	}
	
	public static void clickHeaderSchedule(WebDriver driver) {
		driver.findElement(Constants.HEADER_SCHEDULE).click();
	}
	
	public static void clickHeaderTimeclock(WebDriver driver) {
		driver.findElement(Constants.HEADER_TIMECLOCK).click();
	}
	
	public static void clickHeaderRequests(WebDriver driver) {
		driver.findElement(Constants.HEADER_REQUESTS).click();
	}
	
	public static void clickHeaderTraining(WebDriver driver) {
		driver.findElement(Constants.HEADER_TRAINING).click();
	}
	
	public static void clickHeaderStaff(WebDriver driver) {
		driver.findElement(Constants.HEADER_STAFF).click();
	}
	
	public static void clickHeaderAvailability(WebDriver driver) {
		driver.findElement(Constants.HEADER_AVAILABILITY).click();
	}
	
	public static void clickHeaderPayroll(WebDriver driver) {
		driver.findElement(Constants.HEADER_PAYROLL).click();
	}
	
	public static void clickHeaderReports(WebDriver driver) {
		driver.findElement(Constants.HEADER_REPORTS).click();
	}
	
	public static void clickHeaderSettings(WebDriver driver) {
		driver.findElement(Constants.HEADER_SETTINGS).click();
	}
	
	public static void clickHeaderUserSettings(WebDriver driver) {
		driver.findElement(Constants.HEADER_USER_MENU).click();
		driver.findElement(Constants.USER_SETTINGS).click();
	}
	
	public static void clickHeaderUserProfile(WebDriver driver) {
		driver.findElement(Constants.HEADER_USER_MENU).click();
		driver.findElement(Constants.USER_PROFILE).click();
	}
	
	public static void clickSignOut(WebDriver driver) {
		driver.findElement(Constants.HEADER_USER_MENU).click();
		driver.findElement(Constants.USER_SIGN_OUT).click();
	}
	
}
