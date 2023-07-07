package com.ObjectRepository;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.WebDriverUtil;

public class FooterLinksPage {

	WebDriver driver;
	WebDriverUtil driverutil;

	public FooterLinksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(tagName="footer")
	private WebElement footerPresent;	
	public WebElement getfooterPresent() {
		return footerPresent;
	}
	
	
	 @FindBy(xpath="//div[@class=\"footer-meta-social \"]")
	 private WebElement footerSocialMediaContainer;

	 public void clickSocialMediaIcons(WebDriver driver) throws InterruptedException {
		 List<WebElement> socialMediaIcons = footerSocialMediaContainer.findElements(By.tagName("a"));
		 Actions actions = new Actions(driver);
		 String parentWindow = driver.getWindowHandle();

		 for (WebElement socialMediaIcon : socialMediaIcons) {
			 actions.moveToElement(socialMediaIcon).click().perform();
			 Thread.sleep(4000);

			 Set<String> childWindows = driver.getWindowHandles();
			 for (String childWindow : childWindows) {
				 if (!childWindow.equals(parentWindow)) {
					 driver.switchTo().window(childWindow);
					 Thread.sleep(2000);
				 }
			 }
			 driver.close();
			 Thread.sleep(3000);
			 driver.switchTo().window(parentWindow);
		 }
	 }

	 
	 

	 @FindBy(xpath= "//li[normalize-space()='Home']")
	 private WebElement homeLink;
	 public WebElement gethomeLink() {
		 return homeLink;
	 }

	 @FindBy(xpath= "//li[normalize-space()='Learn']")
	 private WebElement learn1Link;
	 public WebElement getlearn1Link() {
		 return learn1Link;
	 }

	 @FindBy(xpath= "//li[normalize-space()='Sportsverse 101']")
	 private WebElement learn2Link;
	 public WebElement getlearn2Link() {
		 return learn2Link;
	 }

	 @FindBy(xpath = "//li[normalize-space()='Roadmap']")
	 private WebElement roadMapLink;
	 public WebElement getroadMapLink() {
		 return roadMapLink;
	 }

	 @FindBy(xpath = "//li[normalize-space()='Fan Tokens']")
	 private WebElement fanTokensLink;
	 public WebElement getfanTokensLink() {
		 return fanTokensLink;
	 }

	 @FindBy(xpath = "//li[normalize-space()='About us']")
	 private WebElement aboutUsLink;
	 public WebElement getaboutUsLink() {
		 return aboutUsLink;
	 }

	 @FindBy(xpath = "//li[normalize-space()='Career']")
	 private WebElement careerLink;
	 public WebElement getcareerLink() {
		 return careerLink;
	 }

	 @FindBy(xpath = "//li[normalize-space()='Support']")
	 private WebElement supportLink;
	 public WebElement getsupportLink() {
		 return supportLink;
	 }

	 @FindBy(xpath = "//li[normalize-space()='Privacy Policy']")
	 private WebElement privacyPolicyLink;
	 public WebElement getprivacyPolicyLink() {
		 return privacyPolicyLink;
	 }

	 @FindBy(xpath = "//a[normalize-space()='Contact us']")
	 private WebElement contactUsLink;
	 public WebElement getcontactUsLink() {
		 return contactUsLink;
	 }
}



