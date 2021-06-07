package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import resources.Constants;

public class Settings {
	
	public static void selectLanguage(WebDriver driver, String language) {
		Select dropdown = new Select(driver.findElement(Constants.SETTINGS_LANGUAGE));
		dropdown.selectByVisibleText(language);
	}

	public static void notificationsOff(WebDriver driver) {
		if (driver.findElement(Constants.SETTINGS_NOTIFICATIONS_EMAIL).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIFICATIONS_EMAIL).click();
		}
		if (driver.findElement(Constants.SETTINGS_NOTIFICATIONS_SMS).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIFICATIONS_SMS).click();
		}
		if (driver.findElement(Constants.SETTINGS_NOTIFICATIONS_PUSH).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIFICATIONS_PUSH).click();
		}
		Settings.clickSaveSettings(driver);
	}
	
	public static void notificationsOn(WebDriver driver) {
		if (!driver.findElement(Constants.SETTINGS_NOTIFICATIONS_EMAIL).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIFICATIONS_EMAIL).click();
		}
		if (!driver.findElement(Constants.SETTINGS_NOTIFICATIONS_SMS).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIFICATIONS_SMS).click();
		}
		if (!driver.findElement(Constants.SETTINGS_NOTIFICATIONS_PUSH).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIFICATIONS_PUSH).click();
		}
		Settings.clickSaveSettings(driver);
	}
	
	public static void clickSaveSettings(WebDriver driver) {
		driver.findElement(Constants.SETTINGS_SAVE).click();
	}
}
