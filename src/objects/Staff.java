package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Constants;

public class Staff {
	
	public static void clickAddEmployees(WebDriver driver) {
		driver.findElement(Constants.STAFF_ADD).click();
	}

	public static void clickSave(WebDriver driver) {
		driver.findElement(Constants.STAFF_SAVE).click();
	}

	public static void clickEmployees(WebDriver driver) {
		driver.findElement(Constants.STAFF_EMPLOYEES).click();
	}
	
	public static void clickAllStaff(WebDriver driver) {
		driver.findElement(Constants.STAFF_ALL_STAFF).click();
	}
	
	public static void clickCheckbox(WebDriver driver) {
		driver.findElement(Constants.STAFF_CHECKBOX).click();
	}
	
	public static void clickBulkEdit(WebDriver driver) {
		driver.findElement(Constants.STAFF_BULK_EDIT).click();
	}
	
	public static void clickManageUser(WebDriver driver) {
		driver.findElement(Constants.STAFF_MANAGE_USER).click();
	}
	
	public static void clickNextStep(WebDriver driver) {
		driver.findElement(Constants.STAFF_NEXT_STEP).click();
	}

	public static void clickConfirm(WebDriver driver) {
		driver.findElement(Constants.STAFF_CONFIRM).click();
	}
	
	public static void clickStaffName(WebDriver driver) {
		driver.findElement(Constants.STAFF_CLICK_NAME).click();
	}
	
	public static void clickEditStaff(WebDriver driver) {
		driver.findElement(Constants.STAFF_CLICK_EDIT).click();
	}
	
	public static void rename(WebDriver driver, WebDriverWait wait, String photo) {
		Staff.clickStaffName(driver);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Constants.STAFF_CLICK_EDIT)));
		Staff.clickEditStaff(driver);
		driver.findElement(Constants.STAFF_UPLOAD_PHOTO).clear();
		driver.findElement(Constants.STAFF_UPLOAD_PHOTO).sendKeys(photo);
		driver.findElement(Constants.EDIT_NAME).clear();
		driver.findElement(Constants.EDIT_NAME).sendKeys(Constants.STAFF_RENAME);
		driver.findElement(Constants.SAVE_EMPLOYEE).click();
	}
	
	public static void deleteAllStaff(WebDriver driver) {
		driver.navigate().to(Constants.STAFF_URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickAllStaff(driver);
		clickCheckbox(driver);
		clickBulkEdit(driver);
		clickManageUser(driver);
		clickNextStep(driver);
		clickConfirm(driver);
		driver.switchTo().alert().accept();
	}
	
	
	
	
}
