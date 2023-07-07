package com.SportsVerse.TCs;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.BaseClass;
import com.Generic.WebDriverUtil;
import com.ObjectRepository.FooterLinksPage;
import com.ObjectRepository.HomePage;

public class TC_001_HomepageTest extends BaseClass{

	@Test(priority = 1)
	
	public void homepagetest() throws IOException, InterruptedException {

		WebDriverUtil driverUtil=new WebDriverUtil(driver);

		HomePage homepage=new HomePage(driver);

		//Verify the page Title is correct

		String expectedTitle="Sportsverse";
		String actualTitle=driverUtil.pageTitle();	

		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Title is correct");
		}

		else {
			System.out.println("Title is Incorrect");
		}

		//Verify that the page is secure and uses HTTPs encryption

		String currentURL=driverUtil.CurrentURL();
		if(currentURL.contains("https://")) {
			System.out.println("The page is secure");
		}
		else {
			System.out.println("The page is insecure");
		}

		//Verify that the page has footer
		FooterLinksPage footerPage=new FooterLinksPage(driver);

		WebElement footer= footerPage.getfooterPresent();
		
		if(footer.isDisplayed()) {
			System.out.println("Footer is Displayed");
		}

		else {
			System.out.println("footer is not displayed");
		}
		
		//Verify that all page Links are functional and Lead to the correct pages
		
		

		//clicking on download app

		homepage.getdownLoadAppbtn().click();
		driverUtil.switchToChildWindowAndClose(driver);

		System.out.println("download app is clicked");
		System.out.println("******************************");

		//clicking on TradeNow

		homepage.getTradeNowLink().click();
		Thread.sleep(2000);
		WebElement tradeNowClose=homepage.getTradeNowClose();
		driverUtil.moveToelement(tradeNowClose);
		tradeNowClose.click();
		Thread.sleep(2000);
		System.out.println("Trade Now is closed");
		System.out.println("***********************************");

		//printing the India's 1st text

		WebElement Indias1stTxt=homepage.getIndia1stTxt();
		System.out.println(Indias1stTxt.getText());
		System.out.println("********************************");

		driverUtil.scrollPageDown(driver, 500);

		//Printing hitting it off Text

		WebElement HittingItOffTxt=homepage.gethittingItOffTxt();
		System.out.println(HittingItOffTxt.getText());
		System.out.println("***********************");

		//Sports Exchange Text

		WebElement sportsExchangeTxt =homepage.getSportsExchangeTxt();
		System.out.println(sportsExchangeTxt.getText());
		System.out.println("*******************************");

		driverUtil.scrollPageDown(driver, 4000);
		Thread.sleep(3000);

		System.out.println("how it works 1st images dispalyed: "+homepage.gethowItWorks1stImage().isDisplayed());

		System.out.println("*********************************");

		WebElement HowItInstallTxt=homepage.gethowItInstallTxt();
		System.out.println(HowItInstallTxt.getText());

		System.out.println("************************************");

		System.out.println("how it works image 2 is dispalyed: "+homepage.gethowItWorks2ndImage().isDisplayed());

		WebElement HowItInstallImgTxt=homepage.getSecondImagetxt();

		System.out.println(HowItInstallImgTxt.getText());

		System.out.println("************************************");
		System.out.println("how it works image 3 is displayed: "+homepage.gethowItWorks3rdImage().isDisplayed());

		System.out.println("************************************");

		WebElement fastAndSecureTxt=homepage.getFastandSecureTxt();
		System.out.println(fastAndSecureTxt.getText());

		System.out.println("******************************");

		System.out.println("Road Map is displayed: "+homepage.getRoadMap().isDisplayed());

		System.out.println("*********************************");
		//driverUtil.closeBrowser();
	}
	
	@Test(priority =2)
	public void homeTest() throws InterruptedException {

		WebDriverUtil driverUtil=new WebDriverUtil(driver);

		HomePage homepage=new HomePage(driver);
		driverUtil.scrollPageDown(driver, 12000);
		Thread.sleep(2000);

		driverUtil.setWindowSize(1536, 731);
		driverUtil.maximiseWindow();

		WebElement ImageDownloadApp1=homepage.getImagedownloadApp1();
		//	driverUtil.waitanClick(ImageDownloadApp1);
		driverUtil.moveToelement(ImageDownloadApp1);
		ImageDownloadApp1.click();

		driverUtil.switchToChildWindowAndClose(driver);
		System.out.println("image download app is clicked");


		driverUtil.scrollPageDown(driver, 900);
		Thread.sleep(4000);

		homepage.OurCommunitysocialMediaIcons(driver);
		System.out.println("our community social media links are clicked");

		driverUtil.scrollPageDown(driver, 1050);
		driverUtil.setWindowSize(1536, 731);
		driverUtil.maximiseWindow();

		Thread.sleep(1000);
		List<WebElement> FaqLinks = homepage.getFooterFAQLinks();
		Actions act=new Actions(driver);
		for(WebElement FaqLink:FaqLinks) {

			driverUtil.waitanClick(FaqLink);
			// Scroll the link into view
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FaqLink);
			Thread.sleep(1000);
			act.moveToElement(FaqLink, FaqLink.getSize().getWidth() / 2, FaqLink.getSize().getHeight() / 2).click().perform();
			Thread.sleep(1000);

			// Double-click the link
			//act.moveToElement(FaqLink).click().perform();
			System.out.println("Each FAQ link Text: "+FaqLink.getText());

			FaqLink.click();
			driverUtil.scrollPageDown(driver, 50);

			Thread.sleep(1000);
		}	
		System.out.println("*************************");
		System.out.println("Each FAQ link has been clicked and get the text of each FAQ");
		
	}	
}
