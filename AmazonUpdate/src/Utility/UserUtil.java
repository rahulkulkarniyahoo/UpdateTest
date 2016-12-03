/**
 * 
 */
package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Rahul
 *
 */
public class UserUtil {
	
	static WebDriver driver;

	public static WebElement waitForPageUnitElementIsPresent(By locator, int maxSeconds) {
		return (new WebDriverWait(driver, maxSeconds))
				.until(ExpectedConditions
				.visibilityOfElementLocated(locator));
	}
}
