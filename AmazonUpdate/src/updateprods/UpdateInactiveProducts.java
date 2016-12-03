/**
 * 
 */
package updateprods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.UserUtil;

/**
 * @author Rahul
 *
 */
public class UpdateInactiveProducts {
	
		  private WebDriver driver;
		  private String baseUrl;
		  private boolean acceptNextAlert = true;
		  private StringBuffer verificationErrors = new StringBuffer();

		  @Before
		  public void setUp() throws Exception {
/*			 System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
			  
		    driver = new FirefoxDriver();
		    */
		    System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    baseUrl = "https://sellercentral.amazon.com/";
		    driver.manage().window().maximize();
		  }

		  @Test
		  public void testUntitled() throws Exception {
		    driver.get(baseUrl);
		    Thread.sleep(5000);
		    //UserUtil.waitForPageUnitElementIsPresent(By.id("ap_email"), 1200);
		    driver.findElement(By.id("ap_email")).clear();
		    driver.findElement(By.id("ap_email")).sendKeys("");
		    driver.findElement(By.id("ap_password")).clear();
		    driver.findElement(By.id("ap_password")).sendKeys("");
		    driver.findElement(By.id("signInSubmit")).click();
		    Thread.sleep(4000);
		    //UserUtil.waitForPageUnitElementIsPresent(By.linkText("Manage Inventory"), 1200);
		    driver.findElement(By.linkText("Manage Inventory")).click();
		    Thread.sleep(5000);
		    //UserUtil.waitForPageUnitElementIsPresent(By.xpath("(//input[@name='LISTINGS_VIEW'])[3]"), 1200);
		    driver.findElement(By.xpath("(//input[@name='LISTINGS_VIEW'])[3]")).click();
		    
		    System.out.println("Came till here //input[@name='LISTINGS_VIEW'])[3]");
		    System.out.println("Now Sleeping");
		    Thread.sleep(5000);
		    System.out.println("Stopped Sleeping");
		    
		    System.out.println("I got 1= " + driver.findElement(By.xpath("//tr[2]/td[6]/div/div/div/div/span")).getText());
		    System.out.println("I got 1 a= " + driver.findElement(By.xpath("//td[7]/div/div[2]/div/span")).getText());
		    System.out.println("I got 2= " + driver.findElement(By.xpath("//tr[100]/td[6]/div/div/div/div/span")).getText());
			System.out.println("I got 2 a= " + driver.findElement(By.xpath("//tr[100]/td[7]/div/div[2]/div/span")).getText());	 
		    
		    
		    
		    
		    
		   // driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
	/*	    WebElement ele1 = driver.findElement(By.id("//button[@id='a-autoid-4-announce']"));
		    if (ele1.isDisplayed()){
		    	System.out.println("At least displayed");
		    }
		    if (ele1.isEnabled()){
		    	System.out.println("At least enabled");
		    }
		    
		    if (ele1.isSelected()){
		    	System.out.println("At least selected");
		    }
		    */
		   // driver.findElement(By.id("//button[@id='a-autoid-4-announce']//span[text()='Edit']")).click();
		   // driver.findElement(By.cssSelector("#a-autoid-4-announce")).click();
		   // driver.findElement(By.xpath("//button[contains(text),'Edit']")).click();
		   // driver.findElement(By.xpath("//span/span/span/button")).click();
		    Thread.sleep(2000);
		   // driver.findElement(By.id("dropdown1_1")).click();
		    System.out.println("Came till here dropdown1_1");
		    
		/*    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | selenium_blank85107 | 30000]]
		    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		    driver.findElement(By.id("dropdown2_1")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | selenium_blank98313 | 30000]]
		    driver.findElement(By.xpath("(//button[@type='button'])[16]")).click();
		    driver.findElement(By.id("dropdown3_1")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | selenium_blank94702 | 30000]]
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=selenium_blank75135 | ]]
*/		    driver.findElement(By.id("tang_description-tab")).click();
		    Assert.assertTrue(isElementPresent(By.cssSelector("#tang_description-tab > span.icon")));
		    driver.findElement(By.id("product_description")).clear();
		    driver.findElement(By.id("product_description")).sendKeys("<h3>Luxurious 2 carat Green Emerald and Diamond Classic Engagement Ring in Rose Gold</h3>Our experienced jewelers have worked hard to make this stunning low priced Cheap Emerald Engagement Ring from JeenJewels. The inexpensive Emerald Engagement ring from JeenJewels can be made of White Gold, Yellow Gold or Rose Gold. <p>Order your beautiful Emerald Engagement Ring from JeenJewels today and not miss out on the biggest sale of the year. This affordable Emerald Engagement Ring from JeenJewels comes with its own beautiful Jewelry box. This JeenJewels low priced discount Emerald Engagement Ring is sure to make her heart skip a beat without a toll on your wallet.</p><h3>Key features</h3><ul><li>Total Carat Weight : 1.50 Carats<li>Center Stone Cut : Emerald Cut</li><li>Center Stone Weight : 1.50 Carats</li><li>Gold Quality : 10k</li><li>Gold Color : Rose gold</li><li>Stone Color : Green</li><li>Centre Stone Clarity : AAA Grade </li><li>Side Stone Color : I-J Color</li><li>Side Stone Clarity : I1-I2 Clarity </li><li>Get shipping without cost in USA 50 States</li></ul><p>Real Gemstone(s). Jewelry box includes at no cost to you with all purchases. For any customization and engraving request please contact us. This listing is specific to the gold and gemstone cut as mentioned, but can be customized to 10K/14k/18K White Gold, Yellow Gold or Rose Gold. We can also customize centre gemstone (if any) to Round Cut Emerald gemstone or Princess Cut Emerald gemstone. All our rings are made of solid gold or silver as per listing and stamped for authentication.</p>");
		    driver.findElement(By.id("product_description")).clear();
		    driver.findElement(By.id("product_description")).sendKeys("<h3>Luxurious 2 carat Green Emerald and Diamond Classic Engagement Ring in Rose Gold</h3>Our experienced jewelers have worked hard to make this stunning low priced Cheap Emerald Engagement Ring from JeenJewels. The inexpensive Emerald Engagement ring from JeenJewels can be made of White Gold, Yellow Gold or Rose Gold. <p>Order your beautiful Emerald Engagement Ring from JeenJewels today and not miss out on the biggest sale of the year. This affordable Emerald Engagement Ring from JeenJewels comes with its own beautiful Jewelry box. This JeenJewels low priced discount Emerald Engagement Ring is sure to make her heart skip a beat without a toll on your wallet.</p><h3>Key features</h3><ul><li>Total Carat Weight : 1.50 Carats<li>Center Stone Cut : Emerald Cut</li><li>Center Stone Weight : 1.50 Carats</li><li>Gold Quality : 10k</li><li>Gold Color : Rose gold</li><li>Stone Color : Green</li><li>Centre Stone Clarity : AAA Grade </li><li>Side Stone Color : I-J Color</li><li>Side Stone Clarity : I1-I2 Clarity </li><li>Get shipping without cost in USA 50 States</li></ul><p>Real Gemstone(s). Jewelry box includes at no cost to you with all purchases. For any customization and engraving request please contact us. This listing is specific to the gold and gemstone cut as mentioned, but can be customized to 10K/14k/18K White Gold, Yellow Gold or Rose Gold. We can also customize centre gemstone (if any) to Round Cut Emerald gemstone or Princess Cut Emerald gemstone. All our rings are made of solid gold or silver as per listing and stamped for authentication.</p>");
		    Assert.assertTrue(isElementPresent(By.id("main_submit_button")));
		    driver.findElement(By.id("main_submit_button")).click();
		    driver.findElement(By.xpath("(//input[@name='LISTINGS_VIEW'])[3]")).click();
		    try {
		      Assert.assertEquals("SEPWR10k1258766SZ8513111", driver.findElement(By.cssSelector("div.clamped.wordbreak > div.mt-text.mt-wrap-bw > span.mt-text-content.mt-table-main")).getText());
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		  }

		  @After
		  public void tearDown() throws Exception {
		 //   driver.quit();
		   
		  }

		  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

		  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }

		  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
		


}
