package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Constants;

public class LoginPage {
	
	
	public static void enterUsername(WebDriver driver, String username) {
		driver.findElement(Constants.INPUT_USERNAME).sendKeys(username);
	}
	
	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(Constants.INPUT_PASSWORD).sendKeys(password);
	}
	
	public static void clickLoginBtn(WebDriver driver, WebDriverWait wait) {
		driver.findElement(Constants.CLICK_LOGIN).click();
		try {
			wait.until(ExpectedConditions.titleContains("Dashboard"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
