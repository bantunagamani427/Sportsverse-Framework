package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[contains(@class,'header-download')]")
	private WebElement withDrawMoneyLink;
	public WebElement getwithDrawMoneyLink() {
		return withDrawMoneyLink;
	}

	@FindBy(xpath="//button[@class='header-login responsive-header-navlinks2']")
	private WebElement signUpLink;
	public WebElement getsignUpLink() {
		return signUpLink;
	}

	@FindBy(xpath="//img[@src='data:image/svg+xml,%3Csvg%20width%3D%2224%22%20height%3D%2224%22%20viewBox%3D%220%200%2024%2024%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%3Cpath%20fill-rule%3D%22evenodd%22%20clip-rule%3D%22evenodd%22%20d%3D%22M13.4142%2012L19.7782%2018.364L18.364%2019.7782L12%2013.4143L5.63604%2019.7782L4.22183%2018.364L10.5858%2012L4.22183%205.63608L5.63604%204.22187L12%2010.5858L18.364%204.22187L19.7782%205.63608L13.4142%2012Z%22%20fill%3D%22%23DFDFDF%22%2F%3E%3C%2Fsvg%3E']")
	private WebElement closeSignUp;
	public WebElement getcloseSignUp() {
		return closeSignUp;
	}
	

	@FindBy(css = ".w3ajs-modal-loader.w3a-modal__loader")
	private WebElement modalLoader;
	public WebElement getmodalLoader() {
		return modalLoader;
	}
}
