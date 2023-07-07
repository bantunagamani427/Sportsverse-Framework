package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FanTokensPage {

	WebDriver driver;
	
	public FanTokensPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[normalize-space()='download app']")
	private WebElement downloadApp;
	public WebElement getdownloadApp() {
		return downloadApp;
	}
	
	@FindBy(xpath = "//li[normalize-space()='Live Tokens']")
	private WebElement liveTokensLink;
	public WebElement getliveTokensLink() {
		return liveTokensLink;
	}
	
	@FindBy(xpath = "//a[normalize-space()='Contact Support']")
	private WebElement contactSupportLink;
	public WebElement getcontactSupportLink() {
		return contactSupportLink;
	}
	
	@FindBy(xpath = "//h2[@class='btn-h']")
	private WebElement ImageDownloadApp;
	public WebElement getImageDownloadApp() {
		return ImageDownloadApp;
	}
	
	
	
	
	
	

	
	
	
	
	
	
}
