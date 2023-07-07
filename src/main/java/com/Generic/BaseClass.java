package com.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ObjectRepository.FooterLinksPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;

	WebDriverUtil driverUtil;

	public static WebDriver sdriver;

	PropertyFile propertyfile=PropertyFile.getObjectPropfile();

	@BeforeSuite

	public void connectToDatabse() {
		System.out.println("start connection to database");
	}

	@AfterSuite

	public void closeDatabase() {
		System.out.println("close connection to database");
	}

	@BeforeClass

	public void launchBrowser() throws IOException {

		String browser=propertyfile.readDatafromPropfile("browser");

		System.out.println(browser);

		if(browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}

		else {
			System.out.println("browser not found");
		}

		driverUtil=new WebDriverUtil(driver);
		String url=propertyfile.readDatafromPropfile("URL");

		driver.get(url);

		sdriver=driver;
	}
	
	@AfterClass

	public void closeBrowser() {
		driverUtil.closeBrowser();
	}

	@BeforeMethod

	public void loginToAppln() throws InterruptedException {

		driverUtil.maximiseWindow();

		driverUtil.pageLoadTimeout();

		// clicking on withdrawmoney & signup

		LoginPage loginpage=new LoginPage(driver);

		//driverUtil.presenceOfElement(By.id("v0"));
		
		loginpage.getwithDrawMoneyLink().click();
		Thread.sleep(2000);
		System.out.println("withDraw Money is clicked");
		driverUtil.backToPage();

		//clicking on signUp
/*
		loginpage.getsignUpLink().click();
		Thread.sleep(3000);
		System.out.println("sign Up is clicked");
		
		
		WebElement signUpClose = loginpage.getcloseSignUp();
		//driverUtil.invisibiltyOfElement(loginpage.getmodalLoader());

		driverUtil.moveToelement(signUpClose);
		signUpClose.click();
		Thread.sleep(2000);
		System.out.println("sign up closed");
*/
	}

	@AfterMethod

	public void footerLogout() throws InterruptedException {

		Thread.sleep(5000);
		//clicking on Social media links
		HomePage homepage= new HomePage(driver);

		driverUtil.scrollPageDown(driver, 20000);
		driverUtil.setWindowSize(1536, 731);
		driverUtil.maximiseWindow();

		FooterLinksPage footerlinks=new FooterLinksPage(driver);
		footerlinks.clickSocialMediaIcons(driver);

		//clicking on footerLinks

		//clicking on home Link

		WebElement homeLink=footerlinks.gethomeLink();
		driverUtil.moveToelement(homeLink);
		homeLink.click();
		Thread.sleep(3000);
		driverUtil.backToPage();
		Thread.sleep(3000);
		System.out.println("home link is clicked");	

		driverUtil.scrollPageDown(driver, 20000);
		driverUtil.setWindowSize(1536, 731);
		driverUtil.maximiseWindow();



		//clicking on Learn1

		WebElement learn1Link=footerlinks.getlearn1Link();
		driverUtil.moveToelement(learn1Link);
		learn1Link.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("learn1 link is clicked");

		//clicking on Sportsverse101

		WebElement learn2Link = footerlinks.getlearn2Link();
		driverUtil.moveToelement(learn2Link);
		learn2Link.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("learn2 link is clicked");

		//clicking on RoadMap

		WebElement roadmapLink = footerlinks.getroadMapLink();
		driverUtil.moveToelement(roadmapLink);
		roadmapLink.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("RoadMap page is clicked");

		//clicking on Fan Tokens

		WebElement fanTokensLink = footerlinks.getfanTokensLink();
		driverUtil.moveToelement(fanTokensLink);
		fanTokensLink.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("Fan Tokens Link is Cliked");

		//clicking on About Us

		WebElement aboutUsLink=footerlinks.getaboutUsLink();
		driverUtil.moveToelement(aboutUsLink);
		aboutUsLink.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("aboutUs Link is clicked");

		//clicking on Career Link

		WebElement catreerLink = footerlinks.getcareerLink();
		driverUtil.moveToelement(catreerLink);
		catreerLink.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("Career link is clicked");

		//clicking on Support Link

		WebElement supportLink=footerlinks.getsupportLink();
		driverUtil.moveToelement(supportLink);
		supportLink.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("Support link is clicked");

		//clicking on PrivacyPolicy Link

		WebElement privacyPolicyLink=footerlinks.getprivacyPolicyLink();
		driverUtil.moveToelement(privacyPolicyLink);
		privacyPolicyLink.click();
		Thread.sleep(2000);
		driverUtil.switchToChildWindowAndClose(driver);
		Thread.sleep(2000);
		System.out.println("Privacy policy link is clicked");

		//clicking on Contact Us Link

		WebElement contactUsLink=footerlinks.getcontactUsLink();
		driverUtil.moveToelement(contactUsLink);
		contactUsLink.click();
		Thread.sleep(2000);
		driverUtil.backToPage();
		Thread.sleep(2000);
		System.out.println("Contact Us Link is clicked");

		System.out.println("all footer links are clicked one by one");
	}

	public static String takesScreenshot(String name) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);

		//String path=IAutoconsts.screenshotpath+name+".png";

		File dest=new File("");

		Files.copy(src, dest);	
		return name;//path
	}
}
