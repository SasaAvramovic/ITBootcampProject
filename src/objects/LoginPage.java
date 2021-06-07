package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Constants;

public class LoginPage {
	
	
	public static void enterUsername(WebDriver driver) {
		driver.findElement(Constants.INPUT_USERNAME).sendKeys(Constants.USER);
	}
	
	public static void enterPassword(WebDriver driver) {
		driver.findElement(Constants.INPUT_PASSWORD).sendKeys(Constants.PASSWORD);
	}
	
	public static void clickLoginBtn(WebDriver driver, WebDriverWait wait) {
		driver.findElement(Constants.CLICK_LOGIN).click();
		try {
			wait.until(ExpectedConditions.titleContains("Dashboard"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void login(WebDriver driver, WebDriverWait wait) {
		driver.findElement(Constants.INPUT_USERNAME).sendKeys(Constants.USER);
		driver.findElement(Constants.INPUT_PASSWORD).sendKeys(Constants.PASSWORD);
		driver.findElement(Constants.CLICK_LOGIN).click();
	}
	
}
