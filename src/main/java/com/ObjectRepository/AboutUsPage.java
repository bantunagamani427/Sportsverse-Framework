package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage {

	WebDriver driver;
	
	public AboutUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class=\"our-v\"]")
	private WebElement OurVisionTxt;
	public WebElement getOurVisionTxt() {
		return OurVisionTxt;
	}
	
	@FindBy(xpath = "//h3[normalize-space()='download app']")
	private WebElement downloadApp;
	public WebElement getdownloadApp() {
		return downloadApp;
	}
	
	@FindBy(xpath = "//div[@class=\"col-md-4 m-auto metalok-i\"]")
	private WebElement sportverseLogo;
	public WebElement getsportverseLogo() {
		return sportverseLogo;
	}
	
	@FindBy(xpath = "//div[@class=\" driven-by-section\"]")
	private WebElement  drivenBySafetyTxt;
	public WebElement getdrivenBySafety() {
		return drivenBySafetyTxt;
	}
	
	@FindBy(xpath = "//div[@class=\" driven-by-section\"]")
	private WebElement drivenBySafetyImages;
	public List<WebElement> getdrivenBySafetyImages() {
		return drivenBySafetyImages.findElements(By.tagName("img"));
	}
	
	
	@FindBy(xpath = "//div[@class=\"slick-track\"]")
	private WebElement ourTeamImages;
	public List<WebElement> getourTeamImages(){
		return ourTeamImages.findElements(By.tagName("img"));
	}
	
	@FindBy(id = "name")
	private WebElement nameTxt;
	public WebElement getnameTxt() {
		return nameTxt;
	}
	
	@FindBy(id = "email")
	private WebElement emailTxt;
	public WebElement getemailTxt() {
		return emailTxt;
	}
	
	@FindBy(id = "subject")
	private WebElement subjectTxt;
	public WebElement getsubjectTxt() {
		return subjectTxt;
	}
	
	@FindBy(xpath = "//input[@type=\"radio\"]")
	private WebElement radioBtn;
	public WebElement getradioBtn() {
		return radioBtn;
	}
	
	@FindBy(id="message")
	private WebElement messageTxt;
	public WebElement getmessageTxt() {
		return messageTxt;
	}
	
	@FindBy(xpath = "//button[@class=\"submit-btn\"]")
	private WebElement submitBtn;
	public WebElement getsubmitBtn() {
		return submitBtn;
	}
	
	
	//@FindBy()
	
}
