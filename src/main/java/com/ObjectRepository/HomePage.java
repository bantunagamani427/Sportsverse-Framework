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

public class HomePage {

	WebDriver driver;


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//button[@class='best-btn']")
	private WebElement downLoadAppbtn;
	public WebElement getdownLoadAppbtn() {
		return downLoadAppbtn;
	}

	@FindBy(xpath= "//h4[normalize-space()='Trade Now']")
	private WebElement TradeNowLink;
	public WebElement getTradeNowLink() {
		return TradeNowLink;
	}

	@FindBy(xpath= "//div[@class='trade-close']")
	private WebElement TradeNowClose;
	public WebElement getTradeNowClose() {
		return TradeNowClose;
	}



	@FindBy(xpath= "//div[@class=\"col-lg-6 pt-5 largest-platform\"]")
	private WebElement India1stTxt;
	public WebElement getIndia1stTxt() {
		return India1stTxt;
	}

	@FindBy(xpath= "//div[@class=\"row hitting-section\"]")
	private WebElement hittingItOffTxt;
	public WebElement gethittingItOffTxt() {
		return hittingItOffTxt;
	}

	@FindBy(xpath= "//div[@class=\"col-xl-4\"]")
	private WebElement SportsExchangeTxt;
	public WebElement getSportsExchangeTxt() {
		return SportsExchangeTxt;
	}

	@FindBy(xpath= "//div[@class=\"col-xl-7\"]")
	private WebElement SportsExchangeboxesTxt;
	public WebElement getSportsExchangeboxesTxt() {
		return SportsExchangeboxesTxt;
	}

	@FindBy (xpath= "//img[@class=\"screen mobile-small-responsive\"]")
	private WebElement howItWorks1stImage;
	public WebElement gethowItWorks1stImage() {
		return howItWorks1stImage;
	}

	@FindBy (xpath= "//div[@class=\"col-md-5 screen-right-div \"]")
	private WebElement howItInstallTxt;
	public WebElement gethowItInstallTxt() {
		return howItInstallTxt;
	}

	@FindBy(xpath= "//div[@class=\"col-md-4 m-auto\"]")
	private WebElement howItWorks2ndImage;
	public WebElement gethowItWorks2ndImage() {
		return howItWorks2ndImage;	
	}

	@FindBy(xpath="//div[@class=\"col-md-5 screen-right-div\"]")
	private WebElement SecondImagetxt;
	public WebElement getSecondImagetxt() {
		return SecondImagetxt;
	}

	@FindBy(xpath= "//div[@class=\"col-md-6 m-auto\"]")
	private WebElement howItWorks3rdImage;
	public WebElement gethowItWorks3rdImage() {
		return howItWorks3rdImage;
	}

	@FindBy(xpath= "//section[@class=\"p-5\"]")
	private WebElement FastandSecureTxt;
	public WebElement getFastandSecureTxt() {
		return FastandSecureTxt;
	}

	@FindBy(id="v0")
	private WebElement RoadMap;
	public WebElement getRoadMap() {
		return RoadMap;
	}

	
	@FindBy(xpath= "//h2[@class='btn-h']")
	private WebElement ImagedownloadApp1;
	public WebElement getImagedownloadApp1() {
		return ImagedownloadApp1;
	}

	@FindBy(xpath="//div[@class=\"d-flex icons-section pt-4\"]")
	private WebElement OurCommunitysocialMediaIcons;
	public void OurCommunitysocialMediaIcons(WebDriver driver) throws InterruptedException {
		List<WebElement> socialMediaIcons = OurCommunitysocialMediaIcons.findElements(By.tagName("a"));
		WebDriverUtil driverutil=new WebDriverUtil(driver);
		Actions actions=new Actions(driver);
		for(WebElement socialMediaIcon:socialMediaIcons) {
			actions.moveToElement(socialMediaIcon).click().perform();
			Thread.sleep(3000);
			driverutil.switchToChildWindowAndClose(driver);
		}
	}

	/*
	 *  @FindBy(xpath="//div[@class=\"footer-meta-social \"]")
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
					 Thread.sleep(3000);
				 }
			 }
			 driver.close();
			 Thread.sleep(4000);
			 driver.switchTo().window(parentWindow);
		 }
	 }

	 */

	@FindBy(xpath="//div[@class='accordion accordion-flush']")
	private WebElement footerfaqContainer;	
	public List<WebElement> getFooterFAQLinks() {
		return footerfaqContainer.findElements(By.tagName("h2"));
	}

	
	
	
	/*
	 * 	public void FooterFAQLinks(WebDriver driver) {
		List<WebElement> footerFaqLinks = footerfaqContainer.findElements(By.tagName("h2"));


    @Test
    public void testFAQLinks() throws InterruptedException {
        Actions act = new Actions(driver);
        for (WebElement faqLink : faqPage.getFooterFAQLinks()) {
            act.moveToElement(faqLink).click().perform();
            Thread.sleep(1000);
            faqLink.click();
        }
        System.out.println("Each FAQ link is clicked");
    }
	 */
	@FindBy(xpath="//div[@class=\"footer-meta-social \"]")
	private WebElement footerSocialMediaContainer;
	public List<WebElement> getFooterSocialMediaLinks() {
		return footerSocialMediaContainer.findElements(By.tagName("a"));
	}
}
