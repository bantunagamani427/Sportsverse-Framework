package com.SportsVerse.TCs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.BaseClass;
import com.Generic.WebDriverUtil;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.Learn1Page;

public class TC_002_LearnPageTest extends BaseClass{

	@Test 
	public void learntest() throws InterruptedException {

		Learn1Page learnPage=new Learn1Page(driver);

		WebDriverUtil driverUtil=new WebDriverUtil(driver);

		//clicking on learn Dropdown

		WebElement learnDD=learnPage.getlearnDD();
		driverUtil.moveToelement(learnDD);
		learnDD.click();

		//clciking on Learn

		WebElement learn1Txt=learnPage.getlearn1Txt();
		driverUtil.moveToelement(learn1Txt);
		learn1Txt.click();

		System.out.println(learnPage.getlearnTheWorldTxt().getText());

		System.out.println("*************************");

		WebElement downloadappLink=learnPage.getdownloadApp();
		driverUtil.moveToelement(downloadappLink);
		downloadappLink.click();

		Thread.sleep(2000);
		driverUtil.switchToChildWindowAndClose(driver);

		System.out.println(learnPage.getHowCanYouEarn().getText());

		System.out.println("****************************");

		System.out.println(learnPage.getwhatAreYourGoodsTxt().getText());

		System.out.println("*****************************");

		System.out.println(learnPage.getItAllDependsOnTxt().getText());

		System.out.println("****************************");

		System.out.println(learnPage.getexcitedToLearnTxt().getText());

		System.out.println("***************************");

		driverUtil.scrollPageDown(driver, 3100);

		Thread.sleep(4000);

		WebElement sportsverse101Link=learnPage.getsportsverse101Link();

		driverUtil.moveToelement(sportsverse101Link);

		sportsverse101Link.click();

		System.out.println("Sportsverse101 link is clicked");

		Thread.sleep(2000);

		driverUtil.backToPage();

		Thread.sleep(2000);

		WebElement imageDownloadApp=learnPage.getImageDownLoadApp();
		driverUtil.moveToelement(imageDownloadApp);
		imageDownloadApp.click();

		driverUtil.switchToChildWindowAndClose(driver);

		System.out.println("Image Download app is clicked");

		driverUtil.scrollPageDown(driver, 750);
		Thread.sleep(4000);

		HomePage homepage=new HomePage(driver);

		Actions act=new Actions(driver);
		List<WebElement> footerFAQLinks = homepage.getFooterFAQLinks();

		for( WebElement footerFAQLink:footerFAQLinks) {
			driverUtil.waitanClick(footerFAQLink);

			Thread.sleep(2000);
			act.moveToElement(footerFAQLink, footerFAQLink.getSize().getWidth() / 2, footerFAQLink.getSize().getHeight() / 2).click().perform();

			Thread.sleep(1000);

			System.out.println("Each FAQ Text: "+footerFAQLink.getText());

			footerFAQLink.click();

			driverUtil.scrollPageDown(driver, 50);
			Thread.sleep(2000);
		}
		System.out.println("Learn1 Page is executed successfully ");
	}
}
