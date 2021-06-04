package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Constants;

public class Homepage {
	
	public static void clickLoginLink(WebDriver driver) {
		driver.findElement(Constants.LOGIN_HOME).click();
	}
	
	public static void closePopup(WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.POPUP_HOME)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickAboutUs(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(Constants.HEADER_ABOUT_US)).build().perform();
		driver.findElement(Constants.ABOUT_ABOUT_US).click();
	}

}
