package com.SportsVerse.TCs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.BaseClass;
import com.Generic.WebDriverUtil;
import com.ObjectRepository.Learn1Page;
import com.ObjectRepository.SportsVerse101;

public class TC_003_SportsVerse101Test extends BaseClass{

	@Test
	public void sportverse101test() throws InterruptedException  {

		SportsVerse101 learn2Page=new SportsVerse101(driver);

		WebDriverUtil driverUtil=new WebDriverUtil(driver);

		Learn1Page learn1Page=new Learn1Page(driver);
            //Click on Learn Drop down  
		
		WebElement learnDD=learn1Page.getlearnDD();
		driverUtil.moveToelement(learnDD);
		learnDD.click();
         //Click on Sportsverse 101
		WebElement sportsverse101DD=learn2Page.getSportsVerse101DD();
		driverUtil.moveToelement(sportsverse101DD);
		sportsverse101DD.click();

		Thread.sleep(2000);

		WebElement downloadApp=learn2Page.getdownLoadApp();
		driverUtil.moveToelement(downloadApp);
		downloadApp.click();

		driverUtil.switchToChildWindowAndClose(driver);

		System.out.println("DownLoadApp is clicked");

		driverUtil.scrollPageDown(driver, 150);
		WebElement basicsLink=learn2Page.getbasicsFAQ();
		driverUtil.moveToelement(basicsLink);
		basicsLink.click();

		List<WebElement> BasicFAQLinks = learn2Page.getbasicFAQContainer();
		Actions act=new Actions(driver);

		for(WebElement BasicFAQLink:BasicFAQLinks) {

			driverUtil.waitanClick(BasicFAQLink);

			Thread.sleep(1000);
			act.moveToElement(BasicFAQLink, BasicFAQLink.getSize().getWidth() / 2, BasicFAQLink.getSize().getHeight() / 2).click().perform();

			Thread.sleep(1000);

			System.out.println("Each FAQ Text: "+BasicFAQLink.getText());

			BasicFAQLink.click();

			driverUtil.scrollPageDown(driver, 50);
			Thread.sleep(2000);	
		}

		System.out.println("Basic FAQ links are clicked: ");

		WebElement VideosLink=learn2Page.getvideosLink();
		driverUtil.moveToelement(VideosLink);
		VideosLink.click();
		Thread.sleep(3000);
		
		driverUtil.scrollPageDown(driver, 2000);
		driverUtil.setWindowSize(1536, 731);
		driver.manage().window().maximize();
		
		
		System.out.println(learn2Page.getItAllDependsOnTxt().getText());

		List <WebElement> allDependsSubTxts = learn2Page.getAllDependsSubTxtContainer1();

		for(WebElement allDependsSubTxt:allDependsSubTxts) {
			System.out.println(allDependsSubTxt.getText());

		}

		List<WebElement>images=learn2Page.getAlldependsImagescontainer();
		for(WebElement image:images) {
			driverUtil.moveToelement(image);
			System.out.println("each image dispalyed: "+image.isDisplayed());
		}



	}
}