package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Learn1Page {

	WebDriver driver;

	public Learn1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Learn']")
	private WebElement learnDD;
	public WebElement getlearnDD() {
		return learnDD;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Learn')]")
	private WebElement learn1Txt;
	public WebElement getlearn1Txt() {
		return learn1Txt;
	}
	
	
	
	@FindBy(xpath= "//h3[normalize-space()='download app']")
	private WebElement downloadApp;
	public WebElement getdownloadApp() {
		return downloadApp;
	}

	@FindBy(xpath= "//div[@class=\"container  learn-bg p-5 \"]")
	private WebElement learnTheWorldTxt;
	public WebElement getlearnTheWorldTxt() {
		return learnTheWorldTxt;
	}

	@FindBy(xpath= "//div[@class=\"row different-how-can-you-section\"]")
	private WebElement HowCanYouEarn;
	public WebElement getHowCanYouEarn() {
		return HowCanYouEarn;
	}

	@FindBy(xpath= "//div[@class=\"row px-2\"]")
	private WebElement whatAreYourGoodsTxt;
	public WebElement getwhatAreYourGoodsTxt() {
		return whatAreYourGoodsTxt;
	}

	@FindBy(xpath= "//h1[@class=\"all-depends-heading pt-5 pb-5\"]")
	private WebElement ItAllDependsOnTxt;
	public WebElement getItAllDependsOnTxt() {
		return ItAllDependsOnTxt;
	}

	@FindBy(xpath= "//div[@class=\"row m-auto\"]")
	private WebElement ItAllDependsOnSubTxt;
	public WebElement getItAllDependsOnSubTxt() {
		return ItAllDependsOnSubTxt;
	}

	@FindBy(xpath= "//div[@class=\"excited-learn-div pt-5\"]")
	private WebElement excitedToLearnTxt;
	public WebElement getexcitedToLearnTxt() {
		return excitedToLearnTxt;
	}

	@FindBy(xpath= "//button[@class='sportsverse-101']")
	private WebElement sportsverse101Link;
	public WebElement getsportsverse101Link() {
		return sportsverse101Link;
	}

	@FindBy(xpath= "//h2[@class='btn-h']")
	private WebElement ImageDownLoadApp;
	public WebElement getImageDownLoadApp() {
		return ImageDownLoadApp;
	}
	
	
	
	

}
