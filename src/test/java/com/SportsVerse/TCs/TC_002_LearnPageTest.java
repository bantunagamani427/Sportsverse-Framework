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
       
		//Clicking on download app
		
		WebElement downloadappLink=learnPage.getdownloadApp();
		driverUtil.moveToelement(downloadappLink);
		downloadappLink.click();

		Thread.sleep(2000);
		driverUtil.switchToChildWindowAndClose(driver);

		//Getting the how can you earn text 
		
		System.out.println(learnPage.getHowCanYouEarn().getText());

		System.out.println("****************************");

		//getting the what are yur goods text 
		
		System.out.println(learnPage.getwhatAreYourGoodsTxt().getText());

		System.out.println("*****************************");
        
		//all depends on text
		
		System.out.println(learnPage.getItAllDependsOnTxt().getText());

		System.out.println("****************************");

		//Excited to learn text 
		
		System.out.println(learnPage.getexcitedToLearnTxt().getText());

		System.out.println("***************************");

		driverUtil.scrollPageDown(driver, 3100);

		Thread.sleep(4000);

		//Clicking on sportsverse 101 link 
		
		WebElement sportsverse101Link=learnPage.getsportsverse101Link();

		driverUtil.moveToelement(sportsverse101Link);

		sportsverse101Link.click();

		System.out.println("Sportsverse101 link is clicked");

		Thread.sleep(2000);

		driverUtil.backToPage();

		Thread.sleep(2000);

		//clicking on download app link of image   
		
		WebElement imageDownloadApp=learnPage.getImageDownLoadApp();
		driverUtil.moveToelement(imageDownloadApp);
		imageDownloadApp.click();

		driverUtil.switchToChildWindowAndClose(driver);

		System.out.println("Image Download app is clicked");

		driverUtil.scrollPageDown(driver, 750);
		Thread.sleep(4000);

		HomePage homepage=new HomePage(driver);

		//Getting the FAQ'S text and clicking on each FAQ
		
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
