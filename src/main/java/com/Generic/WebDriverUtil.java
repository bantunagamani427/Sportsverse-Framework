
package com.Generic;


import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ObjectRepository.HomePage;

/*
 * 
 * @author :nagamani
 * @ description: this class is going to create all the classes to reduce the code
 */
public class WebDriverUtil {
	WebDriver driver ;
	private WebElement[] socialMediaIcons;

	public WebDriverUtil(WebDriver driver)
	{
		this.driver=driver;
	}

	public void maximiseWindow() {
		driver.manage().window().maximize();
	}

	public void pageLoadTimeout() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void waitanClick(WebElement element){
		
		WebDriverWait wait=new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void invisibiltyOfElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void presenceOfElement(By Locator) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	}
	/*
	 *  public void waitForElement(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
	 */

	public void selectDD(String visibletext,WebElement element) 
	{
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}

	public void selectDD(WebElement element,String value) 
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectDD(WebElement element,int index) 
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void moveToelement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void scrollPageDown(WebDriver driver, int pixels) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0," + pixels + ")");

		//WebdriverUtility util = new WebdriverUtility();
		//util.scrollPageDown(driver, 16000);
	}
	
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void dragAndDrop(WebElement source,WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void backToPage() {
		driver.navigate().back();
	}

	public String pageTitle() {
		return driver.getTitle();
	}

	public String CurrentURL() {
		return driver.getCurrentUrl();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void setWindowSize(int width, int height) {
		Dimension size=new Dimension(width, height);
		driver.manage().window().setSize(size);

		//driverutil.setWindowSize(1536,731);
	}

	public void TakeScreenshot() throws IOException {
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);

		String filePath="copy path";

		File dest=new File(filePath);
		FileUtils.copyFile(src, dest);
	}

	public void clickSocialMediaIcons() throws InterruptedException {
		Actions actions = new Actions(driver);
		for(WebElement socialMediaIcon: socialMediaIcons) {
			actions.moveToElement(socialMediaIcon).click().perform();
			Thread.sleep(3000);
			String parentWindow = driver.getWindowHandle();
			Set<String> childWindows = driver.getWindowHandles();
			for(String childWindow: childWindows) {
				if(!childWindow.equals(parentWindow)) {
					driver.switchTo().window(childWindow);
				}
			}
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parentWindow);
		}
	}

	public static String switchToChildWindowAndClose(WebDriver driver) throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		for(String childWindow:childWindows) {
			if(!childWindow.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
			}
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		return parentWindow;
	}
}

/*
 *  public static String switchToChildWindowAndClose(WebDriver driver) {
    String parentWindow = driver.getWindowHandle();
    Set<String> childWindows = driver.getWindowHandles();
    for (String childWindow : childWindows) {
      if (!childWindow.equals(parentWindow)) {
        driver.switchTo().window(childWindow);
        driver.close();
      }
    }
    driver.switchTo().window(parentWindow);
    return parentWindow;
  }


  //call switchwindow method to test case

  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadAndTradeTest {

  public static void main(String[] args) throws InterruptedException {
    // Instantiate the WebDriver and navigate to the desired URL
    WebDriver driver = new FirefoxDriver();
    driver.get("https://example.com");

    // Find the download button using a locator and perform a hover action using the Actions class.
    // Then, click on the button and wait for the download to complete.
    WebElement downloadButton = driver.findElement(By.xpath("//button[@class='best-btn']"));
    Actions actions = new Actions(driver);
    actions.moveToElement(downloadButton).click().perform();
    Thread.sleep(3000);

    // Switch to the child window and close it, then switch back to the parent window.
    String parentWindow = WebDriverUtility.switchToChildWindowAndClose(driver);

    // Find the "Trade Now" button using a locator and click on it.
    WebElement tradeNowButton = driver.findElement(By.xpath("//h4[normalize-space()='Trade Now']"));
    tradeNowButton.click();

    // Close the WebDriver instance.
    driver.quit();
  }
}

 */







